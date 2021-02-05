import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrogProblem {

    public static void main(String[] args) {

        int x = 5;
        int[] arr = {1,2,1,4,2,3,5,4};
        System.out.println(solution(x,arr));
    }

    private static int solution(int x, int[] arr) {
        Map<Integer, Integer> mapArr = new HashMap<Integer, Integer>();
        for (int i=0; i< arr.length; i++) {
            mapArr.put(i, arr[i]);
        }
        List resultArr = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry : mapArr.entrySet()) {
            if(!resultArr.contains(entry.getValue())) {
                resultArr.add(entry.getValue());
                if(resultArr.size() == x) {
                    return entry.getKey();
                }
            }

        }
        return -1;
        }
    }
