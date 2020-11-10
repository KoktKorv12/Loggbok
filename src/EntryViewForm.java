import javax.swing.*;

public class EntryViewForm {

    private JTextPane textEntry;
    private JButton publishButton;
    private JTable EntryTable;
    private JPanel EntryPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("EntryViewForm");
        frame.setContentPane(new EntryViewForm().EntryPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
