public class Post {
    private String content;
    private String author;
    private int likes;

    public Post (String content, String author) {
        this.content = content;
        this.author = author;
    }

    public void like() {
        this.likes += 1;
        System.out.println("You just liked a post by " + author);
    }

    //GetMethod -------------------------------------------------------------------------------

    public int getLikes () {
        return this.likes;
    }

    @Override
    public String toString () {
        return content + "\nAuthor: " + this.author;
    }
}
