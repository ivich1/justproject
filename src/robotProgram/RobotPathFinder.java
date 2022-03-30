package robotProgram;

public class RobotPathFinder {

    private int globalWayCounter;
    private int[][] field;

    public RobotPathFinder(){
        globalWayCounter = 0;
    }

    public RobotPathFinder(int [][] field){
        this.field = field;
    }

    //поиск пути рекурсивно
    //простая функция поиска решения? опирается на доп функции
    //!!!w, h начинаятся с 1!!! - не знаю, верно ли
    public int findNumberEmptyField(int width, int height){
        int res =recursiveFindWayPossibilities(width,height,0);
        return res;
    }
    //перегрузка пердыдущей для текущего поля
    public int findNumberEmptyField(){
        if(field ==null){
            return 0;
        }
        int res =recursiveFindWayWithBarriers(field.length,field[0].length,0);
        return res;
    }

    //рекурсивно ищет все маршруты не запоминая их
    //ротатет как обход графа вглубину(вроде бы)
    private int recursiveFindWayPossibilities(int wPosition, int hPosition, int currentNumberOfWays){
        if(wPosition == 1 && hPosition == 1){
            globalWayCounter++;
            return 1;
        }else{
            if(wPosition != 1){
                currentNumberOfWays += 1;
                currentNumberOfWays += recursiveFindWayPossibilities(wPosition -1, hPosition, currentNumberOfWays);
            }
            if(hPosition != 1){
                currentNumberOfWays += 1;
                recursiveFindWayPossibilities(wPosition, hPosition -1, currentNumberOfWays);
            }
        }
        return globalWayCounter;
    }

    //рекурсивно ищет все маршруты не запоминая их
    //работает с полем, на котором есть перпядствия
    //тот же обход графа, но при препядствии не вызывает саму себя
    private int recursiveFindWayWithBarriers(int wPosition, int hPosition, int currentNumberOfWays){
        if(wPosition == 1 && hPosition == 1){
            globalWayCounter++;
            return 1;
        }else{
            if(wPosition != 1 && checkCanMovePossibility(wPosition - 1 - 1, hPosition - 1)){
                currentNumberOfWays += 1;
                currentNumberOfWays += recursiveFindWayPossibilities(wPosition -1, hPosition, currentNumberOfWays);
            }
            if(hPosition != 1 && checkCanMovePossibility(wPosition - 1, hPosition - 1 - 1)){
                currentNumberOfWays += 1;
                recursiveFindWayPossibilities(wPosition, hPosition -1, currentNumberOfWays);
            }
        }
        return globalWayCounter;
    }

    //возвращает возможно ли возможно ли наступить на клетку
    private boolean checkCanMovePossibility(int x, int y){
        return field[x][y] == 0;
    }


}
