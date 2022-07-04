import java.util.zip.CheckedOutputStream;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayþe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        mat.printTeacher();
        fizik.printTeacher();
        kimya.printTeacher();

        Student s1 = new Student("Ýnek Þaban", 1, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 30, 20,10,40, 70);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 2, "140144015", mat, fizik ,kimya);
        s2.addBulkExamNote(100, 85, 50,65, 40, 40);
        s2.isPass();

        Student s3 = new Student("Hayta Ýsmail", 3, "140144015", mat, fizik, kimya);
        s3.addBulkExamNote(80, 75, 75, 60,30, 55);
        s3.isPass();
    }
}