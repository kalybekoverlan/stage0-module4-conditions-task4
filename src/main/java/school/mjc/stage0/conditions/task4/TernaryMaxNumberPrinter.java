package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greatest;
        greatest = first > second ? first : second;
        greatest = third > greatest ? third: greatest;
        System.out.println(greatest);
    }
}
