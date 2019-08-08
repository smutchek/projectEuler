import java.util.ArrrayList;
public class euler1{
    int sumOfAll;
    ArrayList<Integer> allNums = new ArrayList<Integer>();
    public euler1(int sum, ArrayList<Integer> all){
        int sumOfAll = sum;
        ArrayList<Integer> allNums = all;
    }
    public static void main(String[] args) {
        euler1 a = new euler1(0, all);
        for(int i = 1; i<= 1000; i++){
            if(i%3 == 0 || i%5 == 0){
                a.allNums.add(i);
            }
        }
        for(int j = 0; j <= a.allNums.length(); j++){
            a.sumOfAll += a.allNums.get(j);
        }
        System.out.println(a.sumOfAll);
    }
}