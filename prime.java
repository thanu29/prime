public class PrimeDemo {
    public static void main(String args[]) {
        int num=2,flag=0;
        for(int i=2;i<=num/2;i++)
        {
            if(num % i == 0)
            {
                System.out.println(num+ " is not a prime number");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(num+ " is a prime number");
        }
}
}
