// Скомпилировать эту программу нельзя
class ScopeErr {
    public static void main(String args[]) {
        int bar = 1;
        {
            // Новый блок, поэтому ошибка: переменная bar уже определена.
            int bar = 2;
        }
    }
}
