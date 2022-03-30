import functions.StringProcesor;
import functions.StringToNumberAdder;
import robotProgram.RobotPathFinder;

public class Main {

    public static void main(String[] args) {

        //пока что так
        //0 - свободно
        //1 - препядствие
        // старт и финиш - углы
        int [][] testField1 = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };//у данного поля 2 пути

        RobotPathFinder r = new RobotPathFinder(testField1);

        //System.out.println(r.findNumberEmptyField(3,3));
        System.out.println(r.findNumberEmptyField());

    }
}
