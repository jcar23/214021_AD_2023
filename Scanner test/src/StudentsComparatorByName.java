import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class StudentsComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student obj1, Student obj2) {
        return obj1.getName().compareTo(obj2.getName());
    }


}
