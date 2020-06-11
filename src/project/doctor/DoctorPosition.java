package project.doctor;

public abstract class DoctorPosition implements Position {
    protected Position position;

    public DoctorPosition(Position position){
        this.position = position;
    }
}
