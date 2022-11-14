import java.util.Objects;

public class Student implements Comparable<Student>{
    private int number;
    private String name;

    public Student(){
        this.number = 0;
        this.name = "";
    }

    public Student(int number, String name){
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this.name == o)
            return true;
        if (!(o instanceof Student student)) return false;
        return number == student.number && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public int compareTo(Student obj) {

        // 0 -> this.number - obj.number;
        //

        // compare two students
        return this.number - obj.number; // obj.number is the second student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
