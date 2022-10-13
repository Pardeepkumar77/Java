import java.util.Scanner;
class Operators{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter Number 1:");
        num1=sc.nextInt();
        System.out.println("Enter Number 2:");
        num2=sc.nextInt();
        System.out.println("Sum of both numbers is:"+(num1+num2));
        System.out.println("Difference of both numbers is:"+(num1-num2));
        System.out.println("Product of both numbers is:"+(num1*num2));
        System.out.println("Division of both numbers is:"+(num1/num2));
        System.out.println("Remainder of both numbers is:"+(num1%num2));
        if(num1==num2)
        {
            System.out.println("Both Numbers are Equal");
        }
        else if(num1>num2)
        {
            System.out.println("Number 1:"+num1+" is greater than Number 2:"+num2);
        }
        else
        {
            System.out.println("Number 1:"+num1+" is less than Number 2:"+num2);
        }
    }
}