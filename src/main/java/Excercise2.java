import java.util.*;

public class Excercise2 {
    public static void main(String[] args) {
        int myNum = 22;
        System.out.println(getAllEvensToNum(myNum));
    }
    public static boolean isEven(int x){
        return x%2==0;
    }
    public static List<Integer> getAllEvensToNum(int total){
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 1; intList.size() <= total; i++) {
            if (isEven(i)) {
                intList.add(i);
            }
        }
        return intList;
    }
}
