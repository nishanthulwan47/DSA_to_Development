public class NestedSwitch {

    public static void main(String[] args) {

        String Branch = "ABC";
        int year = 2;

        switch (year) {
            case 1:
                System.out.println("elective courses: Advance English, Algebra");
            break;

            case 2:
                //Switch Inside Switch
                //Nested Switch
                switch (Branch) {
                    case "CSE":
                    case "CCE":
                        System.out.println("elective courses: Machine Learning, Big Data");
                    break;

                    case "ECE":
                        System.out.println("Something Stupid some courses");
                    break;

                    default:
                        System.out.println("Elective Courses: Optimization");
                }
        }
    }
}
