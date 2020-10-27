import javax.swing.*;

public class Postgraduate extends Student {

    private String firstDegree;

    public Postgraduate(String name, String address, int age, int matriculationNumber, String firstDegree) {
        super(name, address, age, matriculationNumber);
        setFirstDegree(firstDegree);
    }

    public String toString() {
        String output;

        output = super.toString() + "\n My former school is: "+getFirstDegree();
        return output;
    }

    public void displayDetails() {

        String details = toString();

        JOptionPane.showMessageDialog(null, details, "Postgrad Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public void faveBeer() {
        System.out.println("Postgrad: My fave beer is San Miguel");
    }

    public String getFirstDegree() {
        return firstDegree;
    }

    public void setFirstDegree(String firstDegree) {
        this.firstDegree = firstDegree;
    }
}
