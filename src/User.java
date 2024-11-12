import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<User> friends;
    private ArrayList<Post> posts;

    public User (String username) {
        this.username = username;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public void addFriend (User newFriend) {
        if (!this.friends.contains(newFriend)) {
            this.friends.add(newFriend);
            if (this.username != "Rasmus") {
                System.out.println(this.username + " just added " + newFriend + " as a friend.");
            }
            else {
                System.out.println("You just added " + newFriend + " as a friend.");
            }
        }
    }

    public void addPost (String content) {
        Post post = new Post (content, username);
        posts.add(post);
        if (this.username != "Rasmus") {
            System.out.println(this.username + " just published " + post);
        }
        else{
            System.out.println("You just published: " + post);
        }
    }

    public void showFriendsPosts () {
        System.out.println("All your friends' posts:");
        for (User foundUser : friends) {
            for (Post post : foundUser.getPosts()) {
                System.out.println(post);
            }
        }
    }

    //GetMethod--------------------------------------------------------------------
    public ArrayList<Post> getPosts () {
        return this.posts;
    }

    public ArrayList<User> getFriends () {
        return this.friends;
    }

    @Override
    public String toString() {
        return this.username;
    }
}
