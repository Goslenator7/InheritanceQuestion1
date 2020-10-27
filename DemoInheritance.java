public class DemoInheritance {
    public static void main(String[] args) {

        Undergraduate fresher1 = new Undergraduate("Bart Simpson", "Springfield", 18, 1029384, "Springfield Elementary");
        Postgraduate graduate1 = new Postgraduate("Harry Pooter", "Pigwarts", 22, 239484, "BSc Magic and Mysteries");

        fresher1.displayDetails();
        graduate1.displayDetails();

        fresher1.faveBeer();
        graduate1.faveBeer();
    }
}
