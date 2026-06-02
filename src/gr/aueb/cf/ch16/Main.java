package gr.aueb.cf.ch16;

public class Main {

    static void main() {
        Book pythonBook = new Book.Builder(1, "A123").build();

        Book javaBook = new Book.Builder(2, "B456")
                .author("Takis")
                .title("Java for Beginners")
                .build();

        Book javaScriptBook = new Book.Builder(3, "C789")
                .title("JavaScript")
                .build();
    }
}
