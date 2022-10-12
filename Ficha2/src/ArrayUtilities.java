import java.util.Arrays;

public class ArrayUtilities {

    public static String toString(int[] array){
        String str = "[ ";
        for (int i = 0; i < array.length; i ++){
            if (i < array.length-1){
                str += array[i] + ", ";
            }
            else {
                str+= array[i];
            }
        }
        str += " ]";
        return str;
    }
    public static int maximumOf(int [] array){

        int max = array[0];
        for (int i = 1; i < array.length; i++ ){
            if (array[i]> max){
                max = array[i];
            }
        }
        return max;
    }

    public static int minimum(int [] array){

        int min = array[0];
        for (int i = 1; i < array.length; i++ ){
            if (array[i]< min){
                min = array[i];
            }
        }
        return min;
    }

    public static int[] copyOf(int[] array){
        int [] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static boolean contains (int[] array, int x){
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate (int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == (array[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int indexOf(int[] array, int n){
        if (array == null) {
            return -1;
        }

        // find length of array
        // encontrar temanho do array

        int len = array.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (array[i] == n) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
    public static int[] add(int [] array, int n, int n2){
        int [] newArray = new int[array.length + n];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
            newArray[array.length-1] = n2;
        }
        return newArray;
    }

    public static int[] remove(int [] array, int n){
        int[] newArray = new int[array.length -1];
        for (int i = 0, k=0; i < array.length; i++){
           if (array[i]!=n){
               newArray[k] = array[i];
               k++;
           }
        }
        return newArray;
    }

    public static void main(String[] args){

        int [] array = {2,3,6,7,8,1};
        System.out.println(maximumOf(array));
        System.out.println(minimum(array));
        System.out.println(toString(array));
        System.out.println(Arrays.toString(copyOf(array)));
        System.out.println(contains(array,7));
        System.out.println(containsDuplicate(array));
        System.out.println(indexOf(array,8));
        System.out.println(Arrays.toString(add(array,0, 4)));
        System.out.println(Arrays.toString(remove(array,7)));

    }
}

