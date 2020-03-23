import java.util.Scanner;
class payment
{
    public static void main(String[] args)
    {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter hours worked");
        float hours=i.nextFloat();
        System.out.println(" ");
        System.out.println("Enter your hourly rate");
        float hrate=i.nextFloat();
        System.out.println("");
        float payment=hours*hrate;
        System.out.println("Total Payment is: "+payment+"Rs ");

    }

}