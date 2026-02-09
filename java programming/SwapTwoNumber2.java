class SwapTwoNumber2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before Swapping a =" + a);
        System.out.println("Before Swapping b =" + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after Swapping a =" + a);
        System.out.println("after Swapping a =" + b);
    }
}