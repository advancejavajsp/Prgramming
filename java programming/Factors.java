class Factors{
    public static void main(String[] args) {
        
        int n=6;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            {
                count++;
                System.out.print(i+ " ");
            }
        }

           if(count==2)
            System.out.println("prime");
           else
            System.out.println("not prime");





         System.err.println();
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
            {
                System.out.print(i+ " ");
            }
        }
        System.out.print(n);
    }
}