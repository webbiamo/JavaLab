package esempi.astrazione_due;

public class Tester
{

    public static void main(String[] args)
    {
        Quadrato quadrato = new Quadrato(5.00);
        System.out.println("Area = " + quadrato.calcolaArea()); // 25
        System.out.println("Perimetro = " + quadrato.calcolaPerimetro()); //20

        // ---------- OPPURE ------------

        Poligono quadrato1 = new Quadrato(5.00);
        System.out.println("Area = " + quadrato1.calcolaArea()); // 25
        System.out.println("Perimetro = " + quadrato1.calcolaPerimetro()); //20
    }
}
