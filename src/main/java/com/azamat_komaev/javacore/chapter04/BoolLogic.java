// Продемонстрировать применение логических операций
class BoolLogic {
    public static void main(String args[]) {
        boolean boolValue1 = true;
        boolean boolValue2 = false;

        boolean boolResult1 = boolValue1 | boolValue2;
        boolean boolResult2 = boolValue1 & boolValue2;
        boolean boolResult3 = boolValue1 ^ boolValue2;
        boolean boolResult4 = (!boolValue1 & boolValue2) | (boolValue1 & !boolValue2);
        boolean boolResult5 = !boolValue1;

        System.out.println("boolValue1 = " + boolValue1);
        System.out.println("boolValue2 = " + boolValue2);
        System.out.println("boolValue1 | boolValue2 = " + boolResult1);
        System.out.println("boolValue1 & boolValue2 = " + boolResult2);
        System.out.println("boolValue1 ^ boolValue2 = " + boolResult3);
        System.out.println("(!boolValue1 & boolValue2) | (boolValue1 & !boolValue2) = " + boolResult4);
        System.out.println("!boolValue1 = " + boolResult5);
    }
}
