public class EntryTest {
    public static void main(String[] args) {
        User u = new User();
        Entry e = new Entry("Bajsa på Elliot", u);
        System.out.println(e.getContentEntry() + "\n" + "Publisher:" + u.getName());
    }
}
