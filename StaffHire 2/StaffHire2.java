
public class StaffHire2
{
    private int vacancyNumber;
    private String designation;
    private String jobType;
    private String StaffName;
    private String joinDate;
    private String qualification;
    private String appointedBy;
    private boolean joined=false;

    public StaffHire2(int theVacancyNumber, String theDesignation,
    String thejobType, String theStaffName, String thejoinDate,
    String thequalification, String theApponitedBy, boolean theJoined )
    {
        vacancyNumber=  theVacancyNumber; 
        designation=  theDesignation; 
        jobType=  thejobType;
        StaffName=theStaffName;
        joinDate=thejoinDate;
        qualification=thequalification;
        appointedBy=theApponitedBy;
        joined=theJoined;
    }

    public boolean getJoined()
    {
        return  joined;  
    }

    public void setJoined(boolean join)
    {
        joined=join;   
    }
  
    public void setName(String theName)
    {
        StaffName=theName;   
    }
    // you need to repeart this for other 7 variables  

    
        public String getName()
    {
       return StaffName;   
    }
    public void display()
    {
        System.out.println("Vacancy number: " +vacancyNumber);
        System.out.println("Designation: " +designation);
        System.out.println("Job Type: " +jobType);
        System.out.println("Staff Name: " +StaffName);
        System.out.println("join Date: " +joinDate);
        System.out.println("qualification: " +qualification);
        System.out.println("appointedBy: " +appointedBy);
        System.out.println("Joined status: " +joined);

    }

}
