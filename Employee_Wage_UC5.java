public class Employee_Wage_UC5 {

    public static void main(String[] args) {
        
        int FULL_TIME_EMP = 1;
        int PART_TIME_EMP = 2;
        int EMP_RATE_PER_HOUR = 20;
        int EMP_FULLTIME_WORK_HOUR = 8;
        int EMP_PARTTIME_WORK_HOUR = 4;
        int EMP_WORK_DAYS = 20;
        int emp_wage = 0;
        int total_wage = 0;


        for(int i=0;i<EMP_WORK_DAYS;i++){

            int emp_check = (int) Math.floor(Math.random()*10%3);
            
            if(emp_check == FULL_TIME_EMP){
                emp_wage = EMP_RATE_PER_HOUR * EMP_FULLTIME_WORK_HOUR;
            }
            else if(emp_check == PART_TIME_EMP){
                emp_wage = EMP_RATE_PER_HOUR * EMP_PARTTIME_WORK_HOUR;
            }
            else{
                emp_wage = 0;
            }
            
            total_wage += emp_wage;

        }
        System.out.println("The Wages for a month is :" +total_wage);

    }
}
