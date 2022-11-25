// Пример динамической инициализаций
class DynInit {
    public static void main(String args[]) {
        double num1 = 3.0, num2 = 4.0;

        // динамическая инициализация переменной hypotenuse
        double hypotenuse = Math.sqrt(num1 * num1 + num2 * num2);
        System.out.println("Гипотенуза равна " + hypotenuse);
    }
}
