/**
Name: Nikhil Acharya (Networking)
Group: N2
LonmdonMetID: 20049181
 */

//class AcademicCourse is subclass of class Course//
public class AcademicCourse extends Course
{
    //attributes of class AcademicCourse//
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered; 
    //Constructor//
    public AcademicCourse(String courseID, String courseName,int duration, String level, String credit, int numberOfAssessments){
        //caling parent class//
        super(courseID, courseName, duration);
        this.level = level;
        this.credit = credit;
        this.numberOfAssessments = numberOfAssessments;
        //setting lecturerName empty//
        this.lecturerName = "";
        //setting startingDate empty//
        this.startingDate = "";
        //setting completionDate empty//
        this.completionDate="";
        //setting isRegistered false///
        this.isRegistered = false;
    }

    //getter for level//
    public String getLevel(){
        return this.level;
    }

    public String getCourseLeader(){
        return super.courseLeader;
    }
    //getter for credit//
    public String getCredit(){
        return this.credit;
    }
    //getter for isRegistered
    public boolean getIsRegistered(){
        return this.isRegistered;
    }
    //setter for lecturerName//
    public void  setLecturerName(String Name){
        this.lecturerName = lecturerName ;
    }
    //getter for lecturerName//
    public String  getLecturerName(){
        return this.lecturerName;
    }

    //setter for numberOfAssessments//
    public void setNumberOfAssessments(int number){
        this.numberOfAssessments = numberOfAssessments;
    }

    //getter for numberOfAssessments//
    public  int getNumberOfAssessments(){
        return this.numberOfAssessments;
    }

    public String  getStartingDate(){
        return this.startingDate;
    }

    public String  getCompletionDate(){
        return this.completionDate;
    }

    //New method register//
    public void register(String courseLeader, String lecturerName,String startingDate, String completionDate){
        //Displaying if Aacademic Course is Registerd//
        if(this.isRegistered == true){
            System.out.println("The Academic Course Is Already Registered");
            System.out.println("THE COURSE LEADER NAME IS: " +super.courseLeader);
            System.out.println("THE LECTURER NAME IS: " +this.lecturerName);
            System.out.println("THE STARTING DATE IS: " +this.startingDate);
            System.out.println("THE COMPLETION DATE IS: " +this.completionDate);   
        }
        //Updating the values
        else{
            //calling courseLeader from parent class//
            super.courseLeader = courseLeader;
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate= completionDate;
            this.isRegistered = true;
        }
    }
    //method to display data//
    void display(){
        //Calling parent class display method\\
        super.display();
        if(isRegistered == true){
            //Displaying Header
            System.out.println("\n\t\tACADEMIC COURSE DETAILS");
            //Displaying LecturerName//
            System.out.println("THE LECTURER NAME IS: " + this.lecturerName);
            //Displaying level//
            System.out.println("THE LEVEL IS: " + this.level);
            //Displaying credit//
            System.out.println("THE CREDIT IS: " +credit);
            //Displaying startDate
            System.out.println("THE STARTING DATE IS: " + this.startingDate);
            //Displaying CompletionDate
            System.out.println("THE COMPLETION DATE IS: " +this.completionDate);
            //Displaying numberOfAssessments//
            System.out.println("THE NUMBER IF ASSESSMENTS IS: " +this.numberOfAssessments);
            //for Design purpose//
            System.out.println("\n-------------------------------------------------------------------------------");
        }
    }
}
