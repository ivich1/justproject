package stringFunctions;

public class BurgerEncoder {

    //кодирует строку по шаблону:
    //было -> боыл
    //burger -> bruerg
    //seven -> sneev
    //составляет новое слово по очереди добавляя символы с начала и конца
    public static String burgerEncode(String s){
        int length = s.length();
        char[] source = s.toCharArray();
        char[] encoded = new char[length];
        if(length % 2 == 1){
            //обавляет символ из центра(нечетный) в конец
            encoded[length - 1] = source[length / 2];
        }
        for (int i = 0; i < length/2; i++){
            encoded[i*2] = source[i];
            encoded[i*2 +1] = source[length - i -1];
        }
        return new String(encoded);
    }

    //декодирует предыдущее
    public static String burgerDecode(String s){
        int length = s.length();
        char[] source = s.toCharArray();
        char[] decoded = new char[length];
        for (int i = 0; i < length/2; i++){
            decoded[i] = source[i*2];
            decoded[length - i -1] = source[i*2 +1];
        }
        if(length % 2 == 1){
            //обавляет символ из центра(нечетный) в конец
            decoded[length / 2] = source[length - 1];
        }
        return new String(decoded);
    }
}
