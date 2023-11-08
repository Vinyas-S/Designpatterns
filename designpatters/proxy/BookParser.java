package designpatters.proxy;

public class BookParser implements IBookParse{
    private String book;

    public BookParser(String book) {
        // some expensive parsing.
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        return 10;
    }
}
