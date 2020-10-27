import javax.swing.*;

public abstract class Student extends Person {

    private int matriculationNumber;

    public Student(String name, String address, int age, int matriculationNumber) {
        super(name, address, age);
        setMatriculationNumber(matriculationNumber);
    }

    public String toString() {
        String output;

        output = super.toString() +"\n My matriculation number is: "+getMatriculationNumber();
        return output;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }
}
