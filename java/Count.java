class Count
{
static int i;
Count()
{
i++;
}
static void m1()
{
System.out.println("i = "+i);
}
public static void main(String args[])
{
for(int x=0;x<500;x++)
{
new Count();
}
Count.m1();
}
}