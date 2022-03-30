package functions;

public class StringProcesor {

    public static String burgerEncoder(String s){
        int wordLength = s.length();
        int wordLengthHalf = wordLength/2;
        char[] source = s.toCharArray();
        char[] firstPart = new char[wordLengthHalf];
        char[] secondPart = new char[wordLengthHalf];
        char[] encodedString = new char[wordLength];

        for(int i = 0; i < wordLength/2; i++){
            firstPart[i] = source[i];
            secondPart[i] = source[wordLength];
        }
        if(wordLengthHalf % 2 == 1){
            encodedString[wordLengthHalf] = source[wordLengthHalf];
        }
        return "a";
    }

    String burgerDecoder(String encodedString){
        int wordLength = encodedString.length();
        char [] encodedArr = encodedString.toCharArray();
        char [] decodedArr = new char[wordLength];
        for(int i = 0; i < wordLength; i++){
            if(i % 2 == 0){
                //decodedArr[wordLength]
            }
            else{

            }
        }
        return "a";
    }
}
