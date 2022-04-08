package hashmap;

import java.util.HashMap;
import java.util.Map;

public class TesterHasmap {

    private static HashMap<Object, Object> mappaTriangoloRettangolo;

    public static void main(String[] args) {
        Map<String , Double> mappaRettangolo = new HashMap<>();
        mappaRettangolo.put("base", 10.0);
        mappaRettangolo.put("altezza", 20.0);

        Rettangolo rettangolo = new Rettangolo(mappaRettangolo);

 //       System.out.println("Area:" + rettangolo.getClass().getName() + " = " + rettangolo.calcolaArea());
 //       System.out.println("Area:"  + rettangolo.calcolaArea());
        for (String key: mappaRettangolo.keySet()){
            System.out.println("Chiave" + key + "-->" + "valore: "  + mappaRettangolo.get(key));
        }

        System.out.println("Lamba notation\n");

        mappaRettangolo.forEach((key, value) -> {
            System.out.println("Chiave: " + key + "valore: " + value);
        });

        System.out.println("\nItero su Keyset () LAMBDA NOTATION\n");
        mappaRettangolo.keySet().forEach(Key ->{
            System.out.println("Chiave: " + Key + "-->" + "valore: " + mappaRettangolo.get(Key));
        });

        // VALORI

        System.out.println("\t ITERO SUI VALORI \t");
        for (Object v: mappaTriangoloRettangolo.values())
        {
            System.out.println("valori: " + v);
        }

        System.out.println("\nITERO SU VALUES() LAMBDA NOTATION\n");
            mappaTriangoloRettangolo.values().forEach(v ->{
                System.out.println("VALORE LAMBDA NOTATION " + v );
            });
    }
}
