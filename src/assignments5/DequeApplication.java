package assignments5;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApplication {
    public static boolean isValid(String data) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : data.toCharArray()) {
            if (c == '(') {
                deque.push(c);

            } else if (c == ')') {
                if (deque.isEmpty() || deque.pop() != '(') {
                    return false;
                }
            } else ;
        }

        return deque.isEmpty();
    }
    public static boolean isValidInteger(int[] data) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < data.length; i++) {
            deque.push(data[i]);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
    public static void main(String[] args){

        String x1="((()))";
        System.out.println("isValid x1 = " +isValid(x1));//true
        String x2="))(()";
        System.out.println("isValid x2 = " + isValid(x2));//false
        String x3=")))))))";
        System.out.println( "isValid x3 = " +isValid(x3));//false
        System.out.println( "---------------------------");
        int []arr1={1,2,3,3,2,1};
        System.out.println("isValidInteger arr1 = " +isValidInteger(arr1));//true
        int []arr2={1,1,3,3,4,1};
        System.out.println("isValidInteger arr2 = " +isValidInteger(arr2));//false
        int []arr3={1,2,2,3,2,1};
        System.out.println( "isValidInteger arr3 = " +isValidInteger(arr3));//false

    }
}
