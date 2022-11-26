// Продемонстрировать приведение типов
class Conservation {
    public static void main(String args[]) {
        byte byte_num;
        int int_num = 257;
        double double_num = 323.142;

        System.out.println("\nПреборазование типа int в тип byte.");
        byte_num = (byte) int_num;
        System.out.println("int_num и byte_num " + int_num + " " + byte_num);

        System.out.println("\nПреобразование типа double в тип int.");
        int_num = (int) double_num;
        System.out.println("double_num и int_num " + double_num + " " + int_num);

        System.out.println("\nПреобразование типа double в тип byte.");
        byte_num = (byte) double_num;
        System.out.println("double_num и byte_num " + double_num + " " + byte_num);
    }
}