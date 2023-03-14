//Sum all numbers from 1 to 10 using a while loop.


public class WhileLoop {
    public static void main(String[] args){
        int number = 1;
        int sum = 0;
        while(number <= 10){
            sum += number;
            number++;
        }
        System.out.println("Sum: " + sum);
    }
}
