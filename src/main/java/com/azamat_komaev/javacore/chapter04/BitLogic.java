// Применение поразрядных логических операций
class BitLogic {
    public static void main(String args[]) {
        String binary[] = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
        };
        int num1 = 3; // 0011 в двоичном представлении
        int num2 = 6; // 0110 в двоичном представлении
        int operation1 = num1 | num2;
        int operation2 = num1 & num2;
        int operation3 = num1 ^ num2;
        int operation4 = (~num1 & num2) | (num1 & ~num2);
        int operation5 = ~num1 & 0x0f;

        System.out.println("num1 = " + binary[num1]);
        System.out.println("num2 = " + binary[num2]);
        System.out.println("num1|num2 = " + binary[operation1]);
        System.out.println("num1&num2 = " + binary[operation2]);
        System.out.println("num1^num2 = " + binary[operation3]);
        System.out.println("~num1&b|num1&~num2 = " + binary[operation4]);
        System.out.println("~num1 = " + binary[operation5]);
    }
}