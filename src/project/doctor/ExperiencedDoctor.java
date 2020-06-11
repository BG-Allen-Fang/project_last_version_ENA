package project.doctor;

public class ExperiencedDoctor extends DoctorPosition {

    public ExperiencedDoctor(Position position) {
        super(position);
    }

    @Override
    public void position() {
        System.out.println("This doctor has experience");
        this.position.position();
    }
}
