package pl.ForthDay13;

public class Programmer {
    private long id = 0;
    private static long nextId = 1;
    private String firstName;
    private String lastName;
    private Sex sex;
    private boolean alive;


    public Programmer(String firstName, String lastName, Sex sex) {
        this.id = nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.alive = true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", alive=" + alive +
                '}';
    }
}
