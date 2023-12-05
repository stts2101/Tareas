import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        double imc = calcularIMC(peso , altura);
        double[] c1 = new double[19];
        poblarCurso(c1);
        System.out.println("Tu IMC es: " + imc);
        interpretarIMC(imc);

        scanner.close();
    }
    public static double poblarCurso(double[] cursos){
        return cursos[1];
    }

    private static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    private static void interpretarIMC(double imc) {
        System.out.print("IMC: ");
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc < 25) {
            System.out.println("Normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }
}