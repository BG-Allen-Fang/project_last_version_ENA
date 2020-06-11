package project.doctor;

public class Dermatologist extends Doctor{

    public Dermatologist(String name) {
        super(name);
    }

    @Override
    public void check(String patientName) {
        System.out.println(name + " The dermatologist checked the " + patientName);
        make_diagnosis(patientName);
    }

    @Override
    public void make_diagnosis(String patientName) {
        System.out.println(name + " The dermatologist make diagnosis to the " + patientName);
        giveListOfDrugs(patientName);
    }

    @Override
    public void giveListOfDrugs(String patientName) {
        System.out.println(name + " The dermatologist give the list of drugs to the " + patientName);
    }
}
