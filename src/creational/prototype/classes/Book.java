package creational.prototype.classes;

public class Book {
    private int bId;
    private String bName;

    public Book(int bId, String bName) {
        this.bId = bId;
        this.bName = bName;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bId=" + bId +
                ", bName='" + bName + '\'' +
                '}';
    }
}
