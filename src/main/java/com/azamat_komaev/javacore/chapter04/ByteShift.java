// Сдвиг влево значения типа byte
class ByteShift {
    public static void main(String args[]) {
        byte num1 = 64, num2;
        int result;

        result = num1 << 2;
        num2 = (byte) (num1 << 2);

        System.out.println("Первоначальное значение num1: " + num1);
        System.out.println("result и num2 " + result + " " + num2);
    }
}
