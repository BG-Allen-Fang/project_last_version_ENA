package project.doctor;

public class Doctors {
    private DoctorsFactory doctorsFactory;

    public Doctors(DoctorsFactory doctorsFactory) {
        this.doctorsFactory = doctorsFactory;
    }

    public Doctor makeDoctor(String name, String type){
        return doctorsFactory.makeDoctor(name,type);
    }
}
