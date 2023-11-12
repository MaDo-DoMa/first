public class Variables {
    public static void main(String[] args){
        String name = "Me";
        int number = 3;
        System.out.println("Hello " + name + " " + number + "\n");

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Time for int!");
        System.out.println("Max value for int is " + max);
        System.out.println("Min value for int is " + min + "\n");

        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;
        System.out.println("Time for byte!");
        System.out.println("Max value for byte is " + maxByteValue);
        System.out.println("Min value for byte is " + minByteValue + "\n");

        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        System.out.println("Time for long!");
        System.out.println("Max value for long is " + maxLongValue);
        System.out.println("Min value for long is " + minLongValue + "\n");

        long myNumber = 2147483648l; //you need to add at the end l to become long from integer
        System.out.println(myNumber + "\n");

        float maxFloatValue = Float.MAX_VALUE;
        float minFloatValue = Float.MIN_VALUE;
        System.out.println("Time for float!");
        System.out.println("Max value for float is " + maxFloatValue);
        System.out.println("Min value for float is " + minFloatValue + "\n");

        double maxDoubleValue = Double.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;
        System.out.println("Time for double!");
        System.out.println("Max value for double is " + maxDoubleValue);
        System.out.println("Min value for double is " + minDoubleValue + "\n");

        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;
        System.out.println("Short time!");
        System.out.println("Max value for short is " + maxShortValue);
        System.out.println("Min value for short is " + minShortValue + "\n");

        char letter = 'C';
        boolean isActive = false;
        System.out.println(letter);
        System.out.println(isActive);

    }
}
