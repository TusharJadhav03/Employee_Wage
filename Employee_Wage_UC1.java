/**
 * Employee_Wage
 */
public class Employee_Wage_UC1 {

    public static void main(String[] args) {
        
        int FULL_TIME_EMP = 1;
        
        double emp_check = Math.floor(Math.random()*10 % 2);
        if(FULL_TIME_EMP == emp_check)
            System.out.println("Employee are present");
        else
            System.out.println("Employee are not present");
    }
}