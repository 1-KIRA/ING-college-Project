/**
Name: Nikhil Acharya (Networking)
Group: N2
LonmdonMetID: 20049181
 */

//Class NonAcadmicCourse is subclass of class Course//
public class NonAcademicCourse extends Course
{
    //attributes of class NonAcademicCourse//
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;

    public NonAcademicCourse(String courseID, String courseName,int duration,String prerequisite){
        //calling parent class //
        super(courseID, courseName, duration);
        this.prerequisite = prerequisite;
        //setting startDate empty//
        this.startDate = "";
        //setting completionDate empty//
        this.completionDate = "";
        //setting examDate empty//
        this.examDate = "";
        //setting isRegistered status fasle//
        this.isRegistered = false;
        //setting isRemoved status false//   
    }

    //getter for startDate//
    public String getStartDate(){
        return this.startDate;
    }

    // getter for completionDate
    public String getCompletionDate(){
        return this.completionDate;
    }

    //getter for examDate//
    public String getExamDate(){
        return this.examDate;  
    }

    //getter for prerequisite//
    public String getPrerequisite(){
        return this.prerequisite;
    } 

    //getter for isRegistered//
    public boolean getIsRegistered(){
        return this.isRegistered;
    }

    //getter for isRemoved//
    public boolean getIsRemoved(){
        return this.isRemoved;
    }             

    public String getInstructorName(){
        return this.instructorName;
    }

    public String getCourseLeader(){
        return super.courseLeader;
    }
    //setter for InstructorName//
    public void  setInstructorName(String name){
        if(isRegistered == false){
            this.instructorName = instructorName;
            System.out.println("The updated instructorname is: " + this.instructorName);
        }
        else{
            System.out.println("THE COURSE IS ALREADY  REGISTERED SO, CAN'T CHANGE THE INSTRUCTOR");
        }
    }
    //new method register//
    public void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
        if(isRegistered == false){
            super.courseLeader = courseLeader;
            this.instructorName = instructorName;
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            //setting isRegistered value to true//
            this.isRegistered = true;
        }
        else{
            System.out.println("THE COURSE IS ALREADY REGISTERERD");
        }
    }

    // method to Remove//
    public void remove(){
        if(isRemoved == true){
            System.out.println("THE COURSE IS ALREADY REMOVED");
        }
        else{
            super.courseLeader = "";
            this.instructorName ="";
            this.startDate = "";
            this.completionDate = "";
            this.examDate = "";
            //setting isRegistered value false//
            this.isRegistered = false;
            //setting isRemoved value true//
            this.isRemoved = true;
        }
    } 

    //display method//
    void display(){
        super.display();
        //displaying output if isRegistererd is true//
        if(isRegistered == true){
            System.out.println("\n\t\tNON-ACADEMIC COURSE DETAILS");
            System.out.println("THE INSTRUCTOR NAME IS: " + this.instructorName);
            System.out.println("THE STARTING DATE IS: " + this.startDate);
            System.out.println("THE COMPLETION DATE IS: " + this.completionDate);
            System.out.println("THE EXAM DATE IS: " + this.examDate);
            System.out.println("\n-------------------------------------------------------------------------------");
        }
    }
}
