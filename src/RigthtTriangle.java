public class RigthtTriangle extends Triangle {
    private Double base;
    private Double height;

    public RigthtTriangle(String name, Double base, Double height) {
        super();
        this.name = name;
        this.base = base;
        this.height = height;
        this.calculateArea();
        super.side1 = base;
        super.side2 = height;
        super.side3 = this.getHypetenuse();
    }

    private double getHypetenuse() {
        return Math.sqrt((base * base) + ( height * height));
    
    }

    public void getInfo() {
        System.out.println(" RightTriangle " +name+ " info ");
        System.out.println(" area: " + super.area);
        System.out.println(" with base: " + height);
        System.out.println(" and base: " + height);
        System.out.println(" and Hypotenuse: " + this.getHypetenuse());
        System.out.println();
    }

    void  print() {
        
    }
   
}