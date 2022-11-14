import java.util.Comparator;

public class StudentsComparatorByNumber implements Comparator<Student> {
    @Override
    public int compare(Student obj1, Student obj2) {
        //return obj1.getNumber() - obj2.getNumber();
        return obj1.compareTo(obj2);
    }
}
