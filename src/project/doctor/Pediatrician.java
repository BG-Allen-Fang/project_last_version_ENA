package project.doctor;

public class Pediatrician extends Doctor{

    public Pediatrician(String name) {
        super(name);
    }

    @Override
    public void check(String patientName) {
        System.out.println(name + " The pediatrician checked the " + patientName);
        make_diagnosis(patientName);
    }

    @Override
    public void make_diagnosis(String patientName) {
        System.out.println(name + " The pediatrician make diagnosis to the " + patientName);
        giveListOfDrugs(patientName);
    }

    @Override
    public void giveListOfDrugs(String patientName) {
        System.out.println(name + " The pediatrician give the list of drugs to the " + patientName);
    }
}

