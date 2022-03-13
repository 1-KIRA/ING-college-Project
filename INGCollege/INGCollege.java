/**
Name: Nikhil Acharya (Networking)
Group: N2
LonmdonMetID: 20049181
*/
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Iterator;
import java.awt.event.*;
import java.util.ArrayList;
public class INGCollege extends WindowAdapter implements ActionListener
{
    private JFrame frame,frame1;

    private JPanel academic,nonAcademic;

    private JLabel a_CourseID1,a_CompletionDate,a_CourseLeader,a_AcademicCourse,a_CourseID,a_CourseName,a_Duration,a_LecturertName,a_Level,a_Credit,a_noOfAssessment,
    a_StartingDate,non_CourseID,non_CourseLeader,non_CourseID1,non_CourseName,non_Duration,non_InstructorName,non_StartDate,non_CompletionDate,non_Prerequisite,
    non_Heading,non_ExamDate,courseRegistration,WelcomeLabel,ContactLabel,contactDetails,copyrightLabel;

    private JTextField a_txt_CourseID1,a_txt_CompletionDate,a_txt_CourseLeader, a_txt_CourseID,a_txt_CourseName,a_txt_Duration,a_txt_LecturerName,a_txt_Level,a_txt_Credit,
    a_txt_noOfAssessment,non_txt_CourseLeader,a_txt_StartingDate,non_txt_CourseID,non_txt_CourseName,non_txt_Duration,non_txt_InstructorName,non_txt_StartDate,
    non_txt_CompletionDate,non_txt_Prerequisite,non_txt_ExamDate,non_txt_CourseID1;

    private JButton academic_btn,nonacademic_btn,a_Add,a_Register,a_Display,a_Clear,non_Add,non_Register, non_Display, non_Clear,non_Remove;

    private ArrayList<Course>AcademicCourseList = new ArrayList<Course>();

    private ArrayList<Course>NonAcademicCourseList = new ArrayList<Course>();

    private Course object1,object2;
    private int count=0;
    private int count1=0;

    //Creating Constructor
    INGCollege (){
        frame =new JFrame("INGCollege");
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(255,255,204));

        //Label for heading of Form
        courseRegistration = new JLabel("CourseRegistration");
        courseRegistration.setForeground(Color.BLUE);
        courseRegistration.setBounds(260,1,500,40);
        courseRegistration.setFont(new Font("Arial",Font.BOLD,30));
        frame.add(courseRegistration);

        //Label For some details about form
        WelcomeLabel=new JLabel("Welcome to the Course Registration form.");
        WelcomeLabel.setFont(new Font("Arial",Font.BOLD,20));
        WelcomeLabel.setBounds(200,200,500,40);
        frame.add(WelcomeLabel);

        //Label For some details about form
        ContactLabel=new JLabel("If you have any queries please contact ING college through");
        ContactLabel.setFont(new Font("Arial",Font.BOLD,20));
        ContactLabel.setBounds(100,250,800,40);
        frame.add(ContactLabel);

        //Label For some details about form
        contactDetails=new JLabel("Gmail: ingcollege@edu.np or Phone number: +977 981225122");
        contactDetails.setFont(new Font("Arial",Font.BOLD,20));
        contactDetails.setBounds(100,300,800,40);
        frame.add(contactDetails);

        //AcademicButton
        /**Whenthis button is clicked Academic course Panel is added to frame */
        academic_btn = new JButton("AcademicCourse");
        academic_btn.setBounds(130,600,250,50);
        academic_btn.setFocusable(false);
        academic_btn.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(academic_btn);

        //NonAcademicButton
        /**Whenthis button is clicked NonAcademicCourse Panel is added to frame */
        nonacademic_btn= new JButton("NonAcademicCourse");
        nonacademic_btn.setBounds(430,600,250,50);
        nonacademic_btn.setFocusable(false);
        nonacademic_btn.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(nonacademic_btn);

        //footer 
        copyrightLabel=new JLabel("This form was developed by Nikhil Acharya in 2021.All rights Reserved");
        copyrightLabel.setFont(new Font("Arial",Font.PLAIN,15));
        copyrightLabel.setBounds(180,700,500,40);
        frame.add(copyrightLabel);

        /**Academmic course labels,textfields,buttons  starts here*/

        //Panel for AcademicCourse 
        academic = new JPanel();
        academic.setSize(800,600);
        academic.setBackground(new Color(255,255,204));
        academic.setVisible(true);
        academic.setLayout(null);

        //Label for Heading of AcademmicCourse     
        a_AcademicCourse = new JLabel("AcademicCourse");
        a_AcademicCourse.setBounds(330,10,250,100);
        a_AcademicCourse.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,20));
        academic.add(a_AcademicCourse);

        //Label for CourseID for AcademicCourse
        a_CourseID = new JLabel("CourseID:");
        a_CourseID.setBounds(50,75,100,80);
        a_CourseID.setFont(new Font("Arial",Font.BOLD,15));
        academic.add(a_CourseID);

        //TextField for CourseID for AcademicCourse
        a_txt_CourseID= new JTextField();
        a_txt_CourseID.setBounds(180,102,150,25);
        a_txt_CourseID.setFont(new Font("Arial",Font.PLAIN,15));
        academic.add(a_txt_CourseID);

        //Label for CourseName for AcademicCourse
        a_CourseName = new JLabel("CourseName:");
        a_CourseName.setBounds(400,102,100,25);
        a_CourseName.setFont(new Font("Arial",Font.BOLD,15));
        academic.add(a_CourseName);

        //TextField for CourseName for AcademicCourse
        a_txt_CourseName= new JTextField();
        a_txt_CourseName.setBounds(510,102,150,25);
        a_txt_CourseName.setFont(new Font("Arial",Font.PLAIN,15));
        academic.add(a_txt_CourseName);

        //Label for Duration for AcademicCourse
        a_Duration = new JLabel("Duration:");
        a_Duration.setBounds(50,120,100,80);
        a_Duration.setFont(new Font("Arial",Font.BOLD,15));
        academic.add(a_Duration);

        //TextField for Duration for AcademicCourse
        a_txt_Duration= new JTextField();
        a_txt_Duration.setBounds(180,150,150,25);
        a_txt_Duration.setFont(new Font("Arial",Font.PLAIN,15));
        academic.add(a_txt_Duration);

        // Label for Level for AcademicCourse
        a_Level = new JLabel("Level:");
        a_Level.setBounds(450,150,100,25);
        a_Level.setFont(new Font("Arial",Font.BOLD,15));
        academic.add(a_Level);

        //TextField for Level for AcademicCourse
        a_txt_Level= new JTextField();
        a_txt_Level.setBounds(510,150,150,25);
        a_txt_Level.setFont(new Font("Arial",Font.PLAIN,15));
        academic.add(a_txt_Level);

        //Label for Credit for AcademicCourse
        a_Credit = new JLabel("Credit:");
        a_Credit.setBounds(50,190,150,25);
        a_Credit.setFont(new Font("Arial",Font.BOLD,15));
        academic.add(a_Credit);

        //TextField for Credit for AcademicCourse
        a_txt_Credit= new JTextField();
        a_txt_Credit.setBounds(180,190,150,25);
        a_txt_Credit.setFont(new Font("Arial",Font.PLAIN,15));
        academic.add(a_txt_Credit);

        // Label for No.ofAssessment for AcademicCourse
        a_noOfAssessment = new JLabel("No.ofAssessment:");
        a_noOfAssessment.setBounds(360,160,180,80);
        a_noOfAssessment.setFont(new Font("Arial",Font.BOLD,15));
        academic.add(a_noOfAssessment);

        //TextField for No.ofAssessment for AcademicCourse
        a_txt_noOfAssessment= new JTextField();
        a_txt_noOfAssessment.setBounds(510,190,150,25);
        a_txt_noOfAssessment.setFont(new Font("Arial",Font.PLAIN,15));
        academic.add(a_txt_noOfAssessment);

        /**Register for AcademicCourse*/

        //Label for CourseID for AcademicCourse Register
        a_CourseID1= new JLabel("CourseID:");
        a_CourseID1.setBounds(50,260,100,80);
        a_CourseID1.setFont(new Font("Arial",Font.BOLD,15));
        academic.add(a_CourseID1);

        //TextField for CourseID for AcademicCourse Register
        a_txt_CourseID1= new JTextField();
        a_txt_CourseID1.setBounds(180,290,150,25);
        a_txt_CourseID1.setFont(new Font("Arial",Font.PLAIN,15));
        academic.add(a_txt_CourseID1);

        //Label for CourseLeader for AcademicCourse Register
        a_CourseLeader = new JLabel("CourseLeader:");
        a_CourseLeader.setBounds(380,290,140,25);
        a_CourseLeader.setFont(new Font("Arial",Font.BOLD,15));
        academic.add(a_CourseLeader);

        //TextField for CourseLeader for AcademicCourse Register
        a_txt_CourseLeader= new JTextField();
        a_txt_CourseLeader.setBounds(510,290,150,25);
        a_txt_CourseLeader.setFont(new Font("Arial",Font.PLAIN,15));
        academic.add(a_txt_CourseLeader);

        //Label for LecturerName for AcademicCourse Register
        a_LecturertName = new JLabel("LecturerName:");
        a_LecturertName.setBounds(50,310,150,80);
        a_LecturertName.setFont(new Font("Arial",Font.BOLD,15));
        academic.add(a_LecturertName);

        //TextField for LecturerName for AcademicCourse Register
        a_txt_LecturerName= new JTextField();
        a_txt_LecturerName.setBounds(180,340,150,25);
        a_txt_LecturerName.setFont(new Font("Arial",Font.PLAIN,15));
        academic.add(a_txt_LecturerName);

        // Label for StartingDate for AcademicCourse Register
        a_StartingDate = new JLabel("StartingDate:");
        a_StartingDate.setBounds(380,340,100,25);
        a_StartingDate.setFont(new Font("Arial",Font.BOLD,15));
        academic.add(a_StartingDate);

        //TextField for StartingDate for AcademicCourse Register
        a_txt_StartingDate= new JTextField();
        a_txt_StartingDate.setBounds(510,340,150,25);
        a_txt_StartingDate.setFont(new Font("Arial",Font.PLAIN,15));
        academic.add(a_txt_StartingDate);

        // Label for CompletionDate AcademicCourse Register
        a_CompletionDate = new JLabel("CompletionDate:");
        a_CompletionDate.setBounds(50,360,120,80);
        a_CompletionDate.setFont(new Font("Arial",Font.BOLD,15));
        academic.add(a_CompletionDate);

        //TextField for CompletionDate for AcademicCourse
        a_txt_CompletionDate= new JTextField();
        a_txt_CompletionDate.setBounds(180,385,150,25);
        a_txt_CompletionDate.setFont(new Font("Arial",Font.PLAIN,15));
        academic.add(a_txt_CompletionDate);

        //Add Button for AcademicCourse
        a_Add = new JButton("Add");
        a_Add.setBackground(new Color(134,234,234));
        a_Add.setBounds(525,226,120,40);
        a_Add.setFocusable(false);
        academic.add(a_Add);

        //Register Button for AcademicCourse
        a_Register = new JButton("Register");
        a_Register.setBounds(525,385,120,40);
        a_Register.setBackground(new Color(134,234,234));
        a_Register.setFocusable(false);
        academic.add(a_Register);

        //Display Button for AcademicCourse
        a_Display = new JButton("Display");
        a_Display.setBounds(200,500,120,40);
        a_Display.setBackground(new Color(134,234,234));
        a_Display.setFocusable(false);
        academic.add(a_Display);

        //Clear Button for AcademicCourse
        a_Clear = new JButton("Clear");
        a_Clear.setBounds(490,500,120,40);
        a_Clear.setBackground(new Color(134,234,234));
        a_Clear.setFocusable(false);
        academic.add(a_Clear);

        /**NON ACADEMIC COURSE panel,label,textfields and buttonsSTARTS HERE*/
        //Panel for NonAcademicCourse
        nonAcademic = new JPanel();
        nonAcademic.setSize(800,600);
        nonAcademic.setVisible(true);
        nonAcademic.setBackground(new Color(255,255,204));
        nonAcademic.setLayout(null);

        //Label for Heading of NonAcademmicCourse
        non_Heading = new JLabel("NonAcademicCourse");
        non_Heading.setBounds(300,10,250,100);
        non_Heading.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,20));
        nonAcademic.add(non_Heading);

        //Label for CourseID FOR NonAcademicCourse
        non_CourseID = new JLabel("CourseID:");
        non_CourseID.setBounds(50,75,100,80);
        non_CourseID.setFont(new Font("Arial",Font.BOLD,15));
        nonAcademic.add(non_CourseID);

        //TextField for CourseID FOR NonAcademicCourse
        non_txt_CourseID= new JTextField();
        non_txt_CourseID.setBounds(180,102,150,25);
        non_txt_CourseID.setFont(new Font("Arial",Font.PLAIN,15));
        nonAcademic.add(non_txt_CourseID);

        //Label for CourseName FOR NonAcademicCourse
        non_CourseName = new JLabel("CourseName:");
        non_CourseName.setBounds(400,102,100,25);
        non_CourseName.setFont(new Font("Arial",Font.BOLD,15));
        nonAcademic.add(non_CourseName);

        //TextField for CourseName FOR NonAcademicCourse
        non_txt_CourseName= new JTextField();
        non_txt_CourseName.setBounds(510,102,150,25);
        non_txt_CourseName.setFont(new Font("Arial",Font.PLAIN,15));
        nonAcademic.add(non_txt_CourseName);

        //Label for Duration FOR NonAcademicCourse
        non_Duration = new JLabel("Duration:");
        non_Duration.setBounds(50,120,100,80);
        non_Duration.setFont(new Font("Arial",Font.BOLD,15));
        nonAcademic.add(non_Duration);

        // Label for Prerequisite for NonAcademicCourse
        non_Prerequisite = new JLabel("Prerequisite:");
        non_Prerequisite.setBounds(400,150,100,25);
        non_Prerequisite.setFont(new Font("Arial",Font.BOLD,15));
        nonAcademic.add(non_Prerequisite);

        //TextField for Prerequisite for NonAcademicCourse
        non_txt_Prerequisite= new JTextField();
        non_txt_Prerequisite.setBounds(510,150,150,25);
        non_txt_Prerequisite.setFont(new Font("Arial",Font.PLAIN,15));
        nonAcademic.add(non_txt_Prerequisite);

        //TextField of Duration FOR NonAcademicCourse
        non_txt_Duration= new JTextField();
        non_txt_Duration.setBounds(180,150,150,25);
        non_txt_Duration.setFont(new Font("Arial",Font.PLAIN,15));
        nonAcademic.add(non_txt_Duration);

        /**REGISTER FOR NonAcademicCourse*/

        //Label for CourseID FOR NonAcademicCourse
        non_CourseID1 = new JLabel("CourseID:");
        non_CourseID1.setBounds(50,220,120,80);
        non_CourseID1.setFont(new Font("Arial",Font.BOLD,15));
        nonAcademic.add(non_CourseID1);

        //TextField for CourseID FOR NonAcademicCourse
        non_txt_CourseID1= new JTextField();
        non_txt_CourseID1.setBounds(180,246,150,25);
        non_txt_CourseID1.setFont(new Font("Arial",Font.PLAIN,15));
        nonAcademic.add(non_txt_CourseID1);

        // Label for InstructorName FOR NonAcademicCourse
        non_InstructorName = new JLabel("InstructorName:");
        non_InstructorName.setBounds(50,270,120,80);
        non_InstructorName.setFont(new Font("Arial",Font.BOLD,15));
        nonAcademic.add(non_InstructorName);

        //TextField for InstructorName FOR NonAcademicCourse
        non_txt_InstructorName= new JTextField();
        non_txt_InstructorName.setBounds(180,294,150,25);
        non_txt_InstructorName.setFont(new Font("Arial",Font.PLAIN,15));
        nonAcademic.add(non_txt_InstructorName);

        //Label for CourseLeader FOR NonAcademicCourse
        non_CourseLeader = new JLabel("CourseLeader:");
        non_CourseLeader.setBounds(380,220,180,80);
        non_CourseLeader.setFont(new Font("Arial",Font.BOLD,15));
        nonAcademic.add(non_CourseLeader);

        //TextField for CourseLeader FOR NonAcademicCourse
        non_txt_CourseLeader= new JTextField();
        non_txt_CourseLeader.setBounds(510,246,150,25);
        non_txt_CourseLeader.setFont(new Font("Arial",Font.PLAIN,15));
        nonAcademic.add(non_txt_CourseLeader);

        // Label for StartingDate FOR NonAcademicCourse
        non_StartDate = new JLabel("StartingDate:");
        non_StartDate.setBounds(400,270,120,80);
        non_StartDate.setFont(new Font("Arial",Font.BOLD,15));
        nonAcademic.add(non_StartDate);

        //TextField for StartingDate FOR NonAcademicCourse
        non_txt_StartDate= new JTextField();
        non_txt_StartDate.setBounds(510,294,150,25);
        non_txt_StartDate.setFont(new Font("Arial",Font.PLAIN,15));
        nonAcademic.add(non_txt_StartDate);

        // Label for CompletionDATE FOR NonAcademicCourse
        non_CompletionDate = new JLabel("CompletionDate:");
        non_CompletionDate.setBounds(50,350,120,30);
        non_CompletionDate.setFont(new Font("Arial",Font.BOLD,15));
        nonAcademic.add(non_CompletionDate);

        //TextField for CompletionDATE FOR NonAcademicCourse
        non_txt_CompletionDate= new JTextField();
        non_txt_CompletionDate.setBounds(180,355,150,25);
        non_txt_CompletionDate.setFont(new Font("Arial",Font.PLAIN,15));
        nonAcademic.add(non_txt_CompletionDate);

        //Label for ExamDate
        non_ExamDate = new JLabel("ExamDate:");
        non_ExamDate.setBounds(400,350,120,30);
        non_ExamDate.setFont(new Font("Arial",Font.BOLD,15));
        nonAcademic.add(non_ExamDate);

        //Textfield for ExamDate
        non_txt_ExamDate= new JTextField();
        non_txt_ExamDate.setBounds(510,350,150,25);
        non_txt_ExamDate.setFont(new Font("Arial",Font.PLAIN,15));
        nonAcademic.add(non_txt_ExamDate);

        non_Add = new JButton("Add");
        non_Add.setBounds(530,190,120,35);
        non_Add.setBackground(new Color(134,234,234));
        non_Add.setFocusable(false);
        nonAcademic.add(non_Add);

        //Register Button for NonAcademicCourse
        non_Register = new JButton("Register");
        non_Register.setBounds(525,390,120,35);
        non_Register.setBackground(new Color(134,234,234));
        non_Register.setFocusable(false);
        nonAcademic.add(non_Register);

        //Display Button for NonAcademicCourse
        non_Display= new JButton("Display");
        non_Display.setBounds(325,550,120,35);
        non_Display.setBackground(new Color(134,234,234));
        non_Display.setFocusable(false);
        nonAcademic.add(non_Display);

        //Clear Button for NonAcademicCourse
        non_Clear = new JButton("Clear");
        non_Clear.setBounds(490,550,120,35);
        non_Clear.setBackground(new Color(134,234,234));
        non_Clear.setFocusable(false);
        nonAcademic.add(non_Clear);

        //Remove Button for NonAcademicCourse
        non_Remove = new JButton("Remove");
        non_Remove.setBounds(165,550,120,35);
        non_Remove.setBackground(new Color(134,234,234));
        non_Remove.setFocusable(false);
        nonAcademic.add(non_Remove);

        /**Registering in ActionListener*/

        academic_btn.addActionListener(this);
        nonacademic_btn.addActionListener(this);
        a_Add.addActionListener(this);
        a_Display.addActionListener(this);
        a_Register.addActionListener(this);
        a_Clear.addActionListener(this);

        non_Add.addActionListener(this);
        non_Display.addActionListener(this);
        non_Remove.addActionListener(this);
        non_Register.addActionListener(this);
        non_Clear.addActionListener(this);

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(this);
    }

    //method for Clearing AcademicCourse
    public void AcademicClear()
    {
        a_txt_CourseID.setText("");
        a_txt_CourseName.setText("");
        a_txt_Duration.setText("");
        a_txt_LecturerName.setText("");
        a_txt_Level.setText("");
        a_txt_Credit.setText("");
        a_txt_noOfAssessment.setText("");
        a_txt_StartingDate.setText("");
        a_txt_CourseID1.setText("");
        a_txt_CourseLeader.setText("");
        a_txt_CompletionDate.setText("");
    }

    //Method for clearing NonAcademicCourse
    public void NonAcademicClear()
    {
        non_txt_CourseID.setText("");
        non_txt_CourseName.setText("");
        non_txt_Duration.setText("");
        non_txt_InstructorName.setText("");
        non_txt_StartDate.setText("");
        non_txt_CompletionDate.setText("");
        non_txt_Prerequisite.setText("");
        non_txt_CourseID1.setText("");
        non_txt_CourseLeader.setText("");
        non_txt_ExamDate.setText("");
    }

    /** ActionListener*/
    public void actionPerformed(ActionEvent e){
        /** Events after clicking buttons for NonAcademicCourse*/
        //ActionPerformerd for Clear Button in AcademicCourse
        if(e.getSource()==a_Clear){
            AcademicClear();
            JOptionPane.showMessageDialog(frame,"All Area are Cleared");
        }

        //Display of panel(pan) after clicking AcademicoCourse Button 
        if(e.getSource()==academic_btn){
            frame.add(academic);
            academic.setVisible(true);
            nonAcademic.setVisible(false);
            WelcomeLabel.setVisible(false);
            ContactLabel.setVisible(false);
            contactDetails.setVisible(false);
        }

        //After Click8ing Add button in Academic Course
        if(e.getSource()==a_Add){
            //if button is pressed ansd fields are empty
            if
            (a_txt_CourseID.getText().isEmpty()||
            a_txt_CourseName.getText().isEmpty()||
            a_txt_Duration.getText().isEmpty()||
            a_txt_Level.getText().isEmpty()||
            a_txt_Credit.getText().isEmpty()||
            a_txt_noOfAssessment.getText().isEmpty())
            {                                                             
                JOptionPane.showMessageDialog(frame,"Empty Field Founds","Alert!!",JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{
                //If fields are not empty
                String a_courseID= a_txt_CourseID.getText();
                String a_courseName= a_txt_CourseName.getText();
                String a_level= a_txt_Level.getText();
                String a_credit= a_txt_Credit.getText();
                int a_duration;
                int a_numberOfAssessment;
                for(Course c:AcademicCourseList)
                {
                    if (c.getCourseID().equals(a_courseID))
                    {
                        AcademicClear();
                        JOptionPane.showMessageDialog(frame,"CourseID exists Please enter another ID","Alert!!",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                try{
                    a_duration =Integer.parseInt(a_txt_Duration.getText());
                    a_numberOfAssessment= Integer.parseInt(a_txt_noOfAssessment.getText());
                }
                catch(Exception z){
                    AcademicClear();
                    JOptionPane.showMessageDialog(frame,"Please input Integer Value in duration and numberofAsessment.");
                    return;
                }
                object1 = new AcademicCourse(a_courseID,a_courseName,a_duration,a_level,a_credit,a_numberOfAssessment);
                AcademicCourseList.add(object1);
                JOptionPane.showMessageDialog(frame,"Course Successfully added");
            }
        }

        //After Clicking Register button in Academic Course
        if(e.getSource()==a_Register){
            //If fields are empty
            if(a_txt_CourseID1.getText().isEmpty()||
            a_txt_CourseLeader.getText().isEmpty()||
            a_txt_LecturerName.getText().isEmpty()||
            a_txt_StartingDate.getText().isEmpty()||
            a_txt_CompletionDate.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty Field Found Please fill in all the blanks.","Alert!!",JOptionPane.WARNING_MESSAGE);
                return;
            }
            else
            {
                //if fields are not empty
                String regID=a_txt_CourseID1.getText();
                String regCourseleader=a_txt_CourseLeader.getText();
                String reglecName=a_txt_LecturerName.getText();
                String regStartDate = a_txt_StartingDate.getText();
                String regcomDate = a_txt_CompletionDate.getText();
                for(int i=0; i<AcademicCourseList.size();i++){
                    if(AcademicCourseList.get(i).getCourseID().equals(a_txt_CourseID1.getText()))
                    {
                        AcademicCourse a_c = (AcademicCourse)(AcademicCourseList.get(i));
                        count=count+1;
                        if(!a_c.getIsRegistered())
                        {
                            a_c.register(regCourseleader,reglecName,regStartDate,regcomDate);
                            JOptionPane.showMessageDialog(frame,"Course Successfully Registered");
                            return;
                        }
                        if(a_c.getIsRegistered())
                        {
                            JOptionPane.showMessageDialog(frame,"Course is Already Registered.","Alert!!",JOptionPane.WARNING_MESSAGE);
                            return;

                        }
                    }
                }

                if(count==0){
                    JOptionPane.showMessageDialog(frame,"CourseID doesn't Exists","Alert!!",JOptionPane.WARNING_MESSAGE);
                    return;
                }

            }
        }

        if(e.getSource()==a_Display){
            {
                DefaultTableModel tableModel1 = new DefaultTableModel();
                JTable table = new JTable(tableModel1);

                //adding columns
                String column[]={"CourseID","CourseName","Duration","Level","Credit","NumberOfAssessment","CourseLeader","LecturerName","StartingDate","CompletionDate"};
                for(int i=0;i<10;i++)
                    tableModel1.addColumn(column[i]);
                for(int i=0; i<AcademicCourseList.size();i++)
                {
                    AcademicCourse a_c1 = (AcademicCourse)(AcademicCourseList.get(i));
                    String str1 =String.valueOf(a_c1.getDuration());
                    String str2 =String.valueOf(a_c1.getNumberOfAssessments());

                    String data[]={a_c1.getCourseID(),a_c1.getCourseName(),str1,a_c1.getLevel(),a_c1.getCredit(),str2,a_c1.getCourseLeader(),a_c1.getLecturerName(),a_c1.getStartingDate(),a_c1.getCompletionDate()};  
                    tableModel1.insertRow(tableModel1.getRowCount(), data);
                }

                frame1 = new JFrame("Display For AcademicCourse");
                frame1.setSize(800, 800);
                frame1.add(new JScrollPane(table));
                frame.setLayout(null);
                frame1.setVisible(true);
            }
        }

        /** Events after clicking buttons for NonAcademicCourse*/
        //Display of panel(nonAcademic) after clicking NonAcademicfCourse Button
        if(e.getSource()==nonacademic_btn){
            frame.add(nonAcademic);
            academic.setVisible(false);
            nonAcademic.setVisible(true);
            WelcomeLabel.setVisible(false);
            ContactLabel.setVisible(false);
            contactDetails.setVisible(false);
        }

        //After Clicking Add button in NonAcademicCourse
        if(e.getSource()==non_Add){
            if(non_txt_CourseID.getText().isEmpty()||
            non_txt_CourseName.getText().isEmpty()||
            non_txt_Duration.getText().isEmpty()||
            non_txt_Prerequisite.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty Field Found Please fill in all the blanks.","Alert!!",JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{
                //If fields are not empty
                String non_ID= non_txt_CourseID.getText();
                String non_Name= non_txt_CourseName.getText();
                String non_prerequisite = non_txt_Prerequisite.getText();
                int non_duration;
                for(Course c:NonAcademicCourseList)
                {
                    if (c.getCourseID().equals(non_ID))
                    {
                        NonAcademicClear();
                        JOptionPane.showMessageDialog(frame,"CourseID exists Please enter another ID","Alert!!",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                try{
                    non_duration =Integer.parseInt(non_txt_Duration.getText());
                }
                catch(Exception x){
                    NonAcademicClear();
                    JOptionPane.showMessageDialog(frame,"Please input Integer value in duration.");
                    return;
                }
                object2 = new NonAcademicCourse(non_ID,non_Name,non_duration,non_prerequisite);
                NonAcademicCourseList.add(object2);
                JOptionPane.showMessageDialog(frame,"Course Successfully added.");

            }
        }

        //After clicking register button in NonAcademicCourse
        if(e.getSource()==non_Register){
            //If fields are empty
            if(non_txt_CourseID1.getText().isEmpty()||
            non_txt_CourseLeader.getText().isEmpty()||
            non_txt_InstructorName.getText().isEmpty()||
            non_txt_StartDate.getText().isEmpty()||
            non_txt_CompletionDate.getText().isEmpty()||
            non_txt_ExamDate.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty Field Found Please fill in all the blanks.","Alert!!",JOptionPane.WARNING_MESSAGE);
                return;
            }
            else
            {
                //if fields are not empty
                String nonregID=non_txt_CourseID1.getText();
                String nonregCourseleader=non_txt_CourseLeader.getText();
                String nonregInsName= non_txt_InstructorName.getText();
                String nonregStartDate =  non_txt_StartDate.getText();
                String nonregComDate =  non_txt_CompletionDate.getText();
                String nonregExmDate = non_txt_ExamDate.getText();
                for(int i=0; i<NonAcademicCourseList.size();i++){
                    if(NonAcademicCourseList.get(i).getCourseID().equals(non_txt_CourseID1.getText()))
                    {
                        NonAcademicCourse na_c = (NonAcademicCourse)(NonAcademicCourseList.get(i));
                        count=count+1;
                        if(!na_c.getIsRegistered())
                        {
                            na_c.register(nonregCourseleader,nonregInsName,nonregStartDate,nonregComDate,nonregExmDate);
                            JOptionPane.showMessageDialog(frame,"Course Successfully Registered");
                            return;

                        }
                        if(na_c.getIsRegistered())
                        {
                            JOptionPane.showMessageDialog(frame,"Course is Already Registered.","Alert!!",JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    }
                }
                if(count1==1)
                {
                    JOptionPane.showMessageDialog(frame,"CourseID doesn't Exists","Alert!!",JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }

        //AdctionPerformed for Remove Button in NonAcademicCourse
        if(e.getSource()==non_Remove){
            String remCourseID=JOptionPane.showInputDialog(frame,"EnterCourserID to remove course","Remove",JOptionPane.QUESTION_MESSAGE);
            for(int i=0; i<NonAcademicCourseList.size();i++){
                if(NonAcademicCourseList.get(i).getCourseID().equals(remCourseID))
                {
                    NonAcademicCourse na_c = (NonAcademicCourse)(NonAcademicCourseList.get(i));
                    if(!na_c.getIsRemoved())
                    {
                        na_c.remove();
                        JOptionPane.showMessageDialog(frame,"Course Successfully Removed");
                        return;
                    }

                    if(na_c.getIsRemoved())
                    {
                        na_c.remove();
                        JOptionPane.showMessageDialog(frame,"Course is already Removed","Alert",JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"CourseID doesn't Exists","Alert!!",JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }

        //ActionPerformed in Display Button for NonAcademicCourse
        if(e.getSource()==non_Display){
            {
                DefaultTableModel tableModel = new DefaultTableModel();
                JTable table = new JTable(tableModel);

                //adding columns
                String column[]={"CourseID","CourseName","Duration","Prerequisite","CourseLeader","InstructorName","StartingDate","CompletionDate","ExamDate"};
                for(int i=0;i<9;i++)
                    tableModel.addColumn(column[i]);
                for(int i=0; i<NonAcademicCourseList.size();i++)
                {
                    NonAcademicCourse na_c1 = (NonAcademicCourse)(NonAcademicCourseList.get(i));
                    String str1 =String.valueOf(na_c1.getDuration());

                    String data[]={na_c1.getCourseID(),na_c1.getCourseName(),str1,na_c1.getPrerequisite(),na_c1.getCourseLeader(),na_c1.getInstructorName(),na_c1.getStartDate(),na_c1.getCompletionDate(),na_c1.getExamDate()};  
                    tableModel.insertRow(tableModel.getRowCount(), data);
                }

                frame1 = new JFrame("Display for NonAcadedmicCourse");
                frame1.setSize(800, 800);
                frame1.add(new JScrollPane(table));
                frame.setLayout(null);
                frame1.setVisible(true);
            }
        }
        //ActionPerformerd for Clear Button in NonAcademicCourse
        if (e.getSource()== non_Clear)
        {
            NonAcademicClear();
            JOptionPane.showMessageDialog(frame,"All area are Cleared");
        }

    }

    //Using WindowListener while closing Application
    public void windowClosing(WindowEvent e) {
        int x=JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit? \n All saved progress will be lost.");
        if(x==JOptionPane.YES_OPTION){
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        else
        {
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);   
        }
    }

    //MainMethod
    public static void main(String[]args){
        new INGCollege();
    }
}