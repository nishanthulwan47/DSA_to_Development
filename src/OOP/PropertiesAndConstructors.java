package OOP;

class Subject {

    private String subID;
    private String name;
    private int maxMArks;
    private int marksObtains;

    public Subject(String subID, String name, int maxMArks) {
        this.subID = subID;
        this.name = name;
        this.maxMArks = maxMArks;
    }

    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMArks() {
        return maxMArks;
    }

    public int getMarksObtains() {
        return marksObtains;
    }

    public void setMaxMArks(int maximumMarks) {
        maxMArks = maximumMarks;
    }

    public void setMarksObtains(int m) {
        marksObtains = m;
    }

    boolean isQualified() {
        return marksObtains >= maxMArks/10+4;
    }

    public String toString() {
        return "\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }
}

public class PropertiesAndConstructors {

    public static void main(String[] args) {

        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101", "DS", 100);
        subs[1] = new Subject("s102", "Algorithms", 101);
        subs[2] = new Subject("s103", "O.S", 900);

        for (Subject subject: subs) {
            System.out.println(subject);
        }
    }


}
