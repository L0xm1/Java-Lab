class Circle
{
    private double radius;
    private String color;
  
    public Circle(){
      radius=__;
      color="red";
    }
    public Circle(double r){
      radius=r;
      color="red";
    public Circle(double r,String c){
      radius=r;
      color=c;
    }
    public void setRadius(double r){
      radius=r;
    }
      public double getRadius(){
      return radius;
    }
    public double getArea(){
      return 
    }
  }
}
  
public classCylinder extends Circle
{
    private double height;
    public Cylinder() {
      super();
      height = 1.0;
    }
    public Cylinder(double h) {
      super();
      this.h= h;
    }
    public Cylinder(double r, double h){
      super(r);
      this.height = height;
    }
    public double getHeight() {
      return h;
    }
    public double getVolume() {
      return getArea()*h;
    }
    //in cylinder class, this should be written if me not wrong
    @Override
    public String toString() {
      return "Cylinder: subclass of " + super.toString()
              + " height=" + height;
    }
  }  

  //for circle
public class Circle {
  private double radius;
  private String color;

  public Circle() {
     radius = 1.0;
     color = "red";
  } 
  public Circle(double r) { 
     radius = r;
     color = "red";
  }
  public double getRadius() {
    return radius; 
  }
  public double getArea() {
     return radius*radius*Math.PI;
  }
}
public class TestCircle {
  public static void main(String[] args) {
     Circle c1 = new Circle();
     System.out.println("The circle has radius of " 
        + c1.getRadius() + " and area of " + c1.getArea());
     Circle c2 = new Circle(2.0);
     System.out.println("The circle has radius of " 
        + c2.getRadius() + " and area of " + c2.getArea());
  }
}
//for cylinder
public class Cylinder extends Circle { 
   private double height; 
   public Cylinder() {
      super(); 
      height = 1.0; 
   }
   public Cylinder(double height) {
      super(); 
      this.height = height;
   }
   public Cylinder(double radius, double height) {
      super(radius); 
      this.height = height;
   }
   public double getHeight() {
      return height; 
   }
   public double getVolume() {
      return getArea()*height; 
   }
}
public class TestCylinder {  
   public static void main (String[] args) {
      Cylinder c1 = new Cylinder();
      System.out.println("Cylinder:"
            + " radius=" + c1.getRadius()
            + " height=" + c1.getHeight()
            + " base area=" + c1.getArea()
            + " volume=" + c1.getVolume());
      Cylinder c2 = new Cylinder(10.0);
      System.out.println("Cylinder:"
            + " radius=" + c2.getRadius()
            + " height=" + c2.getHeight()
            + " base area=" + c2.getArea()
            + " volume=" + c2.getVolume());
      Cylinder c3 = new Cylinder(2.0, 10.0);
      System.out.println("Cylinder:"
            + " radius=" + c3.getRadius()
            + " height=" + c3.getHeight()
            + " base area=" + c3.getArea()
            + " volume=" + c3.getVolume());
   }
}
