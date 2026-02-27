package com.itheima.springboot01.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

//存放用户信息，account和passward
@Data
@TableName("login_user")
public class LoginUser {

    private String account;
    private String passward;

    public LoginUser(String account, String passward) {
        this.account = account;
        this.passward = passward;
    }

    public LoginUser() {
    }

    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassward() {
        return passward;
    }
    public void setPassward(String passward) {
        this.passward = passward;
    }
}
