import javax.swing.*;
import javax.swing.text.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntryTest {
    public static void main(String[] args) {

        User u = new User();
        JFrame frame = new JFrame("EntryViewForm");
        EntryViewForm View = new EntryViewForm();
        frame.setContentPane(View.getEntryPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        Entry e = new Entry("Hej", u);
        System.out.println(e.getContentEntry() + "\n" + "Publisher: " + u.getName() + "\n" + e.getEntryDate());
    }
}
