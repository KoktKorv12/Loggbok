import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class EntryViewForm{

    private JTextPane textEntry;
    private JButton publishButton;
    private JTextArea textArea;
    private JPanel EntryPanel;
    private JButton saveButton;
    private JTextField author;

    public static void main(String[] args) {
        JFrame frame = new JFrame("EntryViewForm");
        frame.setContentPane(new EntryViewForm().EntryPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 800));
        frame.pack();
        frame.setVisible(true);
    }

    public JPanel getEntryPanel() {
        return EntryPanel;
    }

    void addPublishListener(ActionListener listenForPublishButton) {
        publishButton.addActionListener(listenForPublishButton);
    }
}
