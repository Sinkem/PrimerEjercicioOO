public class Killer {

    double velocidad = 4.6;
    int radioTerror;
    String altura;
    boolean sneaky;
    boolean stuneado;

    public void rangoRadioTerror() {
        if (sneaky == true) {
            radioTerror = 6;
            System.out.println("Tu radio de terror es: " + radioTerror);
        } else {
            radioTerror = 32;
            System.out.println("Tu radio de terror es: " + radioTerror);
        }
    }

    public void mostrarAltura() {
        if (altura == "Alto" || altura == "Media" || altura == "Bajo") {
            System.out.println(altura);
        } else {
            System.out.println("Introduce una altura valida");
            mostrarAltura();
        }
    }

    public void mostrarVelocidad() {
        System.out.println("Velocidad: " + velocidad);
    }

    public void stuneado() {
        if (stuneado == true) {
            velocidad = 0;
            System.out.println("Te han stuneado!");
        } else {
            System.out.println("No te han stuneado");
        }
    }

}