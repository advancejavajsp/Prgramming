public class PrimeSeries {
    
    public static void main(String[] args) {   
        int start=1;
        int end=10;
      
      for(int j=start;j<=end;j++){ //n
        int n=j;
        //checking it is prime or not
        int count=0;
        for(int i=1;i<=n;i++){ //n
            if(n%i==0){
               count++;
            }

        }
        if(count==2){
            System.out.println(n);
        }
    }
}
}
