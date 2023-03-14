import java.util.Scanner;
public class LoopsNeed {
    public static void main(String[] args){
        String name = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter as many names as you like, entering \"End\" to stop ");
        name = input.nextLine();

        while(!name.equalsIgnoreCase("End"));
        {
            System.out.println("Hi, " + name);
            name = input.nextLine();
        }
    }
}
