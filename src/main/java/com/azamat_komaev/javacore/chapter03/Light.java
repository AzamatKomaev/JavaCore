/*
    Вычислить расстояние, проходимое светом,
    используя переменные типа long
*/
class Light {
    public static void main(String args[]) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000; // приблизительная скорость света, миль в секунду
        days = 1000; // кол-во дней
        seconds = days * 24 * 60 * 60; // преобразовать дни в секунду
        distance = lightspeed * seconds; // вычислить расстояние

        System.out.print("За "  + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
