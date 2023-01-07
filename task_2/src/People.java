import java.io.Serializable;

public class People implements Serializable {
    
    private String lastname;
    private String firstname;
    private TypeGender sex;
    private int yearOfBirth;
    private TypeCommunication kinship;

    

    public People(String lastname, String firstname, TypeGender sex, int yearOfBirth, TypeCommunication kinship) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
        this.kinship = kinship;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String name) {
        this.lastname = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public TypeGender getSex() {
        return sex;
    }

    public void setSex(TypeGender sex) {
        this.sex = sex;
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0){
            this.yearOfBirth = yearOfBirth;
        }
    }

    public TypeCommunication getKinship() {
        return kinship;
    }

    public void setKinship(TypeCommunication kinship) {
        this.kinship = kinship;
    }
    
    @Override
    public String toString() {
        return "\n People{" +
                "Фамилия - " + lastname + '\'' +
                ", Имя - " + firstname + '\'' +
                ", пол - " + sex + '\'' +
                ", год рождения - " + yearOfBirth + '\'' +
                ", родство - " + kinship + '\'' +
                '}';
    }
}