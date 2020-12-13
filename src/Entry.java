import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Entry{

    private User author;
    private String contentEntry;
    private Date entryDate;

    public Entry(String contentEntry, User author){
        this.author = author;
        this.contentEntry = contentEntry;
        this.entryDate = java.util.Calendar.getInstance().getTime();
    }

    public User getAuthor() {

        return author;
    }

    public void setAuthor(User author) {

        this.author = author;
    }

    public String getContentEntry()
    {
        return contentEntry;
    }

    public void setContentEntry(String contentEntry) {

        this.contentEntry = contentEntry;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}
