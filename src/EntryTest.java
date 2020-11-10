public class EntryTest {
    public static void main(String[] args) {
        User u = new User();
        Entry e = new Entry("Test", u);
        System.out.println(e.getContentEntry());
    }
}
