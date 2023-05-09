public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name,int damage,int health,int weight,int dodge){
        this.name = name;
        this.damage=damage;
        this.weight=weight;
        this.health=health;
        this.dodge=dodge;
    }
    int hit(Fighter foe){
        System.out.println(this.name + "=>"+ foe.name+ " " + this.damage+"hasar vurdu.");
        if(foe.isDodge()){
            System.out.println(foe.name + "karşılama");
            return foe.health;
        }
        if((foe.health-this.damage)<0){
            return 0;
        }
        return foe.health - this.damage;

    }
    boolean isDodge(){
        double randomNumber = Math.random()*100;
        return randomNumber <= this.dodge;
    }
}
