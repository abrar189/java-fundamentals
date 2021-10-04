package lab6;

import java.util.*;

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("hi");
    }
    private  String name;
    private  int stars;
    private  String priceCategory;
    private Set<Review> reviewsArray;


    public Restaurant(String name, String priceCategory) {

        this.name = name;
        this.stars=0;
        this.priceCategory = priceCategory;
        reviewsArray = new HashSet<>();
    }

    @Override
    public String toString() {
        String reviewRestaurant= "";

         reviewRestaurant = "Name: " + name +"\n"+ " Star : " + stars + "\n"+" Price Category: " + priceCategory + "\n";
       reviewRestaurant+=getReviews();

        return reviewRestaurant;
    }
    public void addReview(Review review) {
        reviewsArray.add(review);
        updaterate();}


        public void updaterate() {
        int total=0;
        for (Review review : this.reviewsArray) {

            total+=(review.getstars());
        }
        stars=total/ this.reviewsArray.size();
    }
    public String getName() {
        return name;

    }

    public String getPriceCategory() {
        return  priceCategory;

    }

private  String getReviews(){
    StringBuilder restaurantReviews = new StringBuilder();
    for (Review review : this.reviewsArray) {
        restaurantReviews.append(review.toString());
    }
    return restaurantReviews.toString();
}


}
