
public class Communication extends People {

    private TypeGender sex;
    private TypeCommunication kinship;

    public Communication(String lastname, String firstname, TypeGender sex, int yearOfBirth,
            TypeCommunication kinship) {

        super(lastname, firstname, yearOfBirth);

        this.sex = sex;
        this.kinship = kinship;

    }

    public TypeGender getSex() {
        return sex;
    }

    public TypeCommunication getKinship() {
        return kinship;
    }

    @Override
    public String toString() {
        return super.toString() + ", пол: " + sex + ", родство: " + kinship;
    }

}
