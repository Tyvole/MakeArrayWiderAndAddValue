import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] cars = {"aaa", "bbb", "ccc", "ddd"};
        int a = carsCount(cars);
        addToArray(cars, "eee");
        System.out.println(a);
        System.out.println(Arrays.toString(cars));
    }

    public static void addToArray(String[] oldArray, String addIt) {

        String[] NewArray = new String[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            NewArray[i] = oldArray[i];
        }
        NewArray[NewArray.length-1] = addIt;
        System.out.println(Arrays.toString(NewArray));
    }

    public static int carsCount(String[] b) {
        int count = 0;
        for (String car : b) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }
}


