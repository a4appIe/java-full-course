public class SwitchCase {
    public static void main(String[] args) {
        String a = "monday";
        String res = "";
        // switch (a){
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Enter a valid number");
        // }

        // switch (a) {
        // case "monday" -> System.out.println("monday");
        // case "tuesday" -> System.out.println("tuesday");
        // default -> System.out.println("sunday");
        // }

        // res = switch (a){
        // case "monday" -> "monday";
        // case "tuesday" -> "tuesday";
        // default -> "sundayy";
        // };

        res = switch (a) {
            case "monday":
                yield "monday";
            case "tuesday":
                yield "tuesday";
            default:
                yield "sundayy";
        };
        System.out.println(res);
    }
}