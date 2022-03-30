package robotProgram;

public class RobotPathFinder {

    private static int globalWaiCounter = 0;

    //поиск пути рекурсивно
    //простая функция поиска решения
    //!!!w, h начинаятся с 0!!! - не знаю, верно ли
    public int findNumberEmptyField(int width, int height){
        int res =recursiveFindWayPossibilities(width,height,0);
        return globalWaiCounter;
    }

    private int recursiveFindWayPossibilities(int wPosition, int hPosition, int currentNumberOfWays){
        if(wPosition == 0 && hPosition == 0){
            globalWaiCounter ++;
            return 1;
        }
        if(wPosition != 0){
            currentNumberOfWays += recursiveFindWayPossibilities(wPosition -1, hPosition, currentNumberOfWays);
        }
        if(hPosition != 0){
            currentNumberOfWays += recursiveFindWayPossibilities(wPosition, hPosition -1, currentNumberOfWays);
        }
        return 1;
    }
}
