import java.util.Scanner;

public class Nameage{

public static void Name()
{
Scanner sc1= new Scanner(System.in);
System.out.println("Enter the name: ");
String name= sc1.inputLine();
System.out.println("The name is : " +name);
}

public static void Age()
{
Scanner sc2= new Scanner(System.in);
System.out.println("Enter the age: ");
String age= sc2.inputInt();
System.out.println("The age is : " +age);
}

public static void main()
{
Name();
Age();
System.out.println("End");
}

}