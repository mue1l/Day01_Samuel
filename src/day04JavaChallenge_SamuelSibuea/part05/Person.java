package day04JavaChallenge_SamuelSibuea.part05;

public abstract class Person {
    private String nasionalId;
    private String fullname;

    public Person(String nasionalId, String fullname) {
        this.nasionalId = nasionalId;
        this.fullname = fullname;
    }

    // abstrak method
    abstract String InfoPerson();

}
