package project.doctor;

public class Kids extends Patient{

    public Kids(String pName) {
        super(pName);
    }

    public Kids() {
    }

    @Override
    String getType() {
        return "Kids";
    }

    @Override
    void GoToDoctor(Doctor doctor) {
        doctor.check(pName);
    }

    @Override
    public void priority(Patient patient) {
        if (patient.getType().equals("Kids")){
            System.out.println("Medium priority of treatment");
            return;
        }
        this.next.priority(patient);
    }

}
