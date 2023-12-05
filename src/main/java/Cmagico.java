public class Cmagico {
    public int[][] cuadrado = new int[3][3];
    public void crearCuadrado(int[][] arr, int x) {
        for (int i = 0 ; i<3 ;i++){
            for(int i2 = 0; i2<3; i2++){
            arr[i][i2] = x;}
        }
    }
    public boolean compCuadrado(int[][] arr){
        int[] xy = new int[3];
        for (int i = 0 ; i<3 ;i++){
            for(int i2 = 0; i2<3; i2++){
                arr[i][i2]= xy[i];
            }

        }
        return true;
    }

}
