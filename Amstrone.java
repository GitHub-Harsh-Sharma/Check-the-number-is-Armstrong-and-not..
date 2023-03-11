import java.io.*;
class Amstrone
{
    public static void main(String args[])throws IOException
    {
        int num, rev, arm = 0, copy;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the 3 Digit no:");
        num=Integer.parseInt(br.readLine());
        copy=num;
        rev=(num%10);
        arm=(rev*rev*rev)+arm;
        num=num/10;
        rev=(num%10);
        arm=(rev*rev*rev)+arm;
        num=num/10;
        rev=(num%10);
        arm=(rev*rev*rev)+arm;
        if (copy==arm)
        {
            System.out.print(":no. is Amstrone");
        }
        else
        {
            System.out.print(":no. is not a Amstrone");
        }
    }
}

