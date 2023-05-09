public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    Student(String name, String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0;
        this.isPass=false;
    }
    void addBulkExamNote(int n1,int n2, int n3) {
        if (n1 >= 0 && n1 <= 100) {
            this.c1.note = n1;
        }
        if (n2 >= 0 && n2 <= 100){
            this.c2.note = n2;
        }
        if(n3>=0&&n3<=100) {
            this.c3.note = n3;
        }
    }
    void isPass(){
        this.avarage =(this.c1.note+this.c2.note+this.c3.note)/3;
        if(this.avarage>50){
            System.out.println("Sınıfı geçtiniz");
        }else {
            System.out.println("Sınıfta kaldınız");
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + " notu: "+this.c1.note);
        System.out.println(this.c2.name + " notu: "+this.c2.note);
        System.out.println(this.c3.name + " notu: "+this.c3.note);
        System.out.println("ortalamanız: "+this.avarage);
    }


}
