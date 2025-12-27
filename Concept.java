class Concept{

public static void main(String args[]){ 
String s="hello";
s=s+"World";//new object is created
System.out.println(s);
StringBuilder sb=new StringBuilder();
sb.append("Hello");
sb.append("World");//existing object is updated,fast and memory-efficient
System.out.println(sb);
StringBuffer sf=new StringBuffer();
sf.append("hello");
sf.append("world");//existing object is updated ,slow due to locking and thread-safe
System.out.println(sf);



}
}