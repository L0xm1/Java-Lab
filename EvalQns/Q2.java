public class Q2
{
    public static void main(String args[])
    {
        
    }
}

class MyPolynomial
{
    double coeffs[];
    int degree;
    MyPolynomial()
    {
        coeffs = new double[1];
        degree = 0;
    }
    MyPolynomial(double coeffs[])
    {
        this.coeffs = coeffs;
        degree = coeffs.length - 1;
    }
    MyPolynomial(int degree)
    {
        this.degree = degree;
        coeffs = new double[degree + 1];
    }
    
    public int getDegree()
    {
        return degree;
    }
    
    public void setDegree(int n)
    {
        degree = n;
    }
}