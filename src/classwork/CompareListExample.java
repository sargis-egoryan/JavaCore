package classwork;

import java.util.*;

public class CompareListExample {
    public static void main(String[] args) {
        Set<People> peopleList = new TreeSet<>(new PeopleNameComparator());
        peopleList.add(new People("poxos", "poxosyan", 18));
        peopleList.add(new People("arzuman", "poxosyan", 13));
        peopleList.add(new People("abzuman", "poxosyan", 15));

    }
}
