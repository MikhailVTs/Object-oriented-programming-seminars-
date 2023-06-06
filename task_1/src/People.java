public class People {

    private String lastname;
    private String firstname;
    private int yearOfBirth;

    public People(String lastname, String firstname, int yearOfBirth) {
        this.lastname = lastname;
        this.firstname = firstname;

        this.yearOfBirth = yearOfBirth;

    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "\n People{" +
                "Фамилия - " + lastname + '\'' +
                ", Имя - " + firstname + '\'' +
                ", год рождения - " + yearOfBirth + '\'' +
                '}';
    }
}
