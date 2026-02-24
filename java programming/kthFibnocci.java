public class kthFibnocci {
     public static void main(String[] args) {
      int n1=0;
      int n2=1;
      int i=1;
      int k=5;
      while(i<k){
      
      int n3=n1+n2;
      n1=n2;
      n2=n3;

      i++;
      
      }
      System.out.print(n1+" ");
    }
}
