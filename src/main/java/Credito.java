public class Credito {
    public static void main(String[] args) {
        double x = 1000000;
        double y = 10;
        System.out.println("Monto total a pagar: " + montoCredito(x, y) +
                " Cuota mensual: " + mensual2(x, y));
    }

    public static double montoCredito(double monto, double cuota) {
        int x;
        if (monto <= 1000000) {
            x = 1;
        } else {
            x = 2;
        }
        if (x == 1) {
            if (cuota <= 12) {
                monto = monto * 1.25;
            } else if (cuota > 12 && cuota <= 23) {
                monto = monto * 1.30;
            } else if (cuota > 24) {
                monto = monto * 1.35;
            }
        } else if(x == 2) {
            if (cuota <= 12) {
                monto = monto * 1.15;
            } else if (cuota > 12 && cuota <= 23) {
                monto = monto * 1.20;
            } else if (cuota > 24) {
                monto = monto * 1.25;
            }
        }
        return monto;
    }

    public static double mensual2(double x, double y) {
        double mensual = montoCredito(x, y) / y;
        return mensual;
    }
}