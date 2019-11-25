package myFirstWorkDB.entity;

import java.io.Serializable;

public class User1 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;
    private String firstName;
    private String lastName;
    private int age;
    private int periodMonth_1;
    private int income_2;
    private int nonoperatingIncome_3;
    private boolean workPlace_4;
    private boolean privileges_5;
    private boolean widow_6;
    private int kids_7;
    private int kidsDisabled_8;
    private int dependent_9;
    private int costsInsurance_10;
    private int costsEducation_11;
    private int costsHousing_12;
    private int costsBusiness_13;
    private double tax;

    public User1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void caclulate(){
        this.tax = Calculator.culcTax(this);
    }

    public User1() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPeriodMonth_1() {
        return periodMonth_1;
    }

    public void setPeriodMonth_1(int periodMonth_1) {
        this.periodMonth_1 = periodMonth_1;
    }

    public int getIncome_2() {
        return income_2;
    }

    public void setIncome_2(int income_2) {
        this.income_2 = income_2;
    }

    public int getNonoperatingIncome_3() {
        return nonoperatingIncome_3;
    }

    public void setNonoperatingIncome_3(int nonoperatingIncome_3) {
        this.nonoperatingIncome_3 = nonoperatingIncome_3;
    }

    public boolean isWorkPlace_4() {
        return workPlace_4;
    }

    public void setWorkPlace_4(boolean workPlace_4) {
        this.workPlace_4 = workPlace_4;
    }

    public boolean isPrivileges_5() {
        return privileges_5;
    }

    public void setPrivileges_5(boolean privileges_5) {
        this.privileges_5 = privileges_5;
    }

    public boolean isWidow_6() {
        return widow_6;
    }

    public void setWidow_6(boolean widow_6) {
        this.widow_6 = widow_6;
    }

    public int getKids_7() {
        return kids_7;
    }

    public void setKids_7(int kids_7) {
        this.kids_7 = kids_7;
    }

    public int getKidsDisabled_8() {
        return kidsDisabled_8;
    }

    public void setKidsDisabled_8(int kidsDisabled_8) {
        this.kidsDisabled_8 = kidsDisabled_8;
    }

    public int getDependent_9() {
        return dependent_9;
    }

    public void setDependent_9(int dependent_9) {
        this.dependent_9 = dependent_9;
    }

    public int getCostsInsurance_10() {
        return costsInsurance_10;
    }

    public void setCostsInsurance_10(int costsInsurance_10) {
        this.costsInsurance_10 = costsInsurance_10;
    }

    public int getCostsEducation_11() {
        return costsEducation_11;
    }

    public void setCostsEducation_11(int costsEducation_11) {
        this.costsEducation_11 = costsEducation_11;
    }

    public int getCostsHousing_12() {
        return costsHousing_12;
    }

    public void setCostsHousing_12(int costsHousing_12) {
        this.costsHousing_12 = costsHousing_12;
    }

    public int getCostsBusiness_13() {
        return costsBusiness_13;
    }

    public void setCostsBusiness_13(int costsBusiness_13) {
        this.costsBusiness_13 = costsBusiness_13;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
