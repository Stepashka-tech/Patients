package edu.itacademy.first.main;

import edu.itacademy.first.entity.Patient;
import edu.itacademy.first.entity.Diagnose;

import java.util.ArrayList;
import java.util.List;


public class ProjectMain {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(1, "Иванов", "Иван", "Иванович", "Москва", "123456789", 1001, Diagnose.FLU));
        patients.add(new Patient(2, "Петров", "Петр", "Петрович", "Минск", "987654321", 1002, Diagnose.COLD));
        patients.add(new Patient(3, "Сидоров", "Сидор", "Сидорович", "Екатеринбург", "456789123", 1003, Diagnose.FLU));
        patients.add(new Patient(4, "Беляков", "Алексей", "Петрович", "Гродно", "789123456", 1004, Diagnose.FEVER));
        patients.add(new Patient(5, "Шубов", "Антон", "Васильевич", "Красноярск", "321654987", 1005, Diagnose.HEADACHE));

        Diagnose searchDiagnose = Diagnose.FLU;
        List<Patient> patientsWithDiagnose = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getDiagnose() == searchDiagnose) {
                patientsWithDiagnose.add(patient);
            }
        }
        System.out.println("Пациенты с диагнозом " + searchDiagnose + ":");
        for (Patient patient : patientsWithDiagnose) {
            System.out.println(patient);
        }

        int minCardNumber = 1002;
        int maxCardNumber = 1004;
        List<Patient> patientsWithCardNumberInRange = new ArrayList<>();

        for (Patient patient : patients) {
            int cardNumber = patient.getMedicalCardNumber();
            if (cardNumber >= minCardNumber && cardNumber <= maxCardNumber) {
                patientsWithCardNumberInRange.add(patient);
            }
        }

        System.out.println("Пациенты с номером медицинской карты от "
                + minCardNumber + " до " + maxCardNumber + ":");
        for (Patient patient : patientsWithCardNumberInRange) {
            System.out.println(patient);
        }
    }
}





