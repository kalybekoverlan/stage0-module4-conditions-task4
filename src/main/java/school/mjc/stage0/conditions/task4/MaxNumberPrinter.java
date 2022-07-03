package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greatest;

        if(first > second)
            greatest = first;
        else
            greatest = second;

        if (third > greatest)
            greatest = third;
        else greatest = greatest;

        System.out.println(greatest);
    }
}
