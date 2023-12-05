public class Ayud3 {
    // MEtodo 1
    public static boolean metodo1(String palabraIngresada) {
        palabraIngresada = palabraIngresada.replace(" ", "a");
        StringBuilder builder = new StringBuilder(palabraIngresada);
        String palabraInvertida = builder.reverse().toString();
        return palabraIngresada.equalsIgnoreCase(palabraInvertida);
    }

    // MEtodo 2
    public static double metodo2(double [] b) {
        double [] ponderacionNotas = {0.25, 0.25, 0.25, 0.15, 0.10};
        double a = 0;
        for (int i = 0; i < b.length; i++) {
            a = (b[i] * ponderacionNotas[i]);
        }
        return a;
    }
    // MEtodo 3
    private static String metodo3(int [] puntajes) {
        int jugador1 = 20 - puntajes[0];
        int jugador2 = 20 - puntajes[1];
        if((jugador1 < 0 && jugador2 < 0) || jugador1 == jugador2) {
            return "Empate.";
        } else if((jugador1 < 0 || jugador2 < jugador1) && jugador2 >= 0) {
            return "Jugador 2 ganó.";
        } else {
            return "Jugador 1 ganó.";
        }
    }
    // MEtodo 4
    public static int[][] metodo4(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }
    // MEtodo 5
    public static boolean metodo5(String palabraIngresada) {
        for (int i = 0; i <= palabraIngresada.length(); i++) {
            if (Character.isDigit(palabraIngresada.charAt(i)) ||
                    palabraIngresada.isBlank()) {
                return false;
            }
        }
        return true;
    }


}
