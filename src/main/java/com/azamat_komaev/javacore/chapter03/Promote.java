/*
    Продвижение типа одного из операндов для соответствия
    типу второго операнда в каждом операторе с двумя
    операндами.
*/
class Promote {
    public static void main(String args[]) {
        byte byte_num = 42;
        char char_symbol = 'a';
        short short_num = 1024;
        int int_num = 50000;
        float float_num = 5.67f;
        double double_num = .1234;

        double result = (float_num * byte_num) +
                (int_num / char_symbol) -
                (double_num * short_num);
        System.out.println((float_num + byte_num) + " + " + (int_num / char_symbol) + " - " + (double_num * short_num));
        System.out.println("result = " + result);

    }
}