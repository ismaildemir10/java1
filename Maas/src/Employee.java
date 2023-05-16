public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double vergi;
    double bonus;
    double zam;
    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    void tax(){
        if(this.salary>1000) {
            this.vergi =(this.salary*3)/100;;
        }
    }
    void bonus(){
        if (this.workHours>40){
            this.bonus = (this.workHours-40)*30;
        }
    }
   public String toString() {
       tax();
       bonus();
       raiseSalary();
       String toString = ("Adı: " + this.name+
               "\nMaaşı: "+this.salary+
               "\nÇalışma Saati: "+this.workHours+
               "\nBaşlangıç Yılı : "+this.hireYear+
               "\nVergi : "+this.vergi+
               "\nBonus : "+this.bonus+
               "\nMaaş Artışı : "+this.zam+
               "\nVergi ve Bonuslar ile birlikte maaş : "+(this.salary+(this.bonus-this.vergi))+
               "\nToplam Maaş : "+(this.salary+this.zam));
       System.out.println(toString);
       return toString;
   }
   void raiseSalary(){
        if((2023-this.hireYear)<=9){
            this.zam=(this.salary*5)/100;
        }
        else if ((2023 - this.hireYear)<20&&(2023 - this.hireYear)>9) {
            this.zam=(this.salary/10);
        }
        else if ((2023 - this.hireYear)>=20) {
            this.zam =(this.salary*15)/100;
        }
   }
}
