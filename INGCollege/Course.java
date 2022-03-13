/**
Name: Nikhil Acharya (Networking)
Group: N2
LonmdonMetID: 20049181
*/
public class Course
{
    //attributes of class Course//
    public String courseID;
    private String courseName;
    private int duration;
    public String courseLeader;
    //Constructor//
    public Course(String courseID, String courseName,int duration){
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
        //Setting courseLeader empty//
        this. courseLeader = "";
    }
    
    // getter for courseID//
    public String getCourseID(){
        return this.courseID;
        
    }
    
    //getter for courseName//
    public String getCourseName(){
        return this.courseName;
    }
    
    //getter for duration//
    public int getDuration(){
        return this.duration;
    }
    
    //setter for courseLeader//
    public void setCourseLeader(String name){
        this.courseLeader = name;
    }
    
    //Method To Display Data//
     void display(){
         //creating a line//
        System.out.println("\n---------------------------------------------------------------------");
        //Displaying Header//
        System.out.println("\t\t COURSE DETAILS");
        
        System.out.println("COURSE ID:" +this.courseID);

        System.out.println("COURSE NAME:" +this.courseName);
        
         //Displaying courseLeader only if it's not empty
        if(this.courseLeader!=""){
        System.out.println("COURSE LEADER:" +this.courseLeader);
        }
        
        System.out.println("DURATION:" +this.duration);
        //Ending the created  line//
        System.out.println("\n---------------------------------------------------------------------");  
    }   
}
