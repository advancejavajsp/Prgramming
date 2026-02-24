public class CountOfDigits {
    public static void main(String[] args) {
       int count=0;
        int n=123;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
// find a count of digits in given postive  number
//    123 -> 3
//    23  ->2
//    1  -> 1
//    12345 ->5


//   reverse the number 
//    123 --> 321
//    21 --> 12

/**
 * fomrula
 *  remove last digit number          num/10
 *  fetch/get last digit number       num%10
 *  add digit                         num*10+digit
 *  */  
   
  