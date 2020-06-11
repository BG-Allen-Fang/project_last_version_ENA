package project.doctor;

public class TalentedDoctor extends DoctorPosition {
    public TalentedDoctor(Position position) {
        super(position);
    }

    @Override
    public void position() {
        System.out.println("This doctor has talent");
        this.position.position();
    }
}
