public class Switch1 {
    public static void main(String[] args) {

        String day = "thursday";
        switch (day) {
            case "monday":
                System.out.println("Basketball");
                break;
            case "tuesday":
                System.out.println("Tennis");
                break;

            case "wednesday":
                System.out.println("Basketball");
                break;

            case "thursday":
                System.out.println("Cricket");
                break;

            case "friday":
                System.out.println("Fotball");
                break;

            case "saturday":
                System.out.println("Excerise");
                break;

            case "sunday":
                System.out.println("Holiday");
                break;

            default:
                System.out.println("invalid "+day);
                break;
        }
    }
}
