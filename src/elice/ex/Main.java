package elice.ex;

class Book{
  String title;
  String author;
  int publishYear;
  boolean isAvailable;

  void book_information(){
    System.out.println("제목: "+title);
    System.out.println("저자: "+author);
    System.out.println("출판년도: "+publishYear);
    System.out.println("대출 가능: "+isAvailable);
  }
}

public class Main {
  public static void main(String[] args) {
    Book book = new Book();
    book.title = "자바의 정석";
    book.author = "남궁성";
    book.publishYear = 2013;
    book.isAvailable = true;

    book.book_information();

  }
}
