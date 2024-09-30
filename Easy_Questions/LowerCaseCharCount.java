import java.util.Scanner;

public class LowerCaseCharCount{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    int count = 0;
    for(int i = 0; i < input.length(); i++){
      char ch = input.charAt(i); // charAt() is used instead of indexing.
      if(ch >= 'a' && ch <= 'z') count++;
    }

    if(count == 0){
      System.out.println("No lower case characters present");
    }else{
      System.out.println(count);
    }

    sc.close();
  }
}