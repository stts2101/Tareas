public class Fibonacci {
    public static void main(String[] args){
        int x = metodo(7);
        System.out.println("resultado: " + x);
    }
    public static int metodo(int num){
            int num2 = 0;
            int num3 = 1;
            int num4;
            for (int i = 0; num == i; i++){
                num4 = num3 + num2;
                num3 = num4;
                num2 = num3;
            }
            return num3;
    }

}
