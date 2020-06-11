package project.doctor;

public class Therapist extends Doctor{

    public Therapist(String name) {
        super(name);
    }

    @Override
    public void check(String patientName) {
        System.out.println(name + " The therapist checked the " + patientName);
        make_diagnosis(patientName);
    }

    @Override
    public void make_diagnosis(String patientName) {
        System.out.println(name + " The therapist make diagnosis to the " + patientName);
        giveListOfDrugs(patientName);
    }

    @Override
    public void giveListOfDrugs(String patientName) {
        System.out.println(name + " The therapist give the list of drugs to the " + patientName);
    }
}
