public class Match {
    Fighter f1;
    Fighter f2;
    int minweight;
    int maxweight;

    Match(Fighter f1, Fighter f2, int minweight, int maxweight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minweight = minweight;
        this.maxweight = maxweight;
    }


    boolean isWin () {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " KAZANDI");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " KAZANDI");
            return true;
        }
        return false;
    }

        boolean isCheck() {
            return (this.f1.weight >= minweight && this.f1.weight <= maxweight) && (this.f2.weight >= minweight && this.f2.weight <= maxweight);
        }

    void run() {
        double randomNumber=Math.random()*100;
                if (isCheck()) {
                    while (this.f1.health > 0 && this.f2.health > 0) {
                        System.out.println("====YENİ ROUND====");
                        if (randomNumber>=50){
                            this.f2.health = this.f1.hit(this.f2);
                            if (isWin()) {
                                break;
                            }
                            this.f1.health = this.f2.hit(this.f1);
                            if (isWin()) {
                                break;
                            }

                        }else {
                            this.f1.health = this.f2.hit(this.f1);
                            if (isWin()) {
                                break;
                            }
                            this.f2.health = this.f1.hit(this.f2);
                            if (isWin()) {
                                break;
                            }
                        }


                    System.out.println(this.f1.name + " 'nın Sağlığı : " + this.f1.health);
                    System.out.println(this.f2.name + " 'nın Sağlığı : " + this.f2.health);

                    }

                } else{
                    System.out.println("Sporcuların sikletleri uyuşmuyor. ");
            }
    }
}
