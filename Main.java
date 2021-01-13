public class Main {

    public static void main(String[] args) {

        Killer killer1;
        killer1 = new Killer();

        killer1.altura = "Alto";
        killer1.sneaky = true;
        killer1.stuneado = false;

        killer1.rangoRadioTerror();
        killer1.mostrarAltura();
        killer1.stuneado();
        killer1.mostrarVelocidad();

    }

}
