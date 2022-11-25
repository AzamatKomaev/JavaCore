// Продемонстрировать срок действия переменной
class LifeTime {
    public static void main(String args[]) {
        for (int i=0; i < 3; i++) {
            int num = -1; // инициализируется при каждом вхождений в блок кода
            System.out.println("num равен " + num); // всегда выводится значение -1

            num = 100;
            System.out.println("num теперь равен " + num);
        }
    }
}