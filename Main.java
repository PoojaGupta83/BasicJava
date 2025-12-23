//Day 1:.equals vs ==
class Main{
public static void main(String args[]){
String a="java";//store in string constant pool 
String b="java";//store in string constant pool
System.out.println(a==b);//check memory location
System.out.println(a.equals(b));//check java content

String x="Java";//store in string constant pool
String y=new String("Java");//store in heap
System.out.println(x==y);//check memory location
System.out.println(x.equals(y));//check content

String i=new String("java");//store in heap
String j=new String("java");//store in heap
System.out.println(i==j);//different object same memory location
System.out.println(i.equals(j));//check content 



}
}
