// missing comments 
public class FullTimeStaffHire extends StaffHire
{
    private double  salary;
    private double weeklyFractionalHours;
    

    public FullTimeStaffHire(int newVacancyNumber, String newDesignation, String newJobType, 
    String newName, String newJoinDate,String newQualification, String newAppointedBy, boolean joined,
    double newSalary,double newWeeklyFractionalHours)
    {
        super(newVacancyNumber,newDesignation, newJobType,
        newName, newJoinDate,newQualification, newAppointedBy,joined);
        
        salary = newSalary;
        weeklyFractionalHours= newWeeklyFractionalHours;

    }

    public void setSalary( double newSal)
    {
        if (super.getjoined() == true)
        {
            salary=newSal; 
        }

        else{ 

            System.out.println("The salary can not be assigned to" + 
                "when the joined status is false");        
        }

    }
    
    // missing other set methods
    
    // missing other get methods 



    public void display()
    {
        super.display();
       
         System.out.println("Weekly Fractional Hours:  " + weeklyFractionalHours);
          System.out.println("Salary:  " + salary);



    }
}
