
public class Course{
    // this is how access modifiers are used in java
    private int courseId;
    private String courseName; // ends with semicolon
    private String courseAdmin;
    private int quiz;
    private int handson;

    // setters and getters
    public void setCourseId(int id){
        courseId = id;
    }

    public int getCourseId(){
        return courseId;
    }

    public void setCourseName(String name){
        courseName = name;
    }
    
    public String getCourseName(){
        return courseName;
    }

    public void setCourseAdmin(String name){
        courseAdmin = name;
    }

    public String getCourseAdmin(){
        return courseAdmin;
    }

    public void setQuizCount(int count){
        quiz = count;
    }

    public int getQuizCount(){
        return quiz;
    }

    public void setHandson(int count){
        handson = count;
    }

    public int getHandson(){
        return handson;
    }
}