import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int testCaseNumber=sc.nextInt();
        int i=1;
        for(i=1;i<=testCaseNumber;i++)
        {
            long sumTestNumber= sc.nextLong();

            long row= (long)(Math.ceil((((Math.sqrt(1+8*sumTestNumber))/2)-1)));
            System.out.println(row);                
        }
    }
}