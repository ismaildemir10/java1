public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    Course(String name,String code,String prefix){
        this.code=code;
        this.name=name;
        this.prefix=prefix;
        int note = 0;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ile ders uyuşmuyor");
        }
    }
    void printCourse(){
        this.teacher.printTeacher();
    }


}
