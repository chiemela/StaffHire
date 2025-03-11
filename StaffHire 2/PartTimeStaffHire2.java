
public class PartTimeStaffHire2 extends StaffHire2
{
    private double workingHours;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;

    public  PartTimeStaffHire2(int theVacancyNumber, String theDesignation,
    String thejobType, String theStaffName, String thejoinDate,
    String thequalification, String theApponitedBy, boolean theJoined,
    double theWorkingHours, double theWagesPerHour,String theShifts){

        super(theVacancyNumber,theDesignation,thejobType,
            theStaffName,thejoinDate,thequalification,theApponitedBy,theJoined);

        workingHours=theWorkingHours;
        wagesPerHour=theWagesPerHour;
        shifts=theShifts;
        terminated=false;
    }
    
    // out setters and getter methods are missing
    
    // internal comments are missing too
    
    public void workTerminate(String name)
    {
if ((name!=null) && name.equals(getName()) && (terminated == false) )
{

    super.setJoined(false);
    super.setName("");
    terminated=true;
    // some codes are still missing 

}    
    else
    {
        System.out.println("The staff name is blank or they do not exist in the Database" +
        "or they are already terminated");
    }

    
}  
    public void display()
    {
  super.display();
  System.out.println("Termination status: " +terminated);
  //some variable are missing here 
    }

}
