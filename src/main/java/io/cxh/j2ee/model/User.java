package io.cxh.j2ee.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/9.
 */
public class User {
    public long id;
    public String username;
    public Date birthday;
    public String sex;
    public String address;
    public Integer englishScore;

    public User() {}

    public User(long id, String username, Date birthday, String sex, String address, Integer englishScore) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.englishScore = englishScore;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(Integer englishScore) {
        this.englishScore = englishScore;
    }
}
