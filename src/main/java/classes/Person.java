package classes;

public class Person {

    int id;
    String username;
    double balance;
    String gender;
    boolean isPersonWorking;

    public Person(int id, String username, double balance, String gender, boolean isPersonWorking) {
        this.id = id;
        this.username = username;
        this.balance = balance;
        this.gender = gender;
        this.isPersonWorking = isPersonWorking;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isPersonWorking() {
        return isPersonWorking;
    }

    public void setPersonWorking(boolean personWorking) {
        isPersonWorking = personWorking;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
