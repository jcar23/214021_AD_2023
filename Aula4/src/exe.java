public class exe {
    public static void main(String[] args){
        final int[] studentNumbers = {20032, 30312, 25342, 31432};
        final String[] courseAcronyms = { "AD","WEB-FE", "WEB-BE"};
        final int [][] studentGrades = {
                {15,18,17},
                {18,10,11},
                {11,13,15},
                {10,19,16}
        };
        float highestAvg = 0;
        int studentNumb= 0;
        for (int i = 0; i < studentNumbers.length; i++) {
            System.out.println("Aluno" + studentNumbers[i]+"Obte as seguintes avaliações: ");
            float average = 0;
            for (int j = 0; j < courseAcronyms.length; j++) {
                System.out.println("\t" + courseAcronyms[j] + ": " + studentGrades[i][j] );
                average += studentGrades[i][j];
            }
            average/=studentGrades[i].length; // media das 3 notas
            if (average > highestAvg){
                highestAvg = average;
                studentNumb = studentNumbers[i];
            }
            System.out.println("\t" +"Average: "+ average);
        }
        String.format("A media mais alta é: {}", highestAvg,studentNumb); // to check
        System.out.println("A media mais alta é: " + highestAvg + studentNumb);
    }


}
