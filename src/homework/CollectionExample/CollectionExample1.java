package homework.CollectionExample;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        ArrayList<String> people = new ArrayList<String>();
        String name = scanner.nextLine();
        while (isRun) {
            switch (name) {
                case "1":
                    System.out.println("please name");
                    break;
                case "2":
                    System.out.println("jnjel");

                people.add("poxos");
                people.add("ani");
                people.add("vardan");
                people.remove("ani");
                System.out.println(people);
                if (people.contains("poxos")) {
                    System.out.println("poxos cankum e");
                    if (people.isEmpty()) {
                        System.out.println("cank@ datark e");
                    }
                    people.clear();
                }
            }
        }
    }
}
