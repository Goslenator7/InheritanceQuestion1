public abstract class Person {

    private String name;
    private String address;
    private int age;

    public Person(String name, String address, int age) {
        setName(name);
        setAddress(address);
        setAge(age);
    }

    public String toString() {
        String output;
        output = "My name is: "+getName()+"\n My address is: "+getAddress()+"\n My age is: "+getAge();
        return output;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
