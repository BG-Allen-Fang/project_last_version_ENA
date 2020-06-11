package project.doctor;

public class PatientMakeFactory implements PatientFactory{
    @Override
    public Patient makePatient(String name, String type) {
        try {
            if (type.equalsIgnoreCase("kid")) {
                return new Kids(name);
            } else if (type.equalsIgnoreCase("Old")) {
                return new Old(name);
            } else if (type.equalsIgnoreCase("Invalid")) {
                return new Invalid(name);
            } else if (type.equalsIgnoreCase("Dogsbody")) {
                return new Dogsbody(name);
            } else {
                throw new IllegalArgumentException("There is no such patient type!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

