import  java.util.Scanner;

class Shape {

int width;

int length;

Shape (int w,int h) {

width-w;

length=h;

}}

class Rectangle extends Shape

{

Rectangle(int w,int h) {

super(w,h);}

void display(){

2 System.out.println("width:"+width+"length:"+length);

void area ()

int area=width*length;

2 System.out.println("area"+area);

(}}

class area{

public static void main(String[] args){

Scanner input-new Scanner(System.in);

System.out.println("enter length and breadth");

int 1-input.nextInt(); int b-input.nextInt();

Rectangle obj-new Rectangle(1,b);

obj.display();

obj.area();
