package p04_02_objects_in_list;

public class PersonalInformation {
    private String firstName;
    private String lastName;
    private int identificationNumber;

    public PersonalInformation(String personFirstName, String personLastName, int personIdentificationNumber) {
        this.firstName = personFirstName;
        this.lastName = personLastName;
        this.identificationNumber = personIdentificationNumber;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
