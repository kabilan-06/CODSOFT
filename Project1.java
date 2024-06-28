import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
            String choice;
        Scanner scan = new Scanner(System.in);
        while(true){
            // String yes="Yes";
        int num,Score=10;
        int randnum = (int)(Math.random()*101);
        for(int i=0;i<11;i++)
        {
            if(i==10)
            {
                System.out.println("Attempt limit exceds.");
                break;
            }
            System.out.println("Guess the random number from 0 to 100 : ");
            num = scan.nextInt();
            if(num==randnum)
            {
                System.out.println("Your Score Is "+Score+" out of 10");
                break;
            }
            else if(num>randnum)
            {
                System.out.println("Your Input is Too High");
            }
            else if(num<randnum)
            {
                System.out.println("Your Input is Too Low");
            }
                Score--;
        }
        System.out.println("If You Don't Want to Play Again Then Type\"No\" : ");
        choice = scan.next();
        if(choice.equals("No"))
        {
            break;
        }
        }
    }
}