class Array
{
public static void main(String args[])
{
int [][] A=new int [3][];
A[0]=new int [3];
A[1]=new int [1];
A[2]=new int [4];
System.out.println(A.length);
System.out.println(A[0].length);
System.out.println(A[1].length);
System.out.println(A[2].length);
for(int i=0;i<A.length;i++)
for(int j=0;j<A[i].length;j++)
System.out.println(A[i][j]);
}
}