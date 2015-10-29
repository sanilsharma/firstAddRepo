class A
{
public A(String s)
{
System.out.print("B");
}
}
public class B extends A
{
public B(String s)
{
System.out.print("D");
}
public static void main(String args[])
{
new B("C");
System.out.println(" ");
}
}