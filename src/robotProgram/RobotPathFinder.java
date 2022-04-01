package robotProgram;

import java.awt.*;
import java.util.LinkedList;

public class RobotPathFinder {

    private int globalWayCounter;
    private int[][] field;
    private LinkedList<LinkedList<Point>> WayList;

    public RobotPathFinder(){
        globalWayCounter = 0;
    }

    public RobotPathFinder(int [][] field){
        this.field = field;
        WayList = new LinkedList<>();
    }

    //поиск пути рекурсивно
    //простая функция поиска решения? опирается на доп функции
    //!!!w, h начинаятся с 1!!! - не знаю, верно ли
    public int findNumberWaysSimpleCase(int width, int height){
        int res =recursiveFindWayPossibilities(width,height, 0);
        return res;
    }

    //перегрузка пердыдущей для текущего поля
    public int findNumberWaysSimpleCase(){
        if(field == null){
            return 0;
        }
        if (!checkCanMovePossibility(field.length - 1,field[0].length - 1)){
            return 0;
        }
        int res =recursiveFindWayWithBarriers(field.length,field[0].length,new LinkedList<Point>());
        return res;
    }

    //рекурсивно ищет все маршруты не запоминая их
    //ротатет как обход графа вглубину(вроде бы)
    private int recursiveFindWayPossibilities(int wPosition, int hPosition, int currentNumberOfWays ){

        if(wPosition == 1 && hPosition == 1){
            globalWayCounter++;
            return 1;
        }else{
            if(wPosition != 1){
                recursiveFindWayPossibilities(wPosition -1, hPosition, currentNumberOfWays);
            }
            if(hPosition != 1){
                recursiveFindWayPossibilities(wPosition, hPosition -1, currentNumberOfWays);
            }
        }
        return globalWayCounter;
    }

    //рекурсивно ищет все маршруты
    //работает с полем, на котором есть перпядствия
    //тот же обход графа, но при препядствии не вызывает саму себя
    private int recursiveFindWayWithBarriers(int wPosition, int hPosition, LinkedList<Point> way){
        LinkedList<Point> currentWay = new LinkedList<>(way);
        currentWay.addFirst(new Point(wPosition - 1, hPosition - 1));
        if(wPosition == 1 && hPosition == 1){
            globalWayCounter++;
            WayList.add(currentWay);
            return 1;
        }else{
            if(wPosition != 1 && checkCanMovePossibility(wPosition - 2, hPosition - 1)){
                recursiveFindWayWithBarriers(wPosition -1, hPosition, currentWay);
            }
            if(hPosition != 1 && checkCanMovePossibility(wPosition - 1, hPosition - 1 - 1)){
                recursiveFindWayWithBarriers(wPosition, hPosition -1, currentWay);
            }
        }
        return globalWayCounter;
    }

    //возвращает возможно ли возможно ли наступить на клетку
    private boolean checkCanMovePossibility(int x, int y){
        return field[x][y] == 0;
    }

    //печатает список путей
    public void PrintWays(){
        for (var list: WayList) {
            for (var point: list) {
                System.out.print(point.x +"-"+point.y);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
