public class Main {

    public static void hw(){
        System.out.println("HELLO WORLD");
    }
    public static float perimeter(float width, float height ) {
        float p = 2 * (width + height );
        return p;
    }

    public static float volume(float width, float height, float high ){
        float volume = width * height * high;
        return volume;
    }

    public static float conversion(float f){
        float c = (f - 32) * (5.0f/9.0f);
        return c;
    }

    public static int totalSecond( int hours, int minutes, int seconds){
        int h = hours  * 3600;
        int m = minutes * 60;
        int s = h + m + seconds;
        return s;
    }

    public static int maximum(int [] array){

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
    public static int Average(int [] array){

        int med = 0;
        for (int i = 0; i < array.length; i++){
            med += array[i];
        };
        med = med/ array.length;
        return med;
    }


    public static void main(String[] args) {
        System.out.println(perimeter(12,5 ));
        System.out.println(volume(13, 17, 9));
        System.out.println(conversion(350));
        System.out.println("Hello world!");

        int[] array = {3,6,2,8,10};
        System.out.println(maximum(array));
        System.out.println(minimum(array));
        System.out.println(Average(array));
        float[] my_array = {1,3,4,5,6};
        hw();
        System.out.println(totalSecond(4, 35, 54));


    }

}



