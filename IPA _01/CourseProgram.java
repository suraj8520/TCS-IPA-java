import java.util.Scanner;

class CourseProgram{

    /***
     * usually number of objects to be taken are specified. 
     * so we have to create an array of that number and use them. 
     */

    public static void main(String[] args){
        Course[] courses = new Course[4];
        Scanner sc = new Scanner(System.in);

        // Now input the data;
        for(int i = 0; i < 4; i++){
            courses[i] = new Course();
            int id = sc.nextInt();
            // after reading the int it doesn't register next line so in that case the nextLine takes the enter key so that basically stores the empty string because of which we get the error so to solve this we use sc.nextLine() one more time to make sure we aren't getting empty array\
            sc.nextLine();
            String courseName = sc.nextLine();
            String adminName = sc.nextLine();
            int quizCount = sc.nextInt();
            int handsonCount = sc.nextInt();

            courses[i].setCourseId(id);
            courses[i].setCourseName(courseName);
            courses[i].setCourseAdmin(adminName);
            courses[i].setQuizCount(quizCount);
            courses[i].setHandson(handsonCount);
        }
        
        // for(Course cs: courses){
        //     System.out.println("*********************************************");
        //     System.out.println(cs.getCourseId());
        //     System.out.println(cs.getCourseName());
        //     System.out.println(cs.getCourseAdmin());
        //     System.out.println(cs.getQuizCount());
        //     System.out.println(cs.getHandson());
        //     System.out.println("*********************************************");
        // }
        sc.nextLine();
        // sc.nextLine();
        String admin = sc.nextLine();
        int handson = sc.nextInt();

        // To get the courses which are less than handson
        int avg = findAvgOfQuizByAdmin(courses, admin);
        if(avg == 0){
            System.out.println("No course found!");
        }else{
            System.out.println(avg);
        }

        Course[] crs = sortCourseByHandsOn(courses, handson);
        if(crs.length == 0){
            System.out.println("No courses found with mentioned attributes.");
        }else{
            for(Course cs: crs){
                System.out.println(cs.getCourseName());
            }
        }

        sc.close();
    }

    // Return avg number of quiz by taking the array of quiz objects
    public static int findAvgOfQuizByAdmin(Course[] crs, String adminName){
        int sum = 0, count = 0;

        for(Course cs: crs){
            String crsAdmin = cs.getCourseAdmin();
            // it's not showing equal cause they're references are different so we need to use .equals.
            if(adminName.equals(crsAdmin)){
                sum += cs.getQuizCount();
                count++;
            }
        }

        if(count == 0) return 0;

        return (int)(sum/count);
    }

    public static Course[] sortCourseByHandsOn(Course[] crs, int handson){

        int count = 0;

        // Get the count of courses which are less than handson
        for(Course cs: crs){
            int crsHandson = cs.getHandson();
            if(crsHandson < handson) count++;
        }

        Course[] result = new Course[count];
        
        // add the courses which are less than handson in new array
        int index = 0;
        for(Course cs: crs){
            int crsHandson = cs.getHandson();
            if(crsHandson < handson){
                result[index] = cs;
                index++;
            }
        }

        // Now sort those courses in ascending order
        for(int i = 0; i < count - 1; i++){
            for(int j = 0; j < count-i-1; j++){
                if(result[j].getHandson() > result[j+1].getHandson()){
                    Course temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
            }
        }
        return result;
    }
}