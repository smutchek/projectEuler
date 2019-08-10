import java.util.ArrayList;

public class euler1 {
    public static void main(String[] args) {
        int sumOfAll = 0;
        ArrayList<Integer> allNums = new ArrayList<Integer>();
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                allNums.add(i);
            }
        }
        for (int j = 0; j < allNums.size(); j++) {
            sumOfAll += allNums.get(j);
        }
        System.out.println(sumOfAll);
    }
}