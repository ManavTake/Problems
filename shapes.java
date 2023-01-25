import java.util.Scanner;

abstract class shape
{
    static int r,h;
    static void set_two_dim(int x,int y)
    {
        r=x;
        h=y;
    }
    static void set_one_dim(int x)
    {
        r=x;
    }
    abstract void printArea();
    abstract void printVolume();
}

class Cylinder extends shape
{
    void printArea()
    {
        double area=2*r*Math.PI*(r+h);
        System.out.println("Area is :"+area);
    }
    void printVolume()
    {
        double vol=Math.PI*r*r*h;
        System.out.println("VOlume is :"+vol);
    }
}

class Cone extends shape
{
    void printArea()
    {
        double x = Math.pow((r*r+h*h),0.5);
        double area=r*Math.PI*(r+x);
        System.out.println("Area is :"+area);
    }
    void printVolume()
    {
        double vol=Math.PI*r*r*h*1/3;
        System.out.println("VOlume is :"+vol);
    }
}

class Sphere extends shape
{
    void printArea()
    {
        double area=4*r*Math.PI*r;
        System.out.println("Area is :"+area);
    }
    void printVolume()
    {
        double vol=Math.PI*r*r*r*4/3;
        System.out.println("VOlume is :"+vol);
    }
}


class Main
{
    public static void main (String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        int c,dim1,dim2;
        
        while(true)
        {
            System.out.println("\n1.Cyclinder\n2.Cone\n3.Sphere\n");
            System.out.print("Enter choice: ");
            c=ip.nextInt();
            
            switch(c)
            {
                case 1: System.out.println("Enter the radius & height: ");
                        dim1=ip.nextInt();
                        dim2=ip.nextInt();
                        Cylinder cyl = new Cylinder();
                        cyl.set_two_dim(dim1,dim2);
                        cyl.printArea();
                        cyl.printVolume();
                        break;
                        
                case 2: System.out.println("Enter the radius & height: ");
                        dim1=ip.nextInt();
                        dim2=ip.nextInt();
                        Cone co=new Cone();
                        co.set_two_dim(dim1,dim2);
                        co.printArea();
                        co.printVolume();
                        break;        
                case 3: System.out.println("Enter the radius: ");
                        dim1=ip.nextInt();
                        Sphere sp=new Sphere();
                        sp.set_one_dim(dim1);
                        sp.printArea();
                        sp.printVolume();
                        break;        
                default: System.out.println("Invalid choice!!");  
                         break;
            }
        }
        
        
    }
}
