import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntryManager {

    private EntryViewForm view;

    /**
     *
     * @param save
     */
    public EntryManager (Save save){
        this.view = new EntryViewForm();
    }

    private class PublishListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                System.out.println("Test");
            }catch(Exception e1){
                e1.printStackTrace();
            }
        }
    }

}
