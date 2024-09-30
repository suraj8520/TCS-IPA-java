
public class Footwear{
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    Footwear(int id, String name, String type, int amount){
        footwearId = id;
        footwearName = name;
        footwearType = type;
        price = amount;
    }

    public void setFootwearId(int id){
        footwearId = id;
    }

    public void setFootwearName(String name){
        footwearName = name;
    }

    public void setFootwearType(String type){
        footwearType = type;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getFootwearId(){
        return footwearId;
    }

    public String getFootwearName(){
        return footwearName;
    }

    public String getFootwearType(){
        return footwearType;
    }

    public int getPrice(){
        return price;
    }
}