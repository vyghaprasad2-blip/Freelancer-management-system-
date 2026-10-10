package model;

public class Review {

    private int reviewId;
    private int rating;
    private String comment;
    private String freelancerName;

    public Review(int reviewId, int rating,
                  String comment, String freelancerName) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.comment = comment;
        this.freelancerName = freelancerName;
    }

    public int getReviewId() {
        return reviewId;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public String getFreelancerName() {
        return freelancerName;
    }

    public void displayReview() {
        System.out.println("Review ID: " + reviewId);
        System.out.println("Freelancer: " + freelancerName);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Comment: " + comment);
    }
}