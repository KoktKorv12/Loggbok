public class User {
    public static void main(String[] args) {
        com.sun.security.auth.module.NTSystem NTSystem = new
                com.sun.security.auth.module.NTSystem();
        System.out.println(NTSystem.getName());
    }
}
