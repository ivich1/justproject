import TraiderSequence.TraderSequenseAnalyzer;

public class Main {

    public static void main(String[] args) {

        //про робота
        //ExampleCases exampleCases = new ExampleCases();//все примеры засунул сюда
        //RobotPathFinder r = new RobotPathFinder(exampleCases.examples.get(4));

        //System.out.println(r.findNumberEmptyField(3,3));//пустое поле
        //System.out.println(r.findNumberWaysSimpleCase());//поиск по текущему полю
        //r.PrintWays();

        //про кодировку
        //String source = "burger";
        //String encodedS = BurgerEncoder.burgerEncode(source);
        //String decodedS = BurgerEncoder.burgerDecode(encodedS);
        //System.out.println(source);
        //System.out.println(encodedS);
        //System.out.println(decodedS);
        //System.out.println(source.equals(decodedS));

        //про трейдера
        int[] source1 = {5,-3,-3,5,5,-3,5,-3, -3, 10};//14 (начиная с 3 и до конца)
        int[] source2 = {10,-6,5,-6,10};//13 (весь)
        TraderSequenseAnalyzer t = new TraderSequenseAnalyzer(source2);
        System.out.println("-------");

        System.out.println(t.findMaxLinear(source1));


    }
}
