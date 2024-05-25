package class1;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview[] reviews = new MovieReview[2]; // 2

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception; // 2

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간 영화";
        reviews[1] = aboutTime; // 2

        // 1
        System.out.println("영화 제목 : " + inception.title + " 리뷰 : " + inception.title);
        System.out.println("영화 제목 : " + aboutTime.title + " 리뷰 : " + aboutTime.title);

        // 2
        for (MovieReview review : reviews) {
            System.out.println("영화 : " + review.title + " 리뷰 : " + review.review);
        }


    }
}
