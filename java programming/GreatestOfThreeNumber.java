public class GreatestOfThreeNumber {
    
// Design an app to read age of three siblings Ramu,
// Raghu and Raju and store them in a variable. 
// The app when executed  should display the age 
// of the  youngest sibling. 

    public static void main(String[] args) {
        
        int a=10,b=20,c=30;

        if(a>b){
            if(a>c){
                System.out.println("a is greater");
            }
            else{
                System.out.println("c is greater");
            }
        }else{
            if(b>c){
                System.out.println("b is greater");
            }
            else{
                System.out.println("c is greater");
            } 
        }
    }
}
