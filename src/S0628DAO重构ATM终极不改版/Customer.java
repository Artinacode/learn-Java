package S0628DAO重构ATM终极不改版;

public class Customer {
    private  int uid;
    private String uname;
    private String upass;
    private int umoney;

    public Customer(int uid, String uname, String upass, int umoney) {
        this.uid = uid;
        this.uname = uname;
        this.upass = upass;
        this.umoney = umoney;
    }

    public Customer() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public int getUmoney() {
        return umoney;
    }

    public void setUmoney(int umoney) {
        this.umoney = umoney;
    }
}
