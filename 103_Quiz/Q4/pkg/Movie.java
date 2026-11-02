package pkg;
public class Movie{
    String movieName = "unknown";
    double rating = 0.0;
    int numRatings = 0;
    int revenue = 0;
    
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String movieName, double rating, int numRatings, int revenue){
       this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println();
    }

    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return rating;
    }
    public double addRating(double rate){
        double newrating = ((rating*numRatings)+rate)/(numRatings+1);
        rating = newrating;
        return newrating;
    }
    public boolean compareRatings(Movie mB){
        if(rating > mB.getRating()){
            return true;
        }
        else{
            return false;
        }
    }
}