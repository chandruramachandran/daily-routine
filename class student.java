class student {
    int rollno;
    String name;
    int mark;
}

public class Main {
    public static void main(String[] args) {

        student s1 = new student();
        s1.name = "chandru";
        s1.rollno = 12;
        s1.mark = 67;

        student s2 = new student();
        s2.name = "sathish";
        s2.rollno = 52;
        s2.mark = 77;

        student s3 = new student();
        s3.name = "ravi";
        s3.rollno = 112;
        s3.mark = 97;

        student arr[] = new student[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        {
            for (student stud : arr) {
                System.out.println(stud.name + ":" + stud.rollno + ":" + stud.mark);
            }
        }

    }
}
