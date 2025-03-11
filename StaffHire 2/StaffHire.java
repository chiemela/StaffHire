// missing running commentary
import java.util.ArrayList;
public class StaffHire
{
    private int vacancyNumber;
    private String designation;
    private String jobType;
    private String staffName;
    private String joinDate;
    private String qualification;
    private String appointedBy;
    private boolean joined=false;
    
    public ArrayList<StaffHire> staff = new ArrayList<StaffHire>();
  
    public StaffHire(int NewVacancyNumber, String NewDesignation, String NewJobType,
    String newName, String newJoinDate,String newQualification, String newAppointedBy, boolean join)
    {
    vacancyNumber = NewVacancyNumber;  
    designation= NewDesignation;
    jobType = NewJobType;
   staffName =newName;
   joinDate=newJoinDate;
    qualification=newQualification;
     appointedBy =newAppointedBy;
     joined= join;
     

    }
    
    
     public void storeSaff()
    {
        this. staff.add(new StaffHire(vacancyNumber,designation,jobType,staffName,joinDate,
      qualification,appointedBy,joined));
    }
    public void ListStaff()
    {

        for(StaffHire s:staff){
            System.out.println((staff.indexOf(s)+1)+": "
            +s.vacancyNumber +"\n"
            +s.designation +"\n"
            +s.jobType);
        }
    }

    public boolean getjoined()
    {
        return joined;
    }
    
        public void setjoined(boolean join)
    {
       joined=join;
    }
    
        public void setName(String name)
    {
       staffName=name;
    }
    

        
        public String getName()
    {
       return staffName;
    }
    
    
        public void hire(String newName, String newJoinDate,
    String newQualification, String newAppointedBy)
    {

  if (joined == false)
        {
            staffName =newName;
            joinDate= newJoinDate; 
            qualification = newQualification;
            joined = true;
            appointedBy=newAppointedBy;

        }
        
        else 
{
            System.out.println("A staff is already assigned to this position.");
        }    
 
    }
   
    
    // missing some get and set metohds
    
    public void display()
    {
        System.out.println("Vacancy number:  " + vacancyNumber);
        System.out.println("Designaiton:" + designation);
        System.out.println("Job type: " + jobType);
        System.out.println("Staff name: " + staffName);
        System.out.println("Join Date: " + joinDate);
        System.out.println("Qualifications: " + qualification);
        System.out.println("Appointed By " + appointedBy);
        System.out.println("Joined Status " + joined);

    }
}
