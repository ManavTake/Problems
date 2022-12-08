import java.util.Scanner;

public static void PrimeNo{

public static void main(String args[])
{
Scanner ip= new Scanner(System.in);
System.out.println("Enter the start and end numbers: ");
int n = ip.nextInt();
int m = ip.nextInt();

printPrimeBetween(n,m);
}

public static void printPrimeBetween(int start,int end)
{
for(int i=start; i<=end;   i++)
{
if (isPrime(i))
System.out.println(i +" ");
}
}

public static boolean isPrime(int x)
{
   for(int i=2; i<=x/2 ; i++)
        {
            if (x % i == 0)
            return false;
        }
   return true;
}

}