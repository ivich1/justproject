package robotProgram;

import java.util.LinkedList;
import java.util.List;

public class ExampleCases {

    //пока что так
    //0 - свободно
    //1 - препядствие
    //старт и финиш - углы
    //все поля пеервернутые) те старт находится в 00(слева сверху), финиш в конце(справа внизу)
    public LinkedList<int[][]> examples;

    public ExampleCases(){
        examples = new LinkedList<>();
        addStaticCases();
    }

    private void addStaticCases(){
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

        examples.add(testField0);
        examples.add(testField1);
        examples.add(testField2);
        examples.add(testField3);
        examples.add(testField4);
        examples.add(testField5);

    }

}
