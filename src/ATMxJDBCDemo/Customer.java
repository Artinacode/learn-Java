package ATMxJDBCDemo;

public class Customer {
    private String id ; 		//卡号
    private String pwd ;		//密码
    private String username ;//姓名
    private int money ; 		//余额
    public Customer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Customer(String id, String pwd, String username, int money) {
        this.id = id;
        this.pwd = pwd;
        this.username = username;
        this.money = money;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
