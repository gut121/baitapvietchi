
package refactor;

import java.util.stream.IntStream;

public class Hexa {
    public void fourNumber() {
        char[] d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        IntStream.range(0, 65536) 
                .mapToObj(decimal -> {
                    int i = decimal / (16 * 16 * 16);
                    int j = (decimal / (16 * 16)) % 16;
                    int k = (decimal / 16) % 16;
                    int l = decimal % 16;
                    return String.format("%c%c%c%c\t%d", d[i], d[j], d[k], d[l], decimal);
                })
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Hexa oc = new Hexa();
        System.out.println("Hexa\tDecimal");
        oc.fourNumber();
    }
}

