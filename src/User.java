public class User {

    String Name;

    /**
     * Hämtar systemets användarnamn
     */
    public User(){
        com.sun.security.auth.module.NTSystem NTSystem = new
                com.sun.security.auth.module.NTSystem();
        Name = (NTSystem.getName());
  }
    public String getName() {
        return Name;
    }
}
