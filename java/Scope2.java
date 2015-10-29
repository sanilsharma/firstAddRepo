class Scope2 
{
    public static void main(String args[])
    {
        int i=10;
        System.out.println("i="+i);
        if (i==10)
        {
            int j=20;
            i=20;
            System.out.println("i="+i+" , j="+ j);
        }
        //System.out.println("i="+i+" , j="+ j);
    }
}