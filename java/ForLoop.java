class ForLoop
{
public static void main(String args[])
{
outer:for(int i=0;i<2;i++)
{
inner:for(int j=0;j<5;j++)
{
if(j==2)
{
continue outer;
}
System.out.println("i = "+i+",j = "+j);
}
System.out.println("Outside the inner loop");
}
System.out.println("Outside the outer loop");
}
}