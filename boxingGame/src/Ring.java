public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int round;
    int whoStart = (int) (Math.random()*2);

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.round = 1;
    }

    public void start(){
        if (whoStart == 1) {
            System.out.println("Maça Baþlayan : " + this.f1.name + "!");
        }
        else{
            System.out.println("Maça Baþlayan : " + this.f2.name + "!");
        }
    }
    public void fight(){
        if (checkWeight()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=== ROUND " + this.round + " ===");
                if (whoStart == 1){
                    this.f2.health = this.f1.hit(this.f2);
                    this.f1.health = this.f2.hit(this.f1);
                }
                else{
                    this.f1.health = this.f2.hit(this.f1);
                    this.f2.health = this.f1.hit(this.f2);
                }
                if (isWin()) {
                    break;
                }
                printScore();
                this.round++;
            }
        }
        else{
            System.out.println("Sporcularýn aðýrlýklarý uyuþmuyor!");
        }
    }
    public boolean checkWeight(){
        return (this.f1.weight >= this.minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public void printScore(){
        System.out.println();
        System.out.println(this.f1.name + " Boksörünün Kalan Saðlýðý: " + this.f1.health);
        System.out.println(this.f2.name + " Boksörünün Kalan Saðlýðý : " + this.f2.health);
    }
    public boolean isWin(){
        if (this.f1.health == 0 && this.f2.health == 0) {
            printScore();
            System.out.println("BERABERE!");
            return true;
        }
        if (this.f1.health == 0){
            printScore();
            System.out.println(this.f2.name + " KAZANDI!");
            return true;
        }
        else if (this.f2.health == 0){
            printScore();
            System.out.println(this.f1.name + " KAZANDI!");
            return true;
        }
        else{
            return false;
        }
    }

}
