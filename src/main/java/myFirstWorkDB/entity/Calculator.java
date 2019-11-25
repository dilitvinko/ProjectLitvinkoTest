package myFirstWorkDB.entity;

public class Calculator {
    private static double step_1;
    private static double step_2;
    private static double step_3;
    private static double step_4;
    private static double step_5;
    private static double step_6;
    private static double tempTax;

    public static double culcTax(User1 user1){

        if (user1.isWorkPlace_4()){
            tempTax = (user1.getIncome_2() + user1.getNonoperatingIncome_3() - user1.getCostsBusiness_13())*0.16;
        }else {
            step_1_2(user1);
            step_3(user1);
            step_4(user1);
            step_5(user1);
            step_6_7(user1);
        }
        return tempTax;
    }

    public static void step_1_2(User1 user1){
        step_1 = user1.getIncome_2() + user1.getNonoperatingIncome_3();
        if (step_1 - user1.getCostsBusiness_13() <= 15020000){
            step_2 = step_1-(830000 * user1.getPeriodMonth_1());
        }else{
            step_2 = step_1;
        }
        if (step_2 < 0)
            step_2 = 0;
    }

    public static void step_3(User1 user1){
        if (user1.isPrivileges_5()){
            step_3 = step_2 - (1170000 * user1.getPeriodMonth_1());
        }else{
            step_3 = step_2;
        }
        if (step_3 < 0)
            step_3 = 0;

    }

    public static void step_4(User1 user1){
        if (user1.isWidow_6()){
            if(user1.getKids_7() > 0 && user1.getDependent_9() > 0 && user1.getKidsDisabled_8() <= user1.getKids_7())
                step_4 = step_3 - user1.getPeriodMonth_1() * 460000 * (user1.getKids_7() + user1.getDependent_9());
        }else{
            if (user1.getKids_7() == 1) {
                if (user1.getKidsDisabled_8() == 0 && user1.getDependent_9() > 0)
                    step_4 = step_3 - user1.getPeriodMonth_1() * 240000 * (user1.getKids_7() + user1.getDependent_9());
                if (user1.getKidsDisabled_8() == 1 && user1.getDependent_9() > 0)
                    step_4 = step_3 - user1.getPeriodMonth_1() * ((user1.getKids_7() * 460000) + (user1.getDependent_9() * 240000));
            }
            if (user1.getKids_7() > 1){
                if (user1.getDependent_9() > 0 && user1.getKidsDisabled_8() <= user1.getKids_7())
                    step_4 = step_3 - user1.getPeriodMonth_1() * 460000 * (user1.getKids_7() + user1.getDependent_9());
            }
        }
        if (step_4 < 0)
            step_4 = 0;
    }

    public static void step_5(User1 user1){
        if (user1.getCostsInsurance_10() <= 16000000)
            step_5 = step_4 - user1.getCostsInsurance_10();
        if (user1.getCostsInsurance_10() > 16000000)
            step_5 = step_4 - 16000000;
        if (step_5 < 0)
            step_5 = 0;
    }

    public static void step_6_7(User1 user1){
        step_6 = step_5 - (user1.getCostsEducation_11() + user1.getCostsHousing_12() + user1.getCostsBusiness_13());
        if (step_6 < 0)
            step_6 = 0;
        tempTax = step_6 * 0.16;
    }

    public double getTempTax() {
        return tempTax;
    }

    public void setTempTax(double tempTax) {
        this.tempTax = tempTax;
    }
}
