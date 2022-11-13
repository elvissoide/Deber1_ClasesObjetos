public class soldado {
    String arma;
    double altura;
    int edad;
    String rango;
    String codigo;

    public soldado(){
        arma = "AK47";
        altura = 1.87;
        edad = 23;
        rango = "Cabo";
        codigo = "123456";
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //metodos
    public void correr(){

    }
    public void girar(){

    }
    public void saltar(){

    }
    public void disparar(){

    }
    public void curar(){

    }
}
