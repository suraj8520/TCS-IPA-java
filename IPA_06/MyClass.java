
import java.util.Scanner;

public class MyClass{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        RRT[] rrts = new RRT[4];
        
        for(int i = 0; i < 4; i++){
            int tn = sc.nextInt();
            sc.nextLine();
            String rb = sc.nextLine();
            String at = sc.nextLine();
            int priority = sc.nextInt();
            sc.nextLine();
            String project = sc.nextLine();

            rrts[i] = new RRT(tn, rb, at, priority, project);
        }
        String qp = sc.nextLine();

        RRT hp = getHighestPriorityTicket(rrts, qp);

        if(hp == null){
            System.out.println("No such ticket");
        }else{
            System.out.println(hp.getTicketNo());
            System.out.println(hp.getRaisedBy());
            System.out.println(hp.getAssignedTo());
        }

        sc.close();
    }

    public static RRT getHighestPriorityTicket(RRT[] rrts, String project){
        RRT highestPriority = null;
        for(RRT r: rrts){
            if(r.getProject().equalsIgnoreCase(project) == false) continue;

            if(highestPriority == null || highestPriority.getPriority() > r.getPriority()){
                highestPriority = r;
            }
        }

        return highestPriority;
    }
}
