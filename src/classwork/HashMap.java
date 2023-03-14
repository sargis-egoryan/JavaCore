package classwork;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class HashMap {
    public static void main(String[] args) {
//        Map<String,People> peopleMap= (Map<String, People>) new HashMap();
//        peopleMap.put("adhdshj",new People("azo","xzo",45));
//        People ada = peopleMap.get("adhdshj");
//        System.out.println(ada);
        Map<Company, Integer> companySizeMap = new java.util.HashMap<>();
        Person person = new Person("poxos", "poxosyan");
        Person petros = new Person("petros", "poxosyan");
        Company company = new Company(person, "a001", "Company1");
        Company company2 = new Company(petros, "a002", "Company2");

        companySizeMap.put(company, 20);
        companySizeMap.put(company2, 4);
        company.getDirector().setName("martiros");
        Set<Company> companies = companySizeMap.keySet();
        Collection<Integer> values = companySizeMap.values();
        Set<Map.Entry<Company, Integer>> entries = companySizeMap.entrySet();
        for (Map.Entry<Company, Integer> entry : entries) {
            System.out.println(entry.getKey().getName() + "->" + entry.getValue());
        }
    }
}

