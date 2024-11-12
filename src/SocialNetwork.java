import java.util.ArrayList;

public class SocialNetwork {
    private ArrayList<User> users = new ArrayList<>();

    public void addUser (User newUser) {
        users.add(newUser);
    }

    public void showAllPosts(User user) {
        for (User foundUser : this.users) {
            for (Post post : foundUser.getPosts()) {
                System.out.println(post);
            }
        }
    }
}
