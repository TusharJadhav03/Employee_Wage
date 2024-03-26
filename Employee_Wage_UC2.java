public class Employee_Wage_UC2 {
    
    public static void main(String[] args) {
        
        int FULL_TIME_EMP = 1;
        int EMP_RATE_PER_HOUR = 20;
        int EMP_WORK_HOUR = 8;
        double daily_emp_wage =0;

        double empcheck = Math.floor(Math.random()*10%2);

        if(empcheck == FULL_TIME_EMP){
             daily_emp_wage = EMP_WORK_HOUR * EMP_RATE_PER_HOUR;
        }

        System.out.println("Employee Daily Wage is : " + daily_emp_wage);

    }
}
