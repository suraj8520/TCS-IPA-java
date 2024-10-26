package IPA_12;

import java.util.*;

class Medicine{
    private String name;
    private String batch;
    private String disease;
    private int price;

    Medicine(String name, String batch, String disease, int price){
        this.name = name;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getBatch(){
        return batch;
    }

    public String getDisease(){
        return disease;
    }

    public int getPrice(){
        return price;
    }
}


public class MyClass {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Medicine[] meds = new Medicine[4];
        for(int i = 0; i < 4; i++){
            String name = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            meds[i] = new Medicine(name, batch, disease, price);
        }
        String qd = sc.nextLine();
        Integer[] res = getPriceByDisease(qd, meds);
        for(Integer i: res){
            System.out.println(i);
        }
        sc.close();
    }

    public static Integer[] getPriceByDisease(String qd, Medicine[] meds){
        ArrayList<Integer> res = new ArrayList<>();

        for(Medicine m: meds){
            if(m.getDisease().equalsIgnoreCase(qd)){
                res.add(m.getPrice());
            }
        }
        Integer[] result = res.toArray(new Integer[0]);
        Arrays.sort(result);
        return result;
    }
}

