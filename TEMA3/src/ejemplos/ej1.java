package ejemplos;

import java.util.*;

public class ej1 {

    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int B = sc.nextInt();
            if (B == 0) break;

            int[] barcosEsperados = new int[B];
            for (int i = 0; i < B; i++) {
                barcosEsperados[i] = sc.nextInt();
            }

            int N = sc.nextInt();
            int[][] tablero = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    tablero[i][j] = sc.nextInt();
                }
            }

            boolean[][] visitado = new boolean[N][N];
            List<Integer> barcosEncontrados = new ArrayList<>();
            boolean valido = true;

            for (int i = 0; i < N && valido; i++) {
                for (int j = 0; j < N && valido; j++) {
                    if (tablero[i][j] == 1 && !visitado[i][j]) {
                        int longitud = 1;
                        visitado[i][j] = true;

                        boolean horizontal = (j + 1 < N && tablero[i][j + 1] == 1);
                        boolean vertical   = (i + 1 < N && tablero[i + 1][j] == 1);

                        // No puede tener dos direcciones a la vez
                        if (horizontal && vertical) {
                            valido = false;
                            break;
                        }

                        if (horizontal) {
                            int y = j + 1;
                            while (y < N && tablero[i][y] == 1) {
                                visitado[i][y] = true;
                                longitud++;
                                y++;
                            }
                        } else if (vertical) {
                            int x = i + 1;
                            while (x < N && tablero[x][j] == 1) {
                                visitado[x][j] = true;
                                longitud++;
                                x++;
                            }
                        }

                        // Verificar que no toca a otros barcos
                        for (int x = 0; x < N && valido; x++) {
                            for (int y = 0; y < N && valido; y++) {
                                if (visitado[x][y]) {
                                    for (int d = 0; d < 8; d++) {
                                        int nx = x + dx[d];
                                        int ny = y + dy[d];
                                        if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                                            if (tablero[nx][ny] == 1 && !visitado[nx][ny]) {
                                                valido = false;
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        barcosEncontrados.add(longitud);
                    }
                }
            }

            Arrays.sort(barcosEsperados);
            Collections.sort(barcosEncontrados);

            if (!valido || barcosEncontrados.size() != B) {
                System.out.println("NO");
            } else {
                boolean ok = true;
                for (int i = 0; i < B; i++) {
                    if (barcosEsperados[i] != barcosEncontrados.get(i)) {
                        ok = false;
                        break;
                    }
                }
                System.out.println(ok ? "SI" : "NO");
            }
        }

        sc.close();
    }
}


