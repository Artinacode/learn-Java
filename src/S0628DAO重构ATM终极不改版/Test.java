package S0628DAO重构ATM终极不改版;

public class Test {
    private static Test ourInstance = new Test();

    public static Test getInstance() {
        return ourInstance;
    }

    private Test() {
    }

    public static void main(String[] args) {
        ATMSystem atm = new ATMSystem();
        atm.begin();
    }
}
