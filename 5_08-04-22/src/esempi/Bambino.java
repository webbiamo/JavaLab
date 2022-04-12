package esempi;

public class Bambino extends Persona
{
    private double pesoNascita;
    private boolean prematuro;

    public Bambino()
    {
        super(); //richiama il costruttore vuoto di Persona
    }

    public Bambino(String nome, String cognome, double pesoNascita, boolean prematuro)
    {
        super(nome, cognome); //richiama il costruttore pieno di Persona
        this.pesoNascita = pesoNascita;
        this.prematuro = prematuro;
    }

    public double getPesoNascita() {
        return pesoNascita;
    }

    public void setPesoNascita(double pesoNascita) {
        this.pesoNascita = pesoNascita;
    }

    public boolean isPrematuro() {
        return prematuro;
    }

    public void setPrematuro(boolean prematuro) {
        this.prematuro = prematuro;
    }

    @Override
    public String toString() {
        return "Bambino{" +
                "nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", pesoNascita=" + pesoNascita +
                ", prematuro=" + prematuro +
                '}';
    }
}
