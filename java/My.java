class My
{
public static void main(String args[])
{
//String[] first={"mei","tu"};
String[] second={"pagal","bevkoof","nalayak"};
String[] third={"hai","nahi hai","kyo hai","kyo nahi hai"};
String[] fourth={"Shubham","Prankur","Yagy","Satyam"};
int l1= fourth.length;
int l2= second.length;
int l3= third.length;
int r1=(int)(Math.random()*l1);
int r2=(int)(Math.random()*l2);
int r3=(int)(Math.random()*l3);
String phrase=fourth[r1]+" "+second[r2]+" "+third[r3];
System.out.println(phrase);
}
}