package homework.employee1.storage;

import homework.employee1.model.Company;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {
        if (companies.length == size) {
            extend();
        }
        companies[size++] = company;
    }

    public void extend() {
        Company[] tmp = new Company[companies.length + 10];
        System.arraycopy(companies, 0, tmp, 0, size);
        companies = tmp;
    }

    public void print() {
        for (int j = 0; j < size; j++) {
            System.out.println(companies[j]);
        }
    }

    public Company getCompanyById(String id) {
        for (int i = 0; i < size; i++) {
            Company company = companies[i];
            if (company.getId().equals(id)) {
                return companies[i];
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }
}









