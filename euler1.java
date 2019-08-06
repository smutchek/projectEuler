import java.util.ArrrayList;
public class euler1{
    int sumOfAll;
    ArrayList<Integer> allNums;
    for(int i = 1; i<= 1000, i++){
        if(i%3 == 0 || i%5 == 0){
            allNums.add(i);
        }
    }
    for(int j = 0; j <= allNums.length(); j++){
        sumOfAll += allNums.get(j);
    }
    System.out.println(sumOfAll);
}