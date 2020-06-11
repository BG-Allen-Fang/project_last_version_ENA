package project.doctor;

public abstract class Patient implements Priority{
    String pName;
    protected Priority next;

    abstract String getType();


    public Patient(String pName){
        this.pName = pName;
    }

    public Patient(){
    }

    abstract void GoToDoctor(Doctor doctor);

    public String get_pName(){
        return this.pName;
    }

    @Override
    public void SetNext(Priority next) {
        this.next = next;
    }

    @Override
    public void priority(Patient patient) {
        System.out.println("Base priority implementation");
        System.out.println("some message");
        if (next != null){
            next.priority(patient);
        }
    }

}
