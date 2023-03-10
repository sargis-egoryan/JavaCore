package chapter12.medicalCenter1;

public interface Commands {
    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_ALL_PATIENT_BY_DOCTOR = "6";
    String PRINT_TODAY_PATIENTS = "7";


    static void printCommand() {

        System.out.println("Please input" + EXIT + " for exit");
        System.out.println("Please input" + ADD_DOCTOR + " add doctor");
        System.out.println("Please input" + SEARCH_DOCTOR_BY_PROFESSION + "search doctor by profession" +
                "");
        System.out.println("Please input" + DELETE_DOCTOR_BY_ID + " delete doctor id");
        System.out.println("Please input" + CHANGE_DOCTOR_BY_ID + " change doctor id");
        System.out.println("Please input" + ADD_PATIENT + " add patient");
        System.out.println("Please input" + PRINT_ALL_PATIENT_BY_DOCTOR + " print all patient by doctor");
        System.out.println("Please input" + PRINT_TODAY_PATIENTS + " print today patients");
    }
}
