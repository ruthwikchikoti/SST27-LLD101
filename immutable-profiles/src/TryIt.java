import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Before: " + p.getEmail());
        System.out.println("After:  " + p.getEmail());
        System.out.println("Immutable: to change email, create a new instance via Builder.");
        UserProfile p2 = UserProfile.builder(p.getId(), "evil@example.com").build();
        System.out.println("New email: " + p2.getEmail());
    }
}
