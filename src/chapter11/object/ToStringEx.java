package chapter11.object;

class Book {
    String title;
    String author;

    Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ", " + author;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book = new Book("두잇자바", "Ted");
        System.out.println(book); // Object 의 valueOf 함수를 호출 -> toString 호출

        String str = new String("test");
        System.out.println(str);
    }
}
