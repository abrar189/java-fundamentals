package lab6;

import java.util.HashSet;
import java.util.Set;

public class Shop  implements UserReview{
    private String name;
    private String description;
    private int dollarSigns;
    private Set<Review> reviewsArray;



    public Shop(String name, String description, int dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns=dollarSigns;
        reviewsArray = new HashSet<>();

    }

    @Override
    public String toString() {
        String shopReveiw= "Shop{" +
                "name='" + name + '\'' +'\n'+
                ", description='" + description + '\'' +'\n'+
                ", dollarSigns=" + dollarSigns +'\n'+
                '}';
        for(Review review:this.reviewsArray) {
            shopReveiw += "User Reviwe is" +review.toString()+"\n";
        }
        return  shopReveiw;
        }



    public int dollarSign() {
        return  dollarSigns;
    }

    public String getDesc() {
        return  description;
    }

    public String getName() {
        return  name;
    }

    @Override
    public void addReview(Review review) {
        reviewsArray.add(review);


    }
}
