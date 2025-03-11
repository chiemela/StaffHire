// missing lots of the codes 
public class PartTimeStaffHire extends StaffHire
{
    // missing class variables 

    private double workingHours;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;

    public PartTimeStaffHire   (int newVacancyNumber, String newDesignation, String newJobType, 
    String newName, String newJoinDate,String newQualification, String newAppointedBy, boolean joined,
    double newWagesPerHour,double newWorkingHours, String newShifts)
    {
        super(newVacancyNumber,newDesignation, newJobType,
            newName, newJoinDate,newQualification, newAppointedBy,joined);

        //missing new variable assigenment. 
        wagesPerHour= newWagesPerHour;
        workingHours=newWorkingHours;
        shifts=newShifts;
        terminated=false;
    }
    // missing getters
    // missing setters
    // missing a method to hire part time staff 

    public void workTerminate(String name)

    {

        if ((name !=null) && name.equals(getName()))
        {
            if (terminated==true)
            {
                System.out.println(" The staff contract is already terminated");   
            }
            else if (terminated==false){
                setjoined(false);
                setName("");
                terminated= true;
                //missing some assignment, join date, apponited by, etc.
                System.out.println("The Part-time Staff Member is now terminated");

            }
        }

            else{
                System.out.println(" The staff does not exist or  you entered a  null value, try again");   
            }

        }

        public void display()
        {
            super.display();
             System.out.println("Termination status: "+terminated);
            // class variable dispaly is missing 
        }
    }
