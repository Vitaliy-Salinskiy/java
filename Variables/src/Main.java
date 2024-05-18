public class Main {
    public static void main(String[] args) {

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("min: " + min + ", " + "max: " + max  + " values");

        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("byte min: " + byteMin + ", " + "byte max: " + byteMax + " values");

        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;

        System.out.println("long min: " + longMin + ", " + "long max: " + longMax + " values");

        long myLongNumber = 2147483648997187070L;

        System.out.println("My long number: " + myLongNumber);

        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;

        System.out.println("short min: " + shortMin + ", " + "short max: " + shortMax + " values");

        float floatNumber = 3.14F;
        double doubleNumber = 2.0;

        System.out.println("float number: " + floatNumber + ", " + "double number: " + doubleNumber + " values");

        float maxFloatValue = Float.MAX_VALUE;
        float minFloatValue = Float.MIN_VALUE;

        System.out.println("float min: " + minFloatValue + ", " + "float max: " + maxFloatValue + " values");

        double maxDoubleValue = Double.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;

        System.out.println("double min: " + minDoubleValue + ", " + "double max: " + maxDoubleValue + " values");

        String name = "Ryan";
        System.out.println("Hello, " + name);

        char letter = 'A';
        System.out.println("letter: " + letter);

        boolean isActive = true;
        System.out.println("is active: " + isActive);
        System.out.println("is active: " + !isActive);

    }
}