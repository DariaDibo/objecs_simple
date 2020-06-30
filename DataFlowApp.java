public class DataFlowApp {
    public static void main(String[] args) {

        DataTransformer.integerToByte(1000);
        DataTransformer.integerToByte(100);

        System.out.println("------------------------------------------------------------------------");

        DataTransformer.byteToInteger((byte) 127);

        System.out.println("------------------------------------------------------------------------");

        DataTransformer.doubleToInteger((double)-2500000000.0);
        DataTransformer.doubleToInteger(1500000000.0);

        System.out.println("------------------------------------------------------------------------");

        DataTransformer.integerToDouble(2100000000);

        System.out.println("------------------------------------------------------------------------");

        DataTransformer.shortToInteger((short)32767);

        System.out.println("------------------------------------------------------------------------");

        DataTransformer.integerToShort(2147483647);
        DataTransformer.integerToShort(32000);

        System.out.println("------------------------------------------------------------------------");

    }
}

class DataTransformer {
    static byte integerToByte(int value) {

        if((value < -128) | (value > 127)) {
            System.err.println("WARNING! The value \"" + value + "\" overflows \"byte\" range. DATA will be lost!");
        }
        else {
            System.out.println("Successfully transformed " + value + " from Integer to Byte...");
        }

        return (byte) value;
    }

    static int byteToInteger(byte value) {

        System.out.println("Successfully transformed " + value + " from Byte to Integer...");

        return value;
    }

    static int doubleToInteger(double value) {

        if((value < -2_147_483_648) | (value > 2_147_438_647)) {
            System.err.println("WARNING! The value \"" + value + "\" overflows \"int\" range. DATA will be lost!");
        }
        else {
            System.out.println("Successfully transformed " + value + " from Double to Integer...");
        }

        return (int) value;
    }

    static double integerToDouble(int value) {

        System.out.println("Successfully transformed " + value + " from Integer to Double...");

        return value;
    }

    static int shortToInteger(short value) {

            System.out.println("Successfully transformed " + value + " from Short to Integer...");

        return value;
    }

    static short integerToShort(int value) {
        if((value < -32_768) | (value > 32_767)) {
            System.err.println("WARNING! The value \"" + value + "\" overflows \"short\" range. DATA will be lost!");
        }
        else {
            System.out.println("Successfully transformed " + value + " from Integer to Short...");
        }

        return (short) value;
    }
}
