package ProblemSolving;

public class IllustrateUseOFEnum {

    public enum Day {Mon, Tue, Wed, Thursday, Friday, Saturday,Sunday}

    public static void main(String[] args) {

        Day[] DayNow = Day.values(); // This is how you Declare Enum

        // Iterating using For Each Loop

        for (Day Now : DayNow) {
            switch (Now) {
                case Sunday: {
                    System.out.println("Sunday");
                }
                break;

                case Saturday: {
                    System.out.println("Saturday");
                }
                break;

                case Friday: {
                    System.out.println("Friday");
                }
                break;

                case Thursday: {
                    System.out.println("Thursday");
                }
                break;

                case Wed: {
                    System.out.println("Wednesday");
                }
                break;

                case Tue: {
                    System.out.println("Tuesday");
                }
                break;

                case Mon: {
                    System.out.println("Monday");
                }
                break;
            }
        }







    }
}
