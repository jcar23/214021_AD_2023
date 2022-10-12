public class NumericalUtilities {
    public static  int powerOf(int base, int exp){
        int res = 0;
        for (int i = 0; i <exp; i++){
            res *= base;
        }
        return res;
    }
    public static int powerOfTwo(int n1, int n2){
        int po = (int) Math.pow(n1, n2);
        return po;
    }
    public static int sumOfNaturalNumbersUpTo(int limit){
        int soma = 0;
        for (int i = 1; i <= limit; i++){
            soma += i;
        }
        return soma;
    }

    public  static int sumOfNaturalNumbersBetween (int initialization, int limit){
        int soma = 0;
        for (int x= initialization; x <= limit; x++){
            soma += x;
        }
        return soma;
    }
    public static int sumOfEvenNumbersBetween (int initialization, int limit){
        int soma = 0;
        for (int i = initialization; i <= limit; i++){
            if (i %2 == 0){
                soma += i;
            }
        }
        return soma;
    }
    public static int numberOfDivisorsOf (int limit){
        int count = 0;
        for (int i = 1; i <= limit; i++ ){
            if (limit % i==0){
                count++;
            }
        }
        return count;
    }

    public static int numberOfD (int limit){
        int i = 0;
        for (i = 1; i < limit; i++ ){
            if (limit % i==0){
                System.out.println(i);
            }
        }
        return i;
    }

    public static boolean isPrime (){
        int n = numberOfDivisorsOf(7);
        if (n == 2 ){
            return true;
        }
        else {
            return false;
        }
    }



    public static void main(String[] args) {
        System.out.println(powerOf(2,5));
        System.out.println(powerOfTwo(2,2));
        System.out.println(sumOfNaturalNumbersUpTo(6));
        System.out.println(sumOfNaturalNumbersBetween(5,9));
        System.out.println(sumOfEvenNumbersBetween(5,8));
        System.out.println(numberOfDivisorsOf(4));
        System.out.println(numberOfD(5));
        System.out.println(isPrime());
    }
}


