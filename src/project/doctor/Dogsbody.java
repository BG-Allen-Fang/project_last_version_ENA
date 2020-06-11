package project.doctor;

public class Dogsbody extends Patient {

    public Dogsbody(String pName) {
        super(pName);
    }

    public Dogsbody() {
    }

    @Override
    String getType() {
        return "Dogsbody";
    }

    @Override
    void GoToDoctor(Doctor doctor) {
        doctor.check(pName);
    }

    @Override
    public void priority(Patient patient) {
        try {
            if (patient.getType().equals("Dogsbody")) {
                System.out.println("Low priority of treatment");
                return;
            }else{
                throw new IllegalArgumentException("For treatment puy the money oahaha");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
