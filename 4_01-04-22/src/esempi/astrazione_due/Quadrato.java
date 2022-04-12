package esempi.astrazione_due;

public class Quadrato extends Poligono
{
    private Double valoreLato;
    private static final Integer NUMERO_LATI = 4; //conosco il numero di lati di un quadrato

    public Quadrato(){super();}

    public Quadrato(Double valoreLato)
    {
        super(NUMERO_LATI);
        this.valoreLato = valoreLato;
    }

    @Override
    public double calcolaPerimetro()
    {
        return this.valoreLato * NUMERO_LATI; // valore lato * 4
    }

    @Override
    public double calcolaArea()
    {
        return this.valoreLato * this.valoreLato; // lato x lato
    }
}
