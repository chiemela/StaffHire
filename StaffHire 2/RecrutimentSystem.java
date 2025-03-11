import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RecrutimentSystem implements ActionListener
{

    private ArrayList<StaffHire> Staff= new ArrayList<StaffHire>();

    private JFrame frame;
    private JLabel  vacancyLabel;
    private JLabel  designationLabel;
    private JLabel  jobTypeLabel;
    private JLabel  jobDateLabel;
    private JLabel  staffNameLabel;
    private JLabel  appointedByLabel;
    private JLabel  qualificationLabel;
    private JLabel  salaryLabel;
    private JLabel  weeklyFractionalHoursLabel;
    private JLabel  workingHoursLabel;
    private JLabel  wagesPerHourLabel;
    private JLabel  shiftsLabel;
    private JLabel  terminatedLabel;
    private JLabel  displayNumberLabel;
    private JLabel  joinedLabel;

    private JTextField  vacancyTextbox;
    private JTextField  designationTextbox;
    private JTextField  jobTypeTextbox;
    private JTextField  jobDateTextbox;
    private JTextField  staffNameTextbox;
    private JTextField  appointedByTextbox;
    private JTextField  qualificationTextbox; 
    private JTextField  salaryTextbox; 
    private JTextField  weeklyFractionalTextbox;
    private JTextField  workingHoursTextbox;
    private JTextField  wagesPerHourTextbox;
    private JTextField  shiftsTextbox;
    private JCheckBox   joinedCheckbox;
    private JTextField  displayNumberTextbox;
    private JTextField  setSalaryTextbox;
    private JTextField  setWorkingShiftTextbox;

    private JButton addFulltimeButton;
    private JButton addParttimeButton;
    private JButton terminateButton;
    private JButton setSalaryButton;
    private JButton setWorkingShiftButton;
    private JButton displayNumberButton;

    public static void main(String arg[])
    {
        RecrutimentSystem recruitimentGUI=new  RecrutimentSystem();

    }

    public RecrutimentSystem()
    {
        makeFrame();
    }

    private void makeFrame()
    {

        // the whole design will be here 

        frame = new JFrame("CW 222-23 GridLayout Example");
        Container contentPane = frame.getContentPane();

        JLabel  vacancyLabel = new JLabel("Vacancy:");
        JLabel designationLabel = new JLabel("Designation:");
        JLabel jobTypeLabel = new JLabel("Job Type:");
        JLabel jobDateLabel = new JLabel("Job Date:");
        JLabel  staffNameLabel = new JLabel("Staff Name:");
        JLabel appointedByLabel = new JLabel("Appointed By:");
        JLabel qualificationLabel = new JLabel("Qualification:");
        JLabel salaryLabel = new JLabel("Salary:");

        JLabel weeklyFractionalHoursLabel = new JLabel("Weekly Fractional Hours:");
        JLabel workingHoursLabel = new JLabel("Working Hours:");
        JLabel wagesPerHourLabel = new JLabel("Wages Per Hour:");
        JLabel shiftsLabel = new JLabel("Shifts:");
        JLabel terminatedLabel = new JLabel("Terminated:");
        JLabel displayNumberLabel = new JLabel("Display Number:");
        JLabel shiftLabel = new JLabel("Set Working shifts:");

        // declare testboxes

        vacancyTextbox = new JTextField(10);
        designationTextbox = new JTextField(10);
        jobTypeTextbox = new JTextField(10);
        jobDateTextbox = new JTextField(10);
        staffNameTextbox = new JTextField(10);
        appointedByTextbox = new JTextField(10);
        qualificationTextbox = new JTextField(10);
        salaryTextbox = new JTextField(10);
        displayNumberTextbox = new JTextField(10);
        joinedCheckbox = new JCheckBox("Joined");

        weeklyFractionalTextbox = new JTextField(10);
        workingHoursTextbox = new JTextField(10);
        wagesPerHourTextbox = new JTextField(10);
        shiftsTextbox = new JTextField(10);

        setSalaryTextbox = new JTextField(10);
        setWorkingShiftTextbox = new JTextField(10);
        displayNumberTextbox = new JTextField(10);

        JLabel setSalaryLabel = new JLabel("Salary:"); 
        setSalaryTextbox = new JTextField(10);
        JLabel setWorkingShiftLabel = new JLabel("Working Shift:");
        setWorkingShiftTextbox = new JTextField(10);

        addFulltimeButton = new JButton("Add Fulltime Staff");
        addFulltimeButton.addActionListener(this); 
        addParttimeButton = new JButton("Add Parttime Staff");
        addParttimeButton.addActionListener(this); 
        setWorkingShiftButton = new JButton("Add Workig Shifts");
        setWorkingShiftButton.addActionListener(this);
        setSalaryButton = new JButton("Add Salary");
        setSalaryButton.addActionListener(this);
        terminateButton = new JButton("Terminate");
        terminateButton.addActionListener(this); 
        displayNumberButton = new JButton("display Number");
        displayNumberButton.addActionListener(this);

        contentPane.setLayout(new GridLayout(12, 4));
        contentPane.add(vacancyLabel);
        contentPane.add(vacancyTextbox);
        contentPane.add(designationLabel);
        contentPane.add(designationTextbox);
        contentPane.add(jobTypeLabel);
        contentPane.add(jobTypeTextbox);
        contentPane.add(jobDateLabel);
        contentPane.add(jobDateTextbox);
        contentPane.add(staffNameLabel);
        contentPane.add(staffNameTextbox);
        contentPane.add(appointedByLabel);
        contentPane.add(appointedByTextbox);
        contentPane.add(qualificationLabel);
        contentPane.add(qualificationTextbox);
        contentPane.add(salaryLabel);
        contentPane.add(salaryTextbox);
        // ---------
        contentPane.add (Box.createHorizontalGlue());
        contentPane.add (Box.createHorizontalGlue());
        contentPane.add (Box.createHorizontalGlue());

        contentPane.add(joinedCheckbox);

        contentPane.add (Box.createHorizontalGlue());
        contentPane.add (Box.createHorizontalGlue());
        contentPane.add (Box.createHorizontalGlue());
        contentPane.add (Box.createHorizontalGlue());

        contentPane.add(weeklyFractionalHoursLabel);
        contentPane.add(weeklyFractionalTextbox);
        contentPane.add(workingHoursLabel);
        contentPane.add(workingHoursTextbox);
        contentPane.add(wagesPerHourLabel);
        contentPane.add(wagesPerHourTextbox);
        contentPane.add(shiftsLabel);
        contentPane.add(shiftsTextbox);

        
        contentPane.add (Box.createHorizontalGlue());
        contentPane.add (Box.createHorizontalGlue());
        contentPane.add (Box.createHorizontalGlue());
        contentPane.add (Box.createHorizontalGlue());

        contentPane.add(addFulltimeButton);
        contentPane.add(addParttimeButton);
        contentPane.add(setSalaryButton);
        contentPane.add(setWorkingShiftButton);

        contentPane.add(terminateButton);
        contentPane.add(displayNumberLabel);
        contentPane.add(displayNumberTextbox);
        contentPane.add(displayNumberButton);

        frame.pack();
        frame.setVisible(true);

    }


    public void actionPerformed(ActionEvent event)
    {
// you need to complete 
    }
    
    public void addPartTimeStaff()
    {

        // this needs error checking 
        PartTimeStaffHire newPartTimeStaffHire = new PartTimeStaffHire(getvacancy(),getDesignation(),getjobType(),
                getName(),getjobDate(),getqualification(),getAppointedBy(),getJoin(), getWagesPerHour(),getshifts(),
                getWeeklyFractional());

        //add the new partime staff member to the arraylist
        Staff.add(newPartTimeStaffHire);

        JOptionPane.showMessageDialog(frame," A new Part-Time Staff is added");
        // display the added item in the output window
        newPartTimeStaffHire.display();
        System.out.println("------------------------------------");

    }

    public void terminatePartTimeStaff()
    {

        int arrayNumber =getDispalyNumber();
        String name = getName();

        if( arrayNumber>=Staff.size() || arrayNumber<0)
        {
            JOptionPane.showMessageDialog(frame, "Please enter a a valid number from the staff arraylist");   
        }    

        else
        {

            StaffHire aStaff =Staff.get(arrayNumber);

            if(aStaff instanceof PartTimeStaffHire) {
                PartTimeStaffHire aPartTimeStaff = (PartTimeStaffHire ) aStaff ;
                aPartTimeStaff.workTerminate(name);
            }

        }
    }

    public int getDispalyNumber()
    {
        try{
            return Integer.parseInt(displayNumberTextbox.getText()); 
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(frame, "Input Exception.");   
        }
        return -1;

    }

    public int getvacancy()
    {
        int aVacancy = -1;
        try{
            aVacancy=Integer.parseInt(vacancyTextbox.getText());

        }
        catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(frame, "Please enter a number for the Vacancy");    
        }
        return aVacancy;

    }

    public String getDesignation()

    {
        String aDesignation=null;
        try{
            if(designationTextbox.getText().isEmpty()){
                throw new Exception();   
            }
            aDesignation=designationTextbox.getText();

        }

        catch (Exception e){
            JOptionPane.showMessageDialog(frame, 
                "Designation is not entered");
        }

        return aDesignation;
    }

    public String getjobType()
    {
        String aJobType=jobTypeTextbox.getText();
        return aJobType;

    }

    public String getName()
    {
        String thePhoneNumber =staffNameTextbox.getText();
        return thePhoneNumber;        
    }  

    public String getjobDate()

    {

        String aJobDate=jobDateTextbox.getText();
        return aJobDate;

    }

    public String getAppointedBy()
    {
        String theAppointedBy =appointedByTextbox.getText();
        return theAppointedBy;        
    }  

    public String getqualification()
    {
        String theQualification =qualificationTextbox.getText();
        return theQualification;        
    }    

    public String getSalary()
    {
        String theSalary =salaryTextbox.getText();
        return theSalary;        
    }    

    public String getWorkingHours()
    {
        String theWorkingHours =workingHoursTextbox.getText();
        return theWorkingHours;        
    }  

    public double getWagesPerHour()
    {
        double theWagesPerHour = 0;
        theWagesPerHour =Double.parseDouble(wagesPerHourTextbox.getText());
        return theWagesPerHour ;        
    } 

    public double getshifts()
    {
        double theshifts= 0;
        theshifts =Double.parseDouble(shiftsTextbox.getText());
        return theshifts ;        
    } 

    public boolean getJoin()
    {
        boolean theJoined =joinedCheckbox.isSelected();
        return theJoined;        
    } 

    public String getWeeklyFractional()
    {
        String theweeklyFractional =weeklyFractionalTextbox.getText();
        return theweeklyFractional;        
    }  
}


