package esercizio2;

public class Tester
{
    public static void main(String[] args)
    {
        Quadrato quadrato = new Quadrato(4, 10.00);
        System.out.println("Area = " + quadrato.calcolaArea()); // 100
        System.out.println("Perimetro = " + quadrato.calcolaPerimetro()); //40
    }
}
