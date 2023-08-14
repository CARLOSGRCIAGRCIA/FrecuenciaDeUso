import java.util.*;

public class ContadorPalabras {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You must provide a sequence of words as an argument:");
            return;
        }

        Map<String, Integer> contador = new HashMap<>();

        for (String palabra : args) {
            palabra = palabra.toLowerCase();
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
