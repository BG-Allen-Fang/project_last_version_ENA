package project.doctor;

public class Main {

    public static void main(String[] args) {

        Doctors doctor = new Doctors(new DoctorMakeFactory());
        Doctor Aizhan = doctor.makeDoctor("Aizhan" , "Therapist");
        Doctor Aldana = doctor.makeDoctor("Aldana" , "Pediatrician");
        Doctor Leva = doctor.makeDoctor("Leva" , "Dermatologist");

        Patients patient = new Patients(new PatientMakeFactory());
        Patient Yerassyl = patient.makePatient("Yerassyl" , "kid");
        Patient Bob = patient.makePatient("Bob" , "Old");

        Yerassyl.GoToDoctor(Aldana);

        System.out.println();

        Bob.GoToDoctor(Leva);

        Position John = new ExperiencedDoctor(doctor.makeDoctor("John","Dermatologist"));
        System.out.println();
        John.position();

        System.out.println();

        Position D1 = new TalentedDoctor(Aizhan);
        D1.position();

        ManagePriority manage = new ManagePriority();
        Priority stage = manage.getPriority();
        System.out.println();
        stage.priority(Yerassyl);


    }
}
