public class MyMain {
    public static void main(String[] args) {
        System.out.println("Hello novi studenten");

        int i = 123;
        System.out.println(i);

        short s = 12345;

        int j = i + s;

        short s2 = (short)(i + 3);

        long l = 123456789012l;

        char c = 'x';

        float f = 123.456f; //32 bits = 4 bytes

        double d = 456.789; // 64 bits = 8 bytes

        float f2 = (float) d;

        double d2 = f;

        boolean b = false;
        if (b) {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");

        }

        int i3 = (int) 456.987;
        System.out.println(d2 + " " + i3);

        Calculator calc = new Calculator();

        int outcome = calc.times(100, 200);
        System.out.println(outcome);
        System.out.println(calc.times(7, 30));

        System.out.println(calc.sum(8, 3));
    }
}
