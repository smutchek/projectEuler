import java.util.ArrayList;

public class euler1 {
    // wrong - don't need a constructor if you're using a static method. don't need to create  instance fields, just make them variables
    // public euler1(int sum, ArrayList<Integer> all){
    // sumOfAll = sum;
    // allNums = all;
    // }
    public static void main(String[] args) {
        int sumOfAll = 0;
        ArrayList<Integer> allNums = new ArrayList<Integer>();
        // wrong - Don't need to create new object - its a static method
        // ArrayList<Integer> next = new ArrayList<Integer>();
        // euler1 a = new euler1(0, next);
        for (int i = 1; i <= 1000; i++) {
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