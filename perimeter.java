import java.util.Scanner;
class Perimeter
{
     public static void main(String args[])
     {
     System.out.println("enter the length and breadth");
     Scanner input=new Scanner(System.in);
     int l,b,perimeter;
     l=input.nextInt();
     b=input.nextInt();
     perimeter=2*l*b;
     System.out.println("perimeter of rectangle is"+perimeter);
}
}
