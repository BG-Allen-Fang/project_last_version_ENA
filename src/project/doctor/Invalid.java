package project.doctor;

public class Invalid extends Patient {

    public Invalid(String pName) {
        super(pName);
    }

    public Invalid() {
    }

    @Override
    String getType() {
        return "Invalid";
    }

    @Override
    void GoToDoctor(Doctor doctor) {
        doctor.check(pName);
    }

    @Override
    public void priority(Patient patient) {
        if (patient.getType().equals("Invalid")){
            System.out.println("Very high priority of treatment");
            return;
        }
        this.next.priority(patient);
    }
}
