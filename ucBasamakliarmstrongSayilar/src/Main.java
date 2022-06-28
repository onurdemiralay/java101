public class Main {
    public static void main(String[] args) {
        int armNumber = 0;

        for (int number = 100; number < 1000; number++){
            int tempNumber, digitNumber = 0, digitValue, digitPow, result = 0;
            
            tempNumber = number;

            while(tempNumber != 0){
                tempNumber /= 10;
                digitNumber++;
            }
            tempNumber = number;

            while(tempNumber != 0){
                digitValue = tempNumber % 10;
                digitPow = 1;

                for (int i = 1; i <= digitNumber; i++){
                    digitPow *= digitValue;
                }
                result += digitPow;
                tempNumber /= 10;
            }
            if (result == number){
                System.out.println(number+ " bir Armstrong Sayidir!");
                armNumber++;
            }
        }
        System.out.println("Üç basamaklı toplam Armstrong sayısı : "+ armNumber);
    }
}