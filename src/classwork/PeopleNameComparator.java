package classwork;

import java.util.Comparator;

public class PeopleNameComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {

        return (o1.getName().compareTo(o2.name));
    }
}
