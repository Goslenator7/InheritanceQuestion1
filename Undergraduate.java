import javax.swing.*;

public class Undergraduate extends Student {

    private String formerSchool;

    public Undergraduate(String name, String address, int age, int matriculationNumber, String formerSchool) {
        super(name, address, age, matriculationNumber);
        setFormerSchool(formerSchool);
    }

    public String toString() {
        String output;

        output = super.toString() + "\n My former school is: "+getFormerSchool();
        return output;
    }

    public void displayDetails() {

        String details = toString();

        JOptionPane.showMessageDialog(null, details, "Undergrad Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public void faveBeer() {
        System.out.println("Undergrad: My favourite beer is Tennents");
    }

    public String getFormerSchool() {
        return formerSchool;
    }

    public void setFormerSchool(String formerSchool) {
        this.formerSchool = formerSchool;
    }
}
