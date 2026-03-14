import java.util.Scanner;

public class proyecto4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] tablero = new char[3][3];

        // Inicializar tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }

        char jugadorActual = 'X';
        int movimientos = 0;

        mostrarTablero(tablero);

        while (true) {

            System.out.println("\nTurno del jugador " + jugadorActual);

            System.out.print("Introduce la fila (0-2): ");
            int fila = sc.nextInt();

            System.out.print("Introduce la columna (0-2): ");
            int columna = sc.nextInt();

            // validar posición
            if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                System.out.println("Posicion invalida.");
                continue;
            }

            // validar casilla libre
            if (tablero[fila][columna] != ' ') {
                System.out.println("Casilla ocupada.");
                continue;
            }

            // colocar ficha
            tablero[fila][columna] = jugadorActual;
            movimientos++;

            mostrarTablero(tablero);

            // comprobar ganador
            if (hayGanador(tablero, jugadorActual)) {
                System.out.println("\nEl jugador " + jugadorActual + " ha ganado!");
                break;
            }

            // comprobar empate
            if (movimientos == 9) {
                System.out.println("\nEmpate!");
                break;
            }

            // cambiar jugador
            if (jugadorActual == 'X') {
                jugadorActual = 'O';
            } else {
                jugadorActual = 'X';
            }
        }

        sc.close();
    }

    // Mostrar tablero
    public static void mostrarTablero(char[][] tablero) {

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2]);

            if (i < 2) {
                System.out.println("---|---|---");
            }
        }
    }

    // Comprobar si hay ganador
    public static boolean hayGanador(char[][] tablero, char jugador) {

        // filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador &&
                tablero[i][1] == jugador &&
                tablero[i][2] == jugador) {
                return true;
            }
        }

        // columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == jugador &&
                tablero[1][i] == jugador &&
                tablero[2][i] == jugador) {
                return true;
            }
        }

        // diagonales
        if (tablero[0][0] == jugador &&
            tablero[1][1] == jugador &&
            tablero[2][2] == jugador) {
            return true;
        }

        if (tablero[0][2] == jugador &&
            tablero[1][1] == jugador &&
            tablero[2][0] == jugador) {
            return true;
        }

        return false;
    }
}
