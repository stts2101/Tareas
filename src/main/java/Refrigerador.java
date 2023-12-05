public class Refrigerador {
    private String tamano;
    private String electricidad;
    private String capacidad;
    public Refrigerador(String tamano, String electricidad, String capacidad){
        this.tamano = tamano;
        this.electricidad = electricidad;
        this.capacidad = capacidad;
    }
   // public double obtenerTemp(){}
  //  public int nroPuertas(){}
   // public int nroRepisas(){}
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getElectricidad() {
        return electricidad;
    }

    public void setElectricidad(String electricidad) {
        this.electricidad = electricidad;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
