public class JavaSwitch {
    public static void main(String[] args) {
        System.out.println("Lesson 8: Switch");
        int today = 4;
        switch (today) {
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Today is not {Mon, Tue, Wed}");
                break;
        }
    }
}
