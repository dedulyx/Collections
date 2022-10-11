import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        HashMap<Student, Double> car = new HashMap<>();
        Student st1 = new Student("Alex","Belka","3");
        Student st2 = new Student("Bob","DEC","4");
        Student st3 = new Student("Trololo","Trolololovich","5");
        Student st4 = new Student("Java","Dev","5");

        car.put(st1,4.5);
        car.put(st2,6.6);
        car.put(st3,7.4);
        car.put(st4,8.6);
        System.out.println(car);
        System.out.println(st1.equals(st4));
    }
}


class  Student{
    String name;
    String Fam;
    String Course;
    public Student(String name,String Fam,String Course) {
        this.name = name;
        this.Fam = Fam;
        this.Course = Course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Fam='" + Fam + '\'' +
                ", Course='" + Course + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(Fam, student.Fam) && Objects.equals(Course, student.Course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Fam, Course);
    }
}