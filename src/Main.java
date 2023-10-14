public class Main {
    public static void main(String[] args) {
        NamePrinter namePrinter = new NamePrinter();
        namePrinter.print(new Circle());
        namePrinter.print(new Quad());
        namePrinter.print(new Triangle());
        namePrinter.print(new Square());
        namePrinter.print(new Rectangle());
    }
}