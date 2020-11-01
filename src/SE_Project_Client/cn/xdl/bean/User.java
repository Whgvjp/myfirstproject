package cn.xdl.bean;

/**
 * 用户类，属性与数据库中表格字段完全一致
 */

public class User {
    private String uname;
    private String upass;
    private int id;
    /**
     * 标记用户的权限等级
     * 1.   管理员
     * 2.   用户
     */
    private int flag;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", id=" + id +
                ", flag=" + flag +
                '}';
    }

    public User() {
    }
    public User(String uname, String upass, int flag) {
        this.uname = uname;
        this.upass = upass;
        this.flag = flag;
    }
    public User(String uname, String upass) {
        this.uname = uname;
        this.upass = upass;
    }
    public User(String uname, String upass, int id, int flag) {
        this.uname = uname;
        this.upass = upass;
        this.id = id;
        this.flag = flag;
    }
}
