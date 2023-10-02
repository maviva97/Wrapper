

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String a = "tRue"; //-> boolean
        boolean b = Boolean.parseBoolean(a);
        System.out.println(b);

        String c = "120"; // -> byte
        byte d = Byte.parseByte(c);
        System.out.println(d);

        String e = "32000";// -> short
        short f = Short.parseShort(e);
        System.out.println(f);

        String g = "147895632"; //-> int
        int i = Integer.parseInt(g);
        System.out.println(i);

        String j = "987654321987654321";// -> long
        long k = Long.parseLong(j);
        System.out.println(k);

        String l = "4444.5d"; // -> double
        double m = Double.parseDouble(l);
        System.out.println(m);

        String n = "2354.56f";// -> float
        float o = Float.parseFloat(n);
        System.out.println(o);


    }
}