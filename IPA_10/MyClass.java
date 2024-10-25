import java.util.*;

public class MyClass{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Employee[] emps = new Employee[4];
    for(int i = 0; i < 4; i++){
      int id = sc.nextInt();
      sc.nextLine();
      String name = sc.nextLine();
      String branch = sc.nextLine();
      double rating = sc.nextDouble();
      boolean ct = sc.nextBoolean();
      sc.nextLine();
      /**** nextBoolean also causes issues. */
      emps[i] = new Employee(id, name, branch, rating, ct);
    }
    String branch = sc.nextLine();
    
    int count = findCountOfEmployeesUsingCompTransport(emps, branch);
    Employee e = findEmployeeWithSecondHighestRating(emps);
    if(count == 0){
      System.out.println("No such Employees");
    }else{
      System.out.println(count);
    }

    if(e == null){
      System.out.println("All Employees using company transport");
    }else{
      System.out.println(e.getId());
      System.out.println(e.getName());
    }
    sc.close();
  }

  public static int findCountOfEmployeesUsingCompTransport(Employee[] emps, String branch){
    int count = 0;
    ///*** Boolean.parseBoolean(string) => to convert into boolean */
    for(Employee e: emps){
      if(e.getBranch().equals(branch) && e.getTransportDetails()) count++;
    }

    return count;
  }

  public static Employee findEmployeeWithSecondHighestRating(Employee[] emps){
    Employee[] empsN = Arrays.stream(emps).filter(e -> !e.getTransportDetails()).toArray(Employee[]:: new);

    if(empsN.length == 0) return null;
    Employee high = empsN[0];
    Employee sHigh = null;
    for(Employee e: empsN){
      if(high.getRating() < e.getRating()){
        sHigh = high;
        high = e;
      }else if(sHigh == null && e.getRating() < high.getRating()){
        sHigh = e;
      }else if(sHigh != null && e.getRating() > sHigh.getRating() && e.getRating() < high.getRating()){
        sHigh = e;
      }
    } 

    return sHigh;
  } 
}