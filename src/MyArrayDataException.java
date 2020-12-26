public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int pos_y, int pos_x, String str, NumberFormatException e) {
        System.out.print("Неверное содержимое массива (ожидается число): ");
        System.out.println("Array[" + pos_y + "][" + pos_x + "] = {" + str + '}');
        System.out.println(e);
    }
}
