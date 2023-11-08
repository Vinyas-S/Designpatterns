package designpatters.proxy;

public class Main {
    public static void main(String[] args) {
        IBookParse bookParser = new LazyBookParser("This is a book.");
        System.out.println(bookParser.getNumberOfPages());
    }
}
