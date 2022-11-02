public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,5,3,6},
                {9,7,4,3},
                {3,0,2,1}
        };
        int[][] mat = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        int [][] mtx = {
                {3,7,9,0},
                {4,2,6,7},
                {1,8,5,2}
        };
        MatrixUtilities.show(matrix);
        boolean Matrix = MatrixUtilities.isMatrix(matrix);
        System.out.println(Matrix);
        boolean identity = MatrixUtilities.isIdentity(matrix);
        System.out.println(identity);
        int[][] productM = MatrixUtilities.multiplyBy(matrix, 2);
        MatrixUtilities.show(productM);
        boolean compatible = MatrixUtilities.areCompatibleForSum(matrix,mat);
        System.out.println(compatible);
        boolean comp = MatrixUtilities.areCompatibleV(matrix,mat);
        System.out.println(comp);
        int[][] Sum = MatrixUtilities.SumOf(matrix,mtx);
        MatrixUtilities.show(Sum);
        int[][] SumV = MatrixUtilities.sumOfV(matrix,mtx);
        MatrixUtilities.show(SumV);

        //CharacterDrawingUtilities.drawElements('*');
        CharacterDrawingUtilities.drawNewLine();
        CharacterDrawingUtilities.drawHorizontalSegmentWith('*', 5);
        CharacterDrawingUtilities.drawNewLine();
        CharacterDrawingUtilities.drawFilledRectangleWith('*',5,5);
        CharacterDrawingUtilities.drawNewLine();
        CharacterDrawingUtilities.drawEmptyRectangleWith('*',5, 5);
    }

}