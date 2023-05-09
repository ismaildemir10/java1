public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("ahmet","5858","trh");
        Teacher t2  = new Teacher("mithat","8787","fzk");
        Teacher t3 = new Teacher("ali","878754","mat");
        Course tarih = new Course("tarih","100","trh");
        Course fizik = new Course("fizik","102","fzk");
        Course mat  =new Course("matematik","103","mat");
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        mat.addTeacher(t3);
        Student s1 = new Student("isa","45545","4",tarih,fizik,mat);
        s1.addBulkExamNote(100,50,50);
        s1.isPass();
    }
}