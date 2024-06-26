package Chapter5.ch06;

import Chapter5.ch07.GenericPrinter;
import Chapter5.ch07.Powder;

public class GenericPrinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial();

        System.out.println(powderPrinter.toString());

    }
}
