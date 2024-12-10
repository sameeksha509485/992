public class prime{
    public static void main(String[] args) {
        int num=12,c=0,f=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            c++;
            if(c>2)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.print("the given number is not prime");
        else
        System.out.print("the given number is prime");
    }
}