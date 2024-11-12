
public class Main {
    public static void main(String[] args) {

        SocialNetwork socialNetwork = new SocialNetwork();

        User mainUser = new User("Rasmus");

        User user1 = new User("Albert");

        User user2 = new User("Dennis");

        User user3 = new User("AdolfHitler");

        mainUser.addFriend(user1);

        mainUser.addFriend(user3);

        System.out.println(mainUser.getFriends());

        mainUser.addPost("bla bla bla...");

        user2.addPost("bla bla bla bla bla bla bla bla bla bla...");

        user1.addPost("hej");

        mainUser.showFriendsPosts();
    }
}