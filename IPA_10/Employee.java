public class Employee{
  private int id;
  private String name;
  private String branch;
  private double rating;
  private boolean transportDetails;

  Employee(int id, String name, String branch, double rating, boolean transportDetails){
    this.id = id;
    this.name = name;
    this.branch = branch;
    this.rating = rating;
    this.transportDetails = transportDetails;
  }

  public int getId(){
    return id;
  }

  public String getName(){
    return name;
  }

  public String getBranch(){
    return branch;
  }

  public double getRating(){
    return rating;
  }

  public boolean getTransportDetails(){
    return transportDetails;
  }

  public void setId(int id){
    this.id = id;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setBranch(String branch){
    this.branch = branch;
  }

  public void setRating(double rating){
    this.rating = rating;
  }

  public void setTranportDetails(boolean detail){
    this.transportDetails = detail;
  }

}