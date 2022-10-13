import java.util.Scanner;
class Cpn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float matric,inter,test,cpn;
        System.out.println("Enter your percentage in Matric:");
        matric=sc.nextFloat();
        System.out.println("Enter your percentage in Intermediate:");
        inter=sc.nextFloat();
        System.out.println("Enter your Test Marks:");
        test=sc.nextFloat();
        cpn=(matric*0.1f)+(inter*0.3f)+(test*0.6f);
        System.out.println("Your cpn is:"+cpn);        
    }
}
