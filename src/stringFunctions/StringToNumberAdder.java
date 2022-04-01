package stringFunctions;

public class StringToNumberAdder {

    static public String method(int number){
        String rootString = "строк";
        int valuablePart = number % 100;

        if(valuablePart > 20 || valuablePart < 10){
            valuablePart %= 10;
            if(valuablePart == 1){
                rootString += "a";
            }
            else if(valuablePart < 5 && valuablePart >1){
                rootString += "и";
            }
        }
        return number + " " + rootString;
    }
}
