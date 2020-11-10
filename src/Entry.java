import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Entry{

    private User author;
    private String contentEntry;
    private String entryDate;

    public Entry(String contentEntry, User author){
        this.author = author;
        this.contentEntry = contentEntry;
        this.entryDate = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContentEntry() {
        return contentEntry;
    }

    public void setContentEntry(String contentEntry) {
        this.contentEntry = contentEntry;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }
}
