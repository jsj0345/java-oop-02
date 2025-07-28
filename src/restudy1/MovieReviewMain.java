package restudy1;

public class MovieReviewMain {
  public static void main(String[] args) {
    MovieReview mr1 = new MovieReview();
    mr1.title = "아이언맨";
    mr1.review="평점 10점";

    MovieReview mr2 = new MovieReview();
    mr2.title = "다크나이트";
    mr2.review = "평점 10점";

    MovieReview[] mr_collection = new MovieReview[]{mr1,mr2};

    for(int i=0; i< mr_collection.length; i++){
      System.out.println("영화 제목: "+mr_collection[i].title+" 영화 리뷰: "+mr_collection[i].review);
    }
  }
}
