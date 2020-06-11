package project.doctor;

public class ManagePriority {
    public Priority getPriority(){
        Priority invalid = new Invalid();
        Priority kids = new Kids();
        Priority old = new Old();
        Priority dogsbody = new Dogsbody();

        invalid.SetNext(old);
        old.SetNext(kids);
        kids.SetNext(dogsbody);
        return invalid;
    }
}