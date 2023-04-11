package assignments1;

public class task_1 {

    static void even_numbers(){
        System.out.println("                           ");
        System.out.println("Even numbers");

        int sum1=0;
        int sum2=0;
        int sum3=0;
        for (int i = 0; i <= 100; i++) {
            if (i%2==0)
                sum1 += i;
        }
        System.out.println("sum of even numbers from 0 to 100 using for loop : "+sum1);

        int  num=0;
        while (num<=100) {
            if (num % 2 ==0)
                sum2 += num;
            num++;
        }
        System.out.println("sum of even numbers from 0 to 100 using while loop : "+sum2);
        int num1=0;
        do{
            if (num1 % 2 ==0) {
                sum3 += num1;
            }
            num1++;
        } while (num1 <=100);
        System.out.println("sum of even numbers from 0 to 100 using ( do while loop) : "+sum3);
    }
    static void odd_numbers(){
        System.out.println("                           ");
        System.out.println("odd numbers");
        int sum1=0;
        int sum2=0;
        int sum3=0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0)
                sum1 += i;
        }
        System.out.println("sum of odd numbers from 0 to 100 using for loop : "+sum1);

        int  num=0;
        while (num<=100) {
            if (num % 2 != 0)
                sum2 += num;
            num++;
        }
        System.out.println("sum of odd numbers from 0 to 100 using while loop : "+sum2);

        int num1=0;
        do{
            if (num1 % 2 != 0) {
                sum3 += num1;
            }
            num1++;
        } while (num1 <=100);
        System.out.println("sum of even numbers from 0 to 100 using ( do while loop) : "+sum3);

    }

    static void divided_by_seven(){
        System.out.println("                           ");
        System.out.println("Divided by 7");
        int sum1=0;
        int sum2=0;
        int sum3=0;
        for (int i = 0; i <= 100; i++) {
            if (i  % 7 ==0)
                sum1 += i;
        }
        System.out.println("sum of Divided by 7 from 0 to 100 using for loop : "+sum1);

        int  num=0;
        while (num<=100) {
            if (num  % 7 ==0)
                sum2 += num;
            num++;
        }
        System.out.println("sum of Divided by 7 from 0 to 100 using while loop : "+sum2);

        int num1=0;
        do{
            if (num1  % 7 ==0) {
                sum3 += num1;
            }
            num1++;
        } while (num1 <=100);
        System.out.println("sum of Divided by 7 from 0 to 100 using ( do while loop) : "+sum3);


    }


    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        System.out.println("                           ");
         even_numbers();
        System.out.println("  //////    /////     /////     ////           ");
         odd_numbers();
        System.out.println("  //////    /////     /////     ////           ");
        divided_by_seven();


    }


}
