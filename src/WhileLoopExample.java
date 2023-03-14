//Prompt the user for a number between 1 and 100.
//If the value entered is NOT a number between 1 and 100, display a descriptive error message.
//Display all ODD numbers between 1 and the number entered (using a while loop)

public class WhileLoopExample {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter an integer between 1 and 100. 100 is ");
        int number = input.nextInt(), startNumber = 1;
        if(number >= 1 && number <= 100) {
            while (startNumber <= number) {
                System.out.println(startNumber);
            }
        }else {
            System.out.println("Invalid number entered");
        }
    }
}
