class Shape{
   public void display(){
        System.out.println("area is defined");
       }
}
class Rectangl extends Shape{
   public void area(){
        System.out.println("shape of a rectangle");

   }
}
class cube extends Rectangl{
public void cube(){
  System.out.println("area of cube");
}}

class area{
public static void main(String[] args){

 cube obj = new cube();
 obj.display();
 obj.area();
 obj.cube();
}
}
