public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int viva;
    double result;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.viva = 0;
        this.note = 0;
        this.result = 0.0;
    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Ýþlem Baþarýlý!");
        }
        else{
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        }
        else {
            System.out.println(this.name + " dersine Akademisyen atanmamýþtýr.");
        }
    }
}
