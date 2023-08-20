import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int testCaseNumber=sc.nextInt();
        int i=1;
        for(i=1;i<=testCaseNumber;i++)
        {
            int j=1,row=0;
            int testNumber= sc.nextInt();
            int remainder=testNumber;
                while(remainder>row)
                {
                    remainder=remainder-j;
                    row++;
                    j++;

                }
                System.out.println(row);                
        }
    }
}
