package project.doctor;

public class Old extends Patient{

    public Old(String pName) {
        super(pName);
    }

    public Old() {
    }

    @Override
    String getType() {
        return "Old";
    }

    @Override
    void GoToDoctor(Doctor doctor) {
        doctor.check(pName);
    }

    @Override
    public void priority(Patient patient) {
        if (patient.getType().equals("Old")){
            System.out.println("High priority of treatment");
            return;
        }
        this.next.priority(patient);
    }
}