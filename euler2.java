import java.util.ArrayList;
public class euler2{
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(1);
        fibonacci.add(2);
        int lastNum = 0;
        int counter = 1;
        while(lastNum <= 4000000){
                lastNum = fibonacci.get(i-1) + fibonacci.get(i);
                fibonacci.add(lastNum);
                counter++;
        }
        ArrayList<Integer> evenFibonacci = new ArrayList<Integer>();
        for(int i = 0; i<fibonacci.size(); i++){
            if(fibonacci.get(i)%2 == 0){
                evenFibonacci.add(fibonacci.get(i));
            }
        }
        int sum = 0;
        for(int j = 0; j<evenFibonacci.size(); j++){
            sum += evenFibonacci.get(j);
        }
        System.out.println(sum);
    }
}