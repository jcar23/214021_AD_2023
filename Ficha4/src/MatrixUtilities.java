public class MatrixUtilities {
    public static void show(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean isMatrix(int[][] matrix) {
        int size = matrix[0].length;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i].length != size )
                return false;

        }
        return true;
    }

    public static boolean isIdentity(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 1 && i == j || i != j && matrix[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] multiplyBy(int[][] matrix, int valueToMultiply) {
        int[][] product = new int[matrix.length][matrix[0].length]; // row = matrix.length, column =
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                product[i][j] = matrix[i][j] * valueToMultiply;
            }
        }
        return product;
    }
    public static boolean areCompatibleForSum(int[][] matrix, int[][] mat){
        for (int i = 0; i < matrix.length && i< mat.length; i++) {
            for (int j = 0; j < matrix[i].length && i < mat[i].length; j++) {
                if (matrix[i].length != mat[i].length){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean areCompatibleV(int[][] matrix, int[][] mat){
        if (matrix.length != mat.length){
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != mat[i].length)
                return false;
        }
        return true;
    }


    public static int[][] SumOf(int[][] matrix, int[][] mtx){
        int[][] sum = new int[matrix.length][matrix[0].length]; // row = matrix.length, column =
        for (int i = 0; i < matrix.length && i< mtx.length; i++) {
            for (int j = 0; j < matrix[i].length && i < mtx[i].length; j++){
                sum[i][j] = matrix[i][j] + mtx[i][j];
            }
        }
        return sum;
    }
    public static int[][] sumOfV(int[][] matrix, int[][] mtx){
        if (areCompatibleV(matrix,mtx)){
            int[][] sum = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum[i][j] = matrix[i][j] + mtx[i][j];
                }
            }
            return sum;
        }
        else {
            return null;
        }
    }
}
