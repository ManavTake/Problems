import java.util.Scanner;

class Employee
{
    static int empid;
    static String empname;
    static int empnohrs;
    static Double empbasic,emphra,empda,empit,empgross;
    
    static void setvalues()
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the Employee details");
        System.out.println("Employee name: ");
        empname=ip.next();
        System.out.println("Employee ID: ");
        empid=ip.nextInt();
        System.out.println("Employee num of hours: ");
        empnohrs=ip.nextInt();
        
        System.out.println("Employee basic,hra,da & it :");
        empbasic=ip.nextDouble();
        emphra=ip.nextDouble();
        empda=ip.nextDouble();
        empit=ip.nextDouble();
    }
    
    static double calculate()
    {
        empgross = empbasic + empbasic*(emphra+empda+empit)*0.01;
        System.out.println("Employee gross salary is: "+empgross);
        return empgross;
    }
    
    static void overtime()
    {
        if(empnohrs>200)
            empgross=empgross + 100*(empnohrs-200);
        System.out.println("Emp sal after checking overtime is :"+empgross);    
    }
    
    static void getvalues()
    {
        System.out.println("Employee details are: ");
        System.out.println("Employee name & ID: "+empname+" "+empid);
        System.out.println("Employee basic salary: "+empbasic);
    }
}

class Main
{
    public static void main(String args[])
    {
    Employee ob = new Employee();
    ob.setvalues();
    ob.getvalues();
    ob.calculate();
    ob.overtime();
    }
}
