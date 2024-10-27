package IPA_13;

import java.util.*;

class AutonomousCar{
    private int id;
    private String brand;
    private int numTestConducted;
    private int numTestPassed;
    private String environment;
    private String grade;

    AutonomousCar(int id, String brand, int numTestConducted, int numTestPassed, String environment){
        this.id = id;
        this.brand = brand;
        this.numTestConducted = numTestConducted;
        this.numTestPassed = numTestPassed;
        this.environment = environment;

        double rating = (numTestPassed * 100)/numTestConducted;
        if(rating >= 80){
            grade = "A1";
        }else{
            grade = "B2";
        }
    }

    void setId(int id){
        this.id = id;
    }

    void setBrand(String brand){
        this.brand = brand;
    }

    void setNumTestConducted(int count){
        numTestConducted = count;
    }

    void setNumTestPassed(int count){
        numTestPassed = count;
    }

    void setEnvironment(String env){
        environment = env;
    }

    void setGrade(String grade){
        this.grade = grade;
    }

    int getId(){
        return id;
    }

    String getBrand(){
        return brand;
    }

    String getEnvironment(){
        return environment;
    }

    int getNumTestConducted(){
        return numTestConducted;
    }

    int getNumTestPassed(){
        return numTestPassed;
    }
    String getGrade(){
        return grade;
    }

}


public class MyClass {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AutonomousCar[] cars = new AutonomousCar[4];

        for(int i = 0;i < 4; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            int nC = sc.nextInt();
            int nP = sc.nextInt();
            sc.nextLine();
            String environment = sc.nextLine();
            cars[i] = new AutonomousCar(id, brand, nC, nP, environment);
        }
        String qEnv = sc.nextLine();
        String qBrand = sc.nextLine();

        int num = findTestPassedByEnv(cars, qEnv);
        AutonomousCar res = updateCarGrade(cars, qBrand);

        if(num > 0){
            System.out.println(num);
        }else{
            System.out.println("There are no tests passed in this particular environment");
        }

        if(res == null){
            System.out.println("No car is available with the specified brand");
        }else{
            System.out.println(res.getBrand() + "::"+ res.getGrade());
        }

        sc.close();
    }


    public static int findTestPassedByEnv(AutonomousCar[] cars, String qEnv){
        int sum = 0;

        for(AutonomousCar c: cars){
            if(c.getEnvironment().equalsIgnoreCase(qEnv)){
                sum += c.getNumTestPassed();
            }
        }

        return sum;
    }

    public static AutonomousCar updateCarGrade(AutonomousCar[] cars, String qBrand){
        AutonomousCar result = null;

        for(AutonomousCar c: cars){
            if(c.getBrand().equalsIgnoreCase(qBrand)){
                return c;
            }
        }

        return result;
    }

}
