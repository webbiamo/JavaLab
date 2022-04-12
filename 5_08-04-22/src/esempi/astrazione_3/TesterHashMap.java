package esempi.astrazione_3;

import esempi.astrazione_3.poligoniSpecializzate.Rettangolo;
import esempi.astrazione_3.poligoniSpecializzate.TriangoloRettangolo;

import java.util.HashMap;
import java.util.Map;

public class TesterHashMap
{
    public static void main(String[] args)
    {
        Map<String, Double> mappaRettangolo = new HashMap<>();
        mappaRettangolo.put("base", 10.0);
        mappaRettangolo.put("altezza", 20.0);

        Rettangolo rettangolo = new Rettangolo(mappaRettangolo);

//        System.out.println("Area: = " + rettangolo.calcolaArea());
//        System.out.println("Perimetro: = " + rettangolo.calcolaPerimetro());


        // TRIANGOLO
        Map<String, Double> mappaTriangoloRettangolo = new HashMap<>();
        mappaTriangoloRettangolo.put("catetoUno", 10.0);
        mappaTriangoloRettangolo.put("catetoDue", 20.0);
        mappaTriangoloRettangolo.put("ipotenusa", 30.0);

        TriangoloRettangolo triangoloRettangolo = new TriangoloRettangolo(mappaTriangoloRettangolo);
//        System.out.println("Area Triangolo: = " + triangoloRettangolo.calcolaArea());
//        System.out.println("Perimetro Triangolo: = " + triangoloRettangolo.calcolaPerimetro());

        for(String key : mappaRettangolo.keySet())
        {
            System.out.println("Chiave: " + key + "--> " + "valore: " + mappaRettangolo.get(key));
        }

        System.out.println("\nLAMBDA NOTATION\n");

        mappaRettangolo.forEach((key, value) -> {
            System.out.println("Chiave: " + key + "--> " + "valore: " + value);
        });

        System.out.println("\nITERO SU KEYSET() LAMBDA NOTATION\n");

        mappaRettangolo.keySet().forEach(key -> {
            System.out.println("Chiave: " + key + "--> " + "valore: " + mappaRettangolo.get(key));
        });

        // VALORI
        System.out.println("\t ITERO SUI VALORI\t");
        for (Double v : mappaTriangoloRettangolo.values())
        {
            System.out.println("VALORI: " + v);
        }

        System.out.println("\nITERO SU VALUES() LAMBDA NOTATION\n");

        mappaTriangoloRettangolo.values().forEach(v -> {
            System.out.println("VALORE LAMBDA NOTATION: " + v);
        });
    }
}
