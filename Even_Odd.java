import java.util.Scanner;
class Even_Odd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter any Number:");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Entered number is an even number");
        }
        else
        {
            System.out.println("Entered number is an odd number");
        }
    }
}