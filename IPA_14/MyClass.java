package IPA_14;
import java.util.*;

class Movie{
    private String name;
    private String company;
    private String genre;
    private int budget;

    Movie(String name, String company, String genre, int budget){
        this.name = name;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    void setName(String name){
        this.name = name;
    }

    void setCompany(String company){
        this.company = company;
    }

    void setGenre(String genre){
        this.genre = genre;
    }

    void setBudget(int budget){
        this.budget = budget;
    }

    String getName(){
        return name;
    }

    String getCompany(){
        return company;
    }

    String getGenre(){
        return genre;
    }

    int getBudget(){
        return budget;
    }
}


class MyClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[4];
        for(int i = 0;i < 4; i++){
            String name = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt();
            sc.nextLine();
            movies[i] = new Movie(name, company, genre, budget);
        }

        String genre = sc.nextLine();
        Movie[] result = getMovieByGenre(movies, genre);

        for(Movie m: result){
            if(m.getBudget() > 80000000){
                System.out.println("High Budget Movie");
            }else{
                System.out.println("Low Budget Movie");
            }
        }


        sc.close();
    }

    public static Movie[] getMovieByGenre(Movie[] movies, String genre){
        ArrayList<Movie> arr = new ArrayList<Movie>();

        for(Movie m: movies){
            if(m.getGenre().equalsIgnoreCase(genre)){
                arr.add(m);
            }
        }

        return arr.toArray(new Movie[0]);
    }
}