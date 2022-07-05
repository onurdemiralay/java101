import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hiringYear;
    NumberFormat formatter = new DecimalFormat("#0.0");

    public Employee(String name, double salary, int workHours, int hiringYear){
        this.name = name;
        this.salary = salary;
        if (this.salary < 0){
            this.salary = 0;
        }
        this.workHours = workHours;
        if (this.workHours < 0){
            this.workHours = 0;
        }
        this.hiringYear = hiringYear;
        if (this.hiringYear > 2022){
            this.hiringYear = 0;
        }
    }

    public double tax(){
        if (this.salary < 1000.0){
            return 0.0;
        }
        else{
            return this.salary * 0.03;
        }
    }

    public double bonus(){
        if (this.workHours > 40){
            return ((this.workHours - 40) * 30.0);
        }
        else{
            return 0.0;
        }
    }

    public double raiseSalary(){
        int totalWorkingYear = 2022 - this.hiringYear;
        if (totalWorkingYear < 10){
            return this.salary * 0.05;
        }
        else if (totalWorkingYear > 10 && totalWorkingYear < 20) {
            return this.salary * 0.1;
        }
        else{
            return this.salary * 0.15;
        }
    }

    public void employeeInfo(){
        System.out.println("Adý : " + this.name + "\n" + "Maaþý : " + this.salary + "\n" + "Çalýþma Saati : " + this.workHours + "\n" + "Baþlangýç Yýlý : " + this.hiringYear + "\n" + "Vergi : " + formatter.format(tax()) + "\n" + "Bonus : " + formatter.format(bonus()) + "\n" + "Vergi ve Bonuslar Dahil Maaþ : " + formatter.format(this.salary + bonus() - tax()) + "\n" + "Toplam Maaþ : " + formatter.format(this.salary + bonus() - tax() + raiseSalary()));
    }
}
