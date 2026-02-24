public class ArmStrong {
    public static void main(String[] args) {
        
        int n=153;
        int n1=n;
        int n2=n;
        int count=0;
        int sum=0;

        //calculate the count of digit
        while(n>0){
            count++;
            n/=10;
        }

        //find the power and sum
        while(n1>0){
            int digit=n1%10;
            int pow=1;

            for(int i=1;i<=count;i++){
                pow=pow*digit;
            }
            sum=sum+pow;
            n1=n1/10;
        }

        if(n2==sum) System.out.println("arm strong");
        else System.out.println("not arm strong");
    }
}
