package com.MySpringBootDemo.SpringBootDemo;

public class Employee {
    int eid;
    String ename;
    String eaddress;


    public Employee(){

    }


//    This is a constructor
    public Employee(int eid, String ename, String eaddress){
        this.eid = eid;
        this.ename = ename;
        this.eaddress = eaddress;
    }


    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", eaddress='" + eaddress + '\'' +
                '}';
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }


}
