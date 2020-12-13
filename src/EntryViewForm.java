import javax.swing.*;
import java.awt.event.ActionListener;

public class EntryViewForm extends JFrame{

    private JTextPane textEntry;
    private JButton publishButton;
    private JTextArea textArea = new JTextArea("Inlägg",80,80);
    private JPanel EntryPanel;
    private JButton saveButton;
    private JTextField author = new JTextField("Författare",80);


    EntryViewForm(){
        this.EntryPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.EntryPanel.add(this.publishButton);
        this.EntryPanel.add(this.saveButton);
        this.EntryPanel.add(this.author);
        this.EntryPanel.add(this.textArea);
        this.add(this.EntryPanel);
        this.setVisible(true);

    }

    public JPanel getEntryPanel() {
        return EntryPanel;
    }

    void addPublishListener(ActionListener listenForPublishButton) {
        publishButton.addActionListener(listenForPublishButton);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
