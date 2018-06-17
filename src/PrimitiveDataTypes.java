public class PrimitiveDataTypes {

    public static void main(String[] args){

        //byte has a width of 8
        byte byteValue = 127;
        byte byteValue2 = (byte)(byteValue/2);
        System.out.println("myByte: " + byteValue2);

        //short has a width of 16
        short shortValue = 30_000;

        //int has a width of 32
        int minimum = -2_140_765_484;
        int maximum = 2_140_765_484;

        //long has a width of 64
        long longValue = 100L;


        byte byteVar = 120;
        short shortVar = -32000;
        int intVar = 2_100_000_000;
        long longVar = 50000L + 10L*(byteVar+shortVar+intVar);
        System.out.println("longTotal: " + longVar);

        short shortVar2 = (short) longVar;
        System.out.println("shortTotal: " + shortVar2);

        //float has a width of 32 (4 bytes)
        float myFloat = 5.5f;

        //double has a width of 64 (8 bytes)
        double myDouble = 5.5d;

        //Challenge
        double numberPounds = 200d;
        final double POUND_TO_KG = 0.45359237d;
        double totalKg = numberPounds*POUND_TO_KG;

        System.out.println("totalKg: " + totalKg);

        final double PI = 3.141592653589793238462643383279502884197169399375105820974944d;

        char myChar = '\u00A9';
        System.out.println("Silvia Figueroa" + myChar);

        boolean myBoolean = false;
        if (myBoolean){
            System.out.println("It's true");
        } else {
            System.out.println("It's false");
        }

        char myRegisteredChar = '\u00AE';
        System.out.println(myRegisteredChar);
    }

}
