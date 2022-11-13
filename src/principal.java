public class principal {
    public static void main(String[] args) {
        soldado s = new soldado();
        System.out.println("Arma: " + s.getArma());
        System.out.println("Altura: " + s.getAltura());
        System.out.println("Edad: " + s.getEdad());
        System.out.println("Rango: " + s.getRango());
        System.out.println("Codigo: " + s.getCodigo());

        soldado j1 = new soldado();
        j1.setArma("M60");
        j1.setAltura(1.94);
        j1.setEdad(25);
        j1.setRango("Capitan");
        j1.setCodigo("758736");
        System.out.println("\nJugador 1");
        System.out.println("Arma: " + j1.getArma());
        System.out.println("Altura: " + j1.getAltura());
        System.out.println("Edad: " + j1.getEdad());
        System.out.println("Rango: " + j1.getRango());
        System.out.println("Codigo: " + j1.getCodigo());

        soldado j2 = new soldado();
        j2.setArma("SCAR");
        j2.setAltura(1.87);
        j2.setEdad(44);
        j2.setRango("Coronel");
        j2.setCodigo("898872");
        System.out.println("\nJugador 2");
        System.out.println("Arma: " + j2.getArma());
        System.out.println("Altura: " + j2.getAltura());
        System.out.println("Edad: " + j2.getEdad());
        System.out.println("Rango: " + j2.getRango());
        System.out.println("Codigo: " + j2.getCodigo());

        soldado j3 = new soldado();
        j3.setArma("MP5");
        j3.setAltura(1.89);
        j3.setEdad(52);
        j3.setRango("General");
        j3.setCodigo("893432");
        System.out.println("\nJugador 3");
        System.out.println("Arma: " + j3.getArma());
        System.out.println("Altura: " + j3.getAltura());
        System.out.println("Edad: " + j3.getEdad());
        System.out.println("Rango: " + j3.getRango());
        System.out.println("Codigo: " + j3.getCodigo());

    }
}
