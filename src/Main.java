import functions.StringProcesor;
import functions.StringToNumberAdder;
import robotProgram.RobotPathFinder;

public class Main {

    public static void main(String[] args) {
        RobotPathFinder r = new RobotPathFinder();
        System.out.println(r.findNumberEmptyField(2,2));
    }
}
