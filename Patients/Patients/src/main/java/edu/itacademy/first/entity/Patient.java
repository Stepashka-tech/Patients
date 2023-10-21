package edu.itacademy.first.entity;

public class Patient {
    private int patientsId;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phone;
    private int medicalCardNumber;
    private Diagnose diagnose;

    public Patient(int patientsId, String lastName, String firstName, String middleName, String address, String phone, int medicalCardNumber, Diagnose diagnose) {
        this.patientsId = patientsId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnose = diagnose;
    }

    public int getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(int patientsId) {
        this.patientsId = patientsId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public Diagnose getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(Diagnose diagnose) {
        this.diagnose = diagnose;
    }
    public String toString() {
        return "Пациент [id=" + patientsId + ", фамилия = " + lastName + ", имя = " + firstName + ", отчество = "
                + middleName + ", место проживания = " + address + ", телефон = " + phone + ", номер медицинской карты = "
                + medicalCardNumber + ", диагноз = " + diagnose + "]";
    }
}
