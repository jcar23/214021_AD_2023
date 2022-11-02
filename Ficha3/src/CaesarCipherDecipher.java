public class CaesarCipherDecipher {
    public static String cipher(int steps,String myStr){
        String cipher = "";
        for(int i= 0; i< myStr.length(); i++){
            char next = CharacterUtilities.lowerLetterSuccessorStepsOf(myStr.charAt(i), steps);
            cipher += next;
        }
        return cipher;
    }
    public static String decipher(String myStr, int steps){
        String decipher = "";
        for(int i = 0; i< myStr.length(); i++){
            char next = CharacterUtilities.lowerLetterPredecessorStepsOf(myStr.charAt(i), steps);
            decipher += next;
        }
        return decipher;
    }

    public static void main(String[] args){
        System.out.println(cipher(2,"hello"));
        System.out.println(decipher(cipher(2,"hello"),2));
    }
}
