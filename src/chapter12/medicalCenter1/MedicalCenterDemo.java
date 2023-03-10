package chapter12.medicalCenter1;

import medicalCenter.Commands;
import medicalCenter.DateUtil;
import medicalCenter.Doctor;
import medicalCenter.Patient;
import medicalCenter.PersonStorage;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements medicalCenter.Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static medicalCenter.PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorByid();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENT_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODAY_PATIENTS:
                    personStorage.printTodaysPatients();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void printAllPatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        medicalCenter.Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("doctor with" + doctorId + "does not exists");
        }
    }

    private static void addPatient() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        medicalCenter.Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please id,name,surname,phone,registerDateTime(26-02-2023 14:00");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(doctorById, registerDateTime)) {
                    medicalCenter.Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhoneNumber(patientData[3]);
                    patient.setDoctor(doctorById);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("patient registered");
                } else {
                    System.out.println("doctor is unavailable in that time,please choose another");
                }

            } catch (ParseException e) {
                System.out.println("Incorrect date time format please try again");
            }
        } else {
            System.out.println("doctor with" + doctorId + "does not exists");
        }
    }

    private static void changeDoctorByid() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        medicalCenter.Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input name,surname,phone,email,profession");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setPhoneNumber(doctorData[2]);
            doctorById.setEmail(doctorData[3]);
            doctorById.setProfession(doctorData[4]);
            System.out.println("Doctor changed!");
        } else System.out.println("doctor with" + doctorId + "does not exists");
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        medicalCenter.Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.deleteDoctorById(doctorId);
        } else System.out.println("doctor with" + doctorId + "does not exists");
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {
        User user = new User();
        Profession[] values = Profession.values();
        System.out.println("Please input profession");
        for (Profession value : values) {
            System.out.println(value);
        }
        String langStr = scanner.nextLine();
        try {
            user.profession = Profession.valueOf(langStr);
            System.out.println(user.profession);
        }catch (IllegalArgumentException e){
            System.out.println("Please input correct profession");
        }
        System.out.println("Please input id,name,surname,phone,email,profession");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        medicalCenter.Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            medicalCenter.Doctor doctor = new Doctor();
            doctor.setId(doctorId);
            doctor.setName(doctorData[1]);
            doctor.setSurname(doctorData[2]);
            doctor.setPhoneNumber(doctorData[3]);
            doctor.setEmail(doctorData[4]);
            doctor.setProfession(doctorData[5]);
            personStorage.add(doctor);
            System.out.println("Doctor added");
        } else {
            System.out.println("doctor with" + doctorId + "already exists");
        }
    }
}
