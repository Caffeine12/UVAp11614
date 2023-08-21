import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int testCaseNumber=sc.nextInt();
        int i=1;
        for(i=1;i<=testCaseNumber;i++)
        {
            double sumTestNumber= sc.nextLong();
            double row= (Math.sqrt(1+8*sumTestNumber)/2)-1;
            System.out.println(Math.round(row));                           
        }        
    }
}