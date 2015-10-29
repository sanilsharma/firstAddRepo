class Static2
{
void m1()
{
}
static void m2()
{
Static2.m1();
}
public static void main(String args[])
{
Static.m2();
}
}