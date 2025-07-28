package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview mr_1 = new MovieReview();

        MovieReview mr_2 = new MovieReview();

        mr_1.title="베트맨";
        mr_1.review="평점 5점(5점 만점 기준)";

        mr_2.title="다크나이트";
        mr_2.review="평점 4.9점(5점 만점 기준)";

        MovieReview[] mr = new MovieReview[]{mr_1,mr_2};


        for(MovieReview mrr : mr)
        {
            System.out.println("영화 제목: "+mrr.title+" 영화 리뷰: "+mrr.review);
        }

        for(int i=0; i<mr.length; i++)
        {
            System.out.println("영화 제목: "+mr[i].title+" 영화 리뷰: "+mr[i].review);
        }




    }

    /*
    public static void main(String[] args) {
        MovieReview mr_1 = new MovieReview();

        MovieReview mr_2 = new MovieReview();

        mr_1.title="배트맨";
        mr_1.review="평점 5점(5점 만점 기준)";

        mr_2.title="다크나이트";
        mr_2.review="평점 4.9점(5점 만점 기준)";

        MovieReview[] mr = new MovieReview[]{mr_1,mr_2};

        for(MovieReview mrr : mr)
        {
            System.out.println("영화 제목: "+mrr.title+"영화 리뷰: "+mrr.review);
        }

        for(int i=0; i<mr.length; i++)
        {
            System.out.println("영화 제목: "+mr[i].title+" 영화 리뷰: "+mr[i].review);
        }

    }

     */
}
