import java.util.Arrays;

public class CharacterUtilities {
    //a
    public static char lowerLetterSuccessorOf(char character){
        char letter = character;
        letter++;
        if (character == 'z')
            return 'a';
        return letter;
    }

    //b
    public static char lowerLetterPredecessorOf(char character){
        char letter = character;
        letter--;
        if (character == 'a'){
            return 'z';
        }
        return letter;
    }

    //c
    public static char lowerLetterSuccessorStepsOf(char letter, int steps){
        if(letter == 'z') {
            letter = 'a';
            letter += (steps - 1);
            return letter;
        }
        else
            letter+=steps;
            return letter;
    }
    //d
    public static char lowerLetterPredecessorStepsOf(char letter, int steps){
        char next = letter;
        for (int i = 0; i< steps; i++){
            next = lowerLetterPredecessorOf(next);
        }
        return next;
    }
    //e
    public static int occurrencesOfCharacterIn(char[] array, char character){
        int count =0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == character)
                count++;
        }
        return count;
    }

    //f
    public static char[] replaceCharacterIn(char[] array, char character, char reChar){
        for (int i = 0; i < array.length; i++){
            if (array[i] == character)
                array[i] = reChar;
        }
        return array;
    }
    //g
    public static char[] concatenationOf(char[] array, char[] array2){
        char[] concatArray = new char[array.length + array2.length];
        for (int i = 0; i< array.length; i++) {
            concatArray[i] = array[i];
        }
        for(int i = 0; i< array2.length; i++){
            concatArray[array.length +i] = array2[i];
        }
        return concatArray;
    }
    //h

    public static char[] copyOfPartOf(char[] array,int iIndex, int fIndex){
        char[] newArray  = new char[fIndex-iIndex];
        for (int i= 0; i <fIndex-iIndex; i++){
            newArray[i] = array[i + iIndex];
        }
        return newArray;
    }


    public static void main(String[] args) {
        char[] array = {'a','c','q','e','c','j'};

        System.out.println(lowerLetterSuccessorOf('d'));
        System.out.println(lowerLetterPredecessorOf('d'));
        System.out.println(lowerLetterSuccessorStepsOf('b',3));
        System.out.println(lowerLetterPredecessorStepsOf('a', 3));
        System.out.println(occurrencesOfCharacterIn(array,'c'));
        System.out.println(Arrays.toString(replaceCharacterIn(array,'j','u')));
        System.out.println(Arrays.toString(concatenationOf(array, new char[]{'h', 'z', 'k', 'y', 'x'})));
        System.out.println(Arrays.toString(copyOfPartOf(array,2,6)));

    }

}