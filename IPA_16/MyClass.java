package IPA_16;

import java.util.*;

class NavalVessel{
    private int id;
    private String name;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification;

    NavalVessel(int id, String name, int np, int nc, String purpose){
        this.id = id;
        this.name = name;
        this.noOfVoyagesPlanned = np;
        this.noOfVoyagesCompleted = nc;
        this.purpose = purpose;
    }

    void setId(int id){
        this.id = id;
    }

    void setName(String name){
        this.name = name;
    }

    void setVoyagesPlannedCount(int count){
        this.noOfVoyagesPlanned = count;
    }

    void setVoyagesCompletedCount(int count){
        this.noOfVoyagesCompleted = count;
    }

    void setPurpose(String purpose){
        this.purpose = purpose;
    }

    void setClassification(String cls){
        this.classification = cls;
    }

    int getId(){
        return id;
    }

    String getName(){
        return name;
    }

    int getVoyagesPlannedCount(){
        return noOfVoyagesPlanned;
    }

    int getVoyagesCompletedCount(){
        return noOfVoyagesCompleted;
    }

    String getPurpose(){
        return purpose;
    }

    String getClassification(){
        return classification;
    }
}

class MyClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NavalVessel[] nvs = new NavalVessel[4];

        for(int i = 0; i < 4; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int countPlanned = sc.nextInt();
            int countCompleted = sc.nextInt();
            sc.nextLine();
            String purpose = sc.nextLine();
            nvs[i] = new NavalVessel(id,name, countPlanned, countCompleted, purpose);
        }
        int percentage = sc.nextInt();
        sc.nextLine();
        String purpose = sc.nextLine();
        int avg = findAvgVoyagesByPct(nvs, percentage);
        NavalVessel rnv = findVesselByGrade(nvs, purpose);

        System.out.println(avg);

        if(rnv != null){
            System.out.println(rnv.getName() + "%" + rnv.getClassification());
        }else{
            System.out.println("No such vessel exists!");
        }

        sc.close();
    }

    public static int findAvgVoyagesByPct(NavalVessel[] nvs, int percentage){
        int count = 0;
        int sum = 0;

        for(NavalVessel n: nvs){
            double pct = (n.getVoyagesCompletedCount() * 100)/n.getVoyagesPlannedCount();
            if(pct >= percentage){
                count++;
                sum += n.getVoyagesCompletedCount();
            }
        }

        if(count == 0) return 0;
        return (int) sum / count;
    }

    public static NavalVessel findVesselByGrade(NavalVessel[] nvs, String purpose){
        NavalVessel res = null;
        
        for(NavalVessel n: nvs){
            if(n.getPurpose().equalsIgnoreCase(purpose)){
                int nc = n.getVoyagesCompletedCount();
                int np = n.getVoyagesPlannedCount();
                double percentage = (nc * 100) / np;
                
                n.setClassification(getClass(percentage));
                return n;
            }
        }

        return res;
    }


    public static String getClass(double percentage){
        if( percentage == 100)
            return "Star";
        if( percentage >= 80 && percentage <= 99)
            return "Leader";
        if(percentage >= 55 && percentage <= 79)
            return "Inspirer";
        return "Striver";
    }

}