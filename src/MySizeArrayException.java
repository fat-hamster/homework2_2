public class MySizeArrayException extends Exception{
    public MySizeArrayException(int size_y, int size_x) {
        System.out.println("Неверный размер массива");
        System.out.print("Необходима размерность 4х4, ");
        System.out.println("а входящий массив имеет размерность " + size_y + 'x' + size_x);
    }
}
