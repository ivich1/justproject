package TraiderSequence;

import java.util.LinkedList;

//адача в том, что имеется массив с числами
//числа положительные и отицательные
//требуется найти отрезок с максимальной суммой
public class TraderSequenseAnalyzer {

    private final int[] sourсeSequense;


    public TraderSequenseAnalyzer(int[] sourсeSequense){
        this.sourсeSequense = sourсeSequense.clone();
    }

    //находит участок с максимальной прибылью
    //возвращает тоько значение
    public LinkedList<Integer> findOptimizedPart(){
        ///
        ///добавить частные случаи и обработку ошибок
        ///
        LinkedList<Integer> optimizedList = new LinkedList<>();//сокращает все отрицательные и положительные значения до одного
        optimizedList.add(sourсeSequense[0]);

        int length = sourсeSequense.length;
        int currentIndex = 0;
        //начинается с 1, певый элемент уже добавлен
        for (int i = 1; i < length; i++ ){
            // если текущий элемент совпадает с тем, что и последний о оптимизированном списке добавляем к нему
            // иначе добавляем новый элемент
            if(optimizedList.getLast() <= 0 && sourсeSequense[i] <= 0 ){
                int tmp = optimizedList.getLast() + sourсeSequense[i];
                optimizedList.removeLast();
                optimizedList.add(tmp);
            }else if(optimizedList.getLast() > 0 && sourсeSequense[i] > 0 ){
                int tmp = optimizedList.getLast() + sourсeSequense[i];
                optimizedList.removeLast();
                optimizedList.add(tmp);
            }
            else{
                optimizedList.add(sourсeSequense[i]);
            }
        }

        return optimizedList;
    }

    //функция работает, и работает правильно
    //не уверен всегда ли хорошо работает
    //функция не может затерпеть затяжной непостоянный минус, чтобы выйти в плюс, хотя иногда может
    //суть в том, что мы записывает все, в сумму, параллельно ища все, что меньше
    //результатом будет все минус наименьше
    public int findMaxLinear(int [] source){
        int res = source[0];
        int currentSum = 0;
        int min_sum = 0;
        for(int i = 0; i< source.length; ++i){
            currentSum+= source[i];
            res = Integer.max(res, currentSum - min_sum);
            min_sum = Integer.min(min_sum, currentSum);
        }
        return res;
    }
}
