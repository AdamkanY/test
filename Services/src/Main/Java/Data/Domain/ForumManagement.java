@Entity
@Table(name = "ForumManagement")
public class ForumManagement{
    @Column(name = "ForumPost")
    private String ForumPost;
}
public ForumManagement(String ForumPost){
    this.ForumPost = ForumPost;
}
public String getForumPost(){
    return ForumPost;
}
public void setForumPost(String ForumPost){
    this.ForumPost = ForumPost;
}