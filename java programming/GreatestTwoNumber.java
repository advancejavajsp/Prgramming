class GreatestTwoNumber{
    public static void main(String[] args) {
        
        int a=10;
        int b=20;

        if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }


         //Conditonal Operator
    String res= a>b?"a is greater":"b is greater";
    System.out.println(res);
    }

   
}