package Stack_Queue.Map_Tree.Arrange_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AgeComparetor implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return -1;
        }

    }
}


