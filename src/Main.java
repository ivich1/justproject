import robotProgram.RobotPathFinder;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //пока что так
        //0 - свободно
        //1 - препядствие
        //старт и финиш - углы
        //все поля пеервернутые) те старт находится в 00(слева сверху), финиш в конце(справа внизу)
        int [][] testField1 = {
                {0,0,0},
                {0,1,1},
                {0,0,0}
        };//у данного поля 1

        int [][] testField2 = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };//у данного поля 2

        int [][] testField3 = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };//у данного поля 6

        int [][] testField0 = {
                {0,0,0},
                {0,1,1},
                {0,0,1}
        };//0


        int [][] testField4 = {
                {0,0,0,0},
                {0,1,0,0},
                {0,0,0,1},
                {0,0,0,0}
        };//4

        int [][] testField5 = {
                {0,0,0},
                {0,1,0},
                {0,0,0},
                {0,0,0}
        };//4

        RobotPathFinder r = new RobotPathFinder(testField0);

        //System.out.println(r.findNumberEmptyField(3,3));
        System.out.println(r.findNumberWaysSimpleCase());
        r.PrintWays();

        LinkedList<String> a = new LinkedList<>();
    }
}
