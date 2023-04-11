package assignments2;

public class task_2 {
    public static int even_numbers(int start,  int end){
        return start>end? 0: (start%2 == 0? start:0)+even_numbers(start+1,end);
    }
    public static int odd_numbers(int start,  int end){
        return start>end? 0: (start%2 != 0? start:0)+odd_numbers(start+1,end);
    }

    public static int divided_by_seven(int start,  int end){
        return start>end? 0: (start%7 == 0? start:0)+divided_by_seven(start+1,end);
    }

    public static void main(String[] args) {


        System.out.println("sum of even  numbers from 0 to 100 using recursion methodology :"+even_numbers(0,100));
        System.out.println("                                                ");
        System.out.println("sum of odd  numbers from 0 to 100 using recursion methodology :"+odd_numbers(0,100));
        System.out.println("                                                ");
        System.out.println("sum of divided_by_seven  numbers from 0 to 100 using recursion methodology :"+divided_by_seven(0,100));

    }

}
