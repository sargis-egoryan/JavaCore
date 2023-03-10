package chapter12.medicalCenter1;

import medicalCenter.DateUtil;
import medicalCenter.Doctor;
import medicalCenter.Patient;
import medicalCenter.Person;

import java.util.Date;

public class PersonStorage {

    private medicalCenter.Person[] persons = new medicalCenter.Person[10];
    private int size;

    public void add(medicalCenter.Person person) {
        if (persons.length == size) {
            extend();
        }
        persons[size++] = person;
    }


    public void printDoctors() {

        for (int i = 0; i < size; i++) {
            medicalCenter.Person person = persons[i];
            if (person instanceof Doctor) {
                System.out.println(person);
            }
        }
    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            medicalCenter.Person person = persons[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().equals(profession)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            medicalCenter.Person person = persons[i];
            if (person.getId().equals(id) && person instanceof Doctor) {
                deleteByIndex(i);
            }

        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            medicalCenter.Person person = persons[i];
            if (person.getId().equals(id) && person instanceof Doctor) {
                return (Doctor) person;
            }
        }
        return null;
    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            medicalCenter.Person person = persons[i];
            if (person instanceof medicalCenter.Patient) {
                medicalCenter.Patient patient = (medicalCenter.Patient) person;
                if (patient.getDoctor().equals((doctor))) {
                    System.out.println(patient);
                }
            }
        }
    }

    public void printTodaysPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof medicalCenter.Patient) {
                medicalCenter.Patient patient = (medicalCenter.Patient) persons[i];
                if (DateUtil.isSameDay(today, patient.getRegisterDateTime())) {
                    System.out.println(patient);
                }
            }
        }
    }

    private void extend() {
        medicalCenter.Person[] tmp = new medicalCenter.Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, persons.length);
        persons = tmp;
    }

    private void deleteByIndex(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];
        }
        size--;
    }

    public boolean isDoctorAvailable(Doctor doctor, Date registerDateTime) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof medicalCenter.Patient) {
                medicalCenter.Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor) && patient.getRegisterDateTime().equals(registerDateTime)) {
                    return false;
                }
            }
        }
        return true;
    }
}
