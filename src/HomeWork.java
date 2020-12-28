public class HomeWork {
    public int sumArray(String[][] arr) throws MySizeArrayException  {
        if(arr.length != 4 || arr[0].length != 4) {
            throw new MySizeArrayException(arr.length, arr[0].length);
        }

        int sum = 0;

        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(y, x, arr[y][x], e);
                }
            }
        }
        return sum;
    }
}
