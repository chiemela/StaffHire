

public class FullTimeStaffHire2 extends StaffHire2
{
    
    private double salary;
    private double WeeklyFractionalHours;
 
    
public FullTimeStaffHire2(int theVacancyNumber, String theDesignation,
    String thejobType, String theStaffName, String thejoinDate,
    String thequalification, String theApponitedBy, boolean theJoined,
    double newSalary,double newWeeklyFractionalHours)
    {
      
        super(theVacancyNumber,theDesignation,thejobType,
        theStaffName,thejoinDate,thequalification,theApponitedBy,theJoined);
        salary=newSalary;
        WeeklyFractionalHours=newWeeklyFractionalHours;
        
    }
    
  public void setSalary(double newSal)
  {
    if(super.getJoined()==true)
    {
       salary=newSal; 
    }
    else{
        System.out.println("The salary can not be assigned"+
        "when the staff has not joined");

    }
    
    // other methods missing
}
    public void display()
    {
     super.display();
    
    System.out.println("The salary is : " +salary);
    System.out.println("The Weekly Fractional Hours: " +WeeklyFractionalHours);
    }
      
      
  }





