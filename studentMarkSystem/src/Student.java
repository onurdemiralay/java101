public class Student {
    String name;
    int stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

     Student(String name, int stuNo, String classes, Course mat, Course fizik, Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int matViva, int fizik, int fizikViva, int kimya, int kimyaViva){
         if ((mat >= 0 && mat <= 100) && (matViva >= 0 && matViva <= 100)){
             this.mat.note = mat;
             this.mat.viva = matViva;
             this.mat.result = ((mat * 0.80) + (matViva * 0.20));
         }

         if ((fizik >= 0 && fizik <= 100) && (fizikViva >= 0 && fizikViva <= 100)){
             this.fizik.note = fizik;
             this.fizik.viva = fizikViva;
             this.fizik.result = ((fizik * 0.80) + (fizikViva * 0.20));
         }

         if ((kimya >= 0 && kimya <= 100)&& (kimyaViva >= 0 && kimyaViva <= 100)){
             this.kimya.note = kimya;
             this.kimya.viva = kimyaViva;
             this.kimya.result = ((kimya * 0.80) + (kimyaViva * 0.20));
         }
    }

    public void isPass(){
         if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0){
             System.out.println("Notlar tam olarak girilmemiþ!");
         }
         else{
            this.isPass = isCheckPass();
            printNote();
             System.out.println("Ortalama : " + String.format("%.2f" , this.avarage));
             if (this.isPass){
                 System.out.println("Sýnýfý Geçti.");
             }
             else{
                 System.out.println("Sýnýfta Kaldý.");
             }
         }
    }
    public void calcAvarage(){
        this.avarage = (this.mat.result + this.fizik.result + this.kimya.result) / 3;
    }
    public boolean isCheckPass(){
         calcAvarage();
         return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=======================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + String.format("%.2f" , this.mat.result));
        System.out.println("Fizik Notu : " + String.format("%.2f" , this.fizik.result));
        System.out.println("Kimya Notu : " + String.format("%.2f" , this.kimya.result));
    }
}
