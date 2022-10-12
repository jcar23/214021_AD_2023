import java.util.Arrays;

public class Main {

    public static void increment(int value){
        value++;
    }

    private static int[] testArray(int[] array) {
        array[0]= 66;
        return array;
    }
    public static void main(String[] args) {

        int[] array = new int[3];
        int number = 3;
        System.out.println(number);
        increment(number);
        System.out.println(number);
        System.out.println(Arrays.toString(testArray(array)));
        testArray(array);
        System.out.println(Arrays.toString(testArray(array)));


    }

}