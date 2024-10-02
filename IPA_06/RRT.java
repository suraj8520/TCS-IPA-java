
public class RRT{
    private int ticketNo;
    private String raisedBy;
    private String assignedTo;
    private int priority;
    private String project;

    RRT(int tn, String rb, String at, int pt, String pj){
        ticketNo = tn;
        raisedBy = rb;
        assignedTo = at;
        priority = pt;
        project = pj;
    }

    public void setTicketNo(int tn){
        ticketNo = tn;
    }

    public int getTicketNo(){
        return ticketNo;
    }

    public void setRaisedBy(String name){
        raisedBy = name;
    }

    public String getRaisedBy(){
        return raisedBy;
    }
    
    public void setAssignedTo(String name){
        assignedTo = name;
    }

    public String getAssignedTo(){
        return assignedTo;
    }

    public void setPriority(int pt){
        priority = pt;
    }

    public int getPriority(){
        return priority;
    }

    public void setProject(String pj){
        project = pj;
    }

    public String getProject(){
        return project;
    }
}