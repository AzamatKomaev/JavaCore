// Продемонстрировать область действия блока кода
class Scope {
    public static void main(String args[]) {
        int num1; // переменная, доступная всему коду из метода main

        num1 = 10;
        if (num1 == 10) {
            /*
                Начало действия новой области действия,
                доступной только этому блоку кода.
                Обе переменные num1 и num2 доступны в
                этой области действия.
            */
            int num2 = 20;
            System.out.println("num1 и num2: " + num1 + " " + num2);
            num1 = num2 * 2;
        }
        // num2 = 100; // Переменная num2 недоступна, тогда как num1 доступна
        System.out.println("num1 равно " + num1);
    }
}
