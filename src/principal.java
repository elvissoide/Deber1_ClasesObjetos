public class principal {
    public static void main(String[] args) {
        soldado s = new soldado();
        System.out.println("Arma: " + s.getArma());
        System.out.println("Altura: " + s.getAltura());
        System.out.println("Edad: " + s.getEdad());
        s.setArma("Pistolita");
        System.out.println("Arma: " + s.getArma());
        s.setAltura(1.77);
    }
}
