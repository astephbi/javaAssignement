//This Class helps me trying a method
public class TryingMethods {

    public static void main(String[] args) {
        
          String day = dayWeek(3);
          System.out.println(day);
         
        System.out.println((addNumbers()));
    };

    public static int addNumbers() {
        // adding numbers up to 1000
        int i = 0;
        int result = 0;
        while (i < 1000) {

            result += i;
            i++;
        }
        return result;
    }

    public static String dayWeek(int dayOfTheWeek) {
        // display dayOfTheWeek
        switch (dayOfTheWeek) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Type a number from 1 to 8";
        }
    }

    public void myName(String message) {
        // display a message depending on the input
        if (message == "Alex") {
            System.out.println(message);
        } else if (message == "Zan Bi") {
            System.out.println(message + "Zan Bi");

        } else {
            System.out.println("Enter your name");
        }
    }

    public static void evenNumbers() {
        int sumOfEven = 0;

        for (int i = 12; i < 103; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            } else
                ;

        }
        System.out.println(sumOfEven);

    }
}
