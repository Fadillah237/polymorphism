public class App {

    public static void main(String[] args) {
        RigthtTriangle ABC = new RigthtTriangle("ABC", 3.0, 4.0);
        Triangle BCD = new RigthtTriangle("BCD", 3.0, 4.0);
        Triangle CDE = new Triangle("CDE", 3.0, 4.0, 5.0);

        ABC.getInfo();
        BCD.getInfo();
        CDE.getInfo();
    }
}