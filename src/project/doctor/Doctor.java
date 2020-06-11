package project.doctor;

public abstract class Doctor implements Position{
    protected String name;

    public Doctor(String name){
        this.name = name;
    }

    public abstract void check(String patientName);
    public abstract void make_diagnosis(String patientName);
    public abstract void giveListOfDrugs(String patientName);

    public String getName(){
        return this.name;
    }

    @Override
    public void position() {
        System.out.println("Doctor's name: " + this.name);
    }
}