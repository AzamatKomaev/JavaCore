// Использование побитовых операторов с присваиванием
class OpBitEquals {
    public static void main(String args[]) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        num1 |= 4;
        num2 >>= 1;
        num3 <<= 1;
        num1 ^= num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
    }
}