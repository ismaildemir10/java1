public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1= f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }
    void run (){
        if(isCheck()){
            while (this.f1.health>0&&f2.health>0){
                this.f1.health=this.f1.hit(this.f2);
                this.f2.health=this.f2.hit(this.f1);
            }

        }else {
            System.out.println("Sporcuların ağırlığı klasman dışı");
        }
    }
    boolean isCheck(){
        return (this.f1.weight<=maxWeight&&this.f1.weight>=minWeight)&&(this.f2.weight<=maxWeight&&this.f2.weight>=minWeight);
    }
    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }
        return false;
    }


}
