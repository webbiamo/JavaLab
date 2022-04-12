package esempi.astrazione_3.poligoniSpecializzate;

import esempi.astrazione_3.Poligono;

import java.util.Map;

public class TriangoloRettangolo extends Poligono
{
    public TriangoloRettangolo()
    {}

    public TriangoloRettangolo(Map<String, Double> mappaLati)
    {
        super(mappaLati);
    }

    @Override
    public double calcolaArea()
    {
        return (getMappaLati().get("catetoUno") * getMappaLati().get("catetoDue")) / (double) 2;
    }

    @Override
    public double calcolaPerimetro()
    {
        return getMappaLati().get("catetoUno") + getMappaLati().get("catetoDue") + getMappaLati().get("ipotenusa");
    }
}
