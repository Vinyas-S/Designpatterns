package designpatters.proxy;

public class LazyBookParser implements IBookParse{
    BookParser parser;
    private String book = null;

    public LazyBookParser(String book) {
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        if(this.parser == null) this.parser = new BookParser(book);
        return this.parser.getNumberOfPages();
    }
}
