public class Employee_Wage_UC4 {
    
    public static void main(String[] args) {
        
        int FULL_TIME_EMP = 1;
        int PART_TIME_EMP = 2;
        int EMP_RATE_PER_HOUR = 20;
        int EMP_FULLTIME_WORK_HOUR = 8;
        int EMP_PARTTIME_WORK_HOUR = 4;
        int emp_wage = 0;

        int emp_check = (int)Math.floor(Math.random()*10%3);
        

       switch (emp_check) {
        case 1:
            emp_wage = EMP_RATE_PER_HOUR * EMP_FULLTIME_WORK_HOUR;
            System.out.println("Employee wage is : "+emp_wage);
            break;
       
        case 2:
            emp_wage = EMP_RATE_PER_HOUR * EMP_PARTTIME_WORK_HOUR ;
            System.out.println("Employee wage is : "+emp_wage);
            break;

        default:
            emp_wage = 0;
            System.out.println(emp_wage);
            break;
       }

    }
}
