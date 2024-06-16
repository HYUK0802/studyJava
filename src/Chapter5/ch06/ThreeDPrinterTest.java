package Chapter5.ch06;

import Chapter5.ch07.Powder;

public class ThreeDPrinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder);

        Powder p = (Powder)printer.getMaterial();
    }
}
