import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws MySizeArrayException {
        String[][] arr = new String[4][4];
        String[][] arr1 = new String[3][3];
        HomeWork hw = new HomeWork();

        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                arr[y][x] = String.valueOf(new Random().nextInt(100));
            }
        }
        //arr[1][2] = "str"; // Exception MyArrayDataException и NumberFormatException
        System.out.println("Сумма всех элементов массива равна: " + hw.sumArray(arr)); // Вычисление суммы
        //System.out.println(hw.sumArray(arr1)); // Exception MySizeArrayException
    }
}
