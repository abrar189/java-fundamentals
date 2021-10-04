package lab6;

public class Review {
    public int stars;
    private  String body;
    private  String author;


    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars=stars;

    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +'\n'+
                ", author='" + author + '\'' +'\n'+
                ", stars=" + stars +'\n'+
                '}';
    }

    public String getbody() {
        return body;
    }

    public String getauthor() {
        return author;
    }

    public int getstars() {
        return this.stars;
    }


}
