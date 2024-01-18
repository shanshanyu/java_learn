package com.sensorsdata.ui;

public class User {
    private String name;
    private String pass;



    public User() {
    }

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * 设置
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

}
