import java.util.Scanner;

public class Solution{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // read 4 student objects
        Student[] students = new Student[4];
        for(int i = 0; i < 4; i++){
            int rollNo = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double score = sc.nextDouble();
            //** WE have nextBoolean as well  and nextDouble() and nextFloat() as well*/
            boolean dayScholar = sc.nextBoolean();

            students[i] = new Student(rollNo, name, branch, score, dayScholar);
        }
        int count = findCountOfDayscholarStudents(students);
        if(count == 0){
            System.out.println("There are no such dayscholar students");
        }else{
            System.out.println(count);
        }

        Student st = findStudentWithSecondHighestScore(students);
        if(st == null){
            System.out.println("There are no Student from non day scholars");
        }else{
            System.out.println(st.getRollNo() + "#" + st.getName() + "#" + st.getScore());
        }
        sc.close();
    }

    // find number of dayScholar student with score greater than 80

    public static int findCountOfDayscholarStudents(Student[] students){
        int count = 0;
        for(Student st: students){
            if(st.getScore() > 80 && st.getDayScholar() == true) count++;
        }

        return count;
    }

    // Find student with second highest score from the non dayScholars;

    public static Student findStudentWithSecondHighestScore(Student[] students){
        Student highest = null, sHighest = null;
           
        for(Student st: students){
            // If it's day scholar then we don't need their score
            if(st.getDayScholar() == true) continue;

            if(highest == null || highest.getScore() < st.getScore()){
                sHighest = highest;
                highest = st;
                //* if second highest is null then it will always be assigned. even if the scores are equal. but if we want to do something else then we can add another condition */ */
                //** If secondHighest  = null then if another score which is not equal to the highest will be selected */
                //** if secondHigest is not null then the score which is greater than sHighest and smaller than higest one will be selected. */
            }
            else if(sHighest == null && st.getScore() < highest.getScore()){
                sHighest = st;
            }
            else if(sHighest != null && sHighest.getScore() < st.getScore() && st.getScore() < highest.getScore()){
                sHighest = st;
            }
        } 

        return sHighest;
    }

}