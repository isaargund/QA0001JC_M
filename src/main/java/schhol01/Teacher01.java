package schhol01;

public class Teacher01 {
    String name = "No Same information";
    String surname="No Surname information";

    @Override
    public String toString() {
        return "Teacher01{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Branch='" + Branch + '\'' +
                '}';
    }

    String Branch="No Branch information";

    Teacher01(String name, String surname, String Branch){
        this.name = name;
        this.surname = surname;
        this.Branch = Branch;

    }
}
