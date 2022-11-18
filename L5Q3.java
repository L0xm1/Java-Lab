public class L5Q3
{
    public static void main(String[] args)
    {
        square sq = new square();
        sq.ShapeOutput();
        sq.RectangleOutput();
    }
}

class shape
{
    public void ShapeOutput()
    {
        System.out.println("This is This is a shape!");
    }
}

class rectangle extends shape
{
    public void RectangleOutput()
    {
        System.out.println("This is rectangular shape ");
    }
}
class circle extends shape
{
    public void print_circle()
    {
        System.out.println("This is circular shape")
    }
}
class square extends rectangle
{
    public  void squareOutput()
    {
        System.out.println("Square is a rectangle");
    }
}



