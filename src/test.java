import javax.swing.*;

public class test {
    public static void main(String[] args) {
        EntryViewForm view = new EntryViewForm();
        JFrame frame = new JFrame("EntryViewForm");
        frame.setContentPane(new EntryViewForm().getEntryPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
