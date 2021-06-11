package second.chapter5.staticvsinstance;

class Student{
    private Military military;
    private static int age = 19; // 같은반 친구 모두 나이가같음
    private int height;

    public Student(){
        this(Military.NOT_YET, 150);
    }
    public Student(Military military, int height){
        this.military = military;
        this.height = height;
    }

    static int getAge(){
        return age;
    }

    public Military showMilitaryStatus(){
        return military;
    }

    public boolean isRealMan(){
        if(this.military == Military.YES){
            return true;
        }
        return false;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(Student.getAge());
        System.out.println(student.showMilitaryStatus());
        System.out.println(student.isRealMan());

        Student student2 = new Student(Military.YES, 180);
        System.out.println(Student.getAge());
        System.out.println(student2.showMilitaryStatus());
        System.out.println(student2.isRealMan());
    }
}
