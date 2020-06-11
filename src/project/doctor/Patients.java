package project.doctor;

public class Patients {
    private PatientFactory patientFactory;

    public Patients(PatientFactory patientFactory) {
        this.patientFactory = patientFactory;
    }

    public Patient makePatient(String name , String type){
        return patientFactory.makePatient(name,type);
    }
}
