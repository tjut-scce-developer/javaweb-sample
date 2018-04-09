package po;

/**
 * Created by AT on 2018/4/5.
 */
public class UsertablePO {

    private int id;
    private String username;
    private String password;
    private String tel;
    private String email;
    private String ts;
    private String realname;

    public static String _id = "id";
    public static String _username = "username";
    public static String _password = "password";
    public static String _tel = "tel";
    public static String _email = "email";
    public static String _ts = "ts";
    public static String _realname = "realname";

    public int getId() {
        return id;
    }

    public UsertablePO setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UsertablePO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UsertablePO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getTel() {
        return tel;
    }

    public UsertablePO setTel(String tel) {
        this.tel = tel;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UsertablePO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTs() {
        return ts;
    }

    public UsertablePO setTs(String ts) {
        this.ts = ts;
        return this;
    }

    public String getRealname() {
        return realname;
    }

    public UsertablePO setRealname(String realname) {
        this.realname = realname;
        return this;
    }

    @Override
    public String toString() {
        return "UsertablePO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", ts='" + ts + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}
