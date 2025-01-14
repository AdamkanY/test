@Entity
@Table(name = "Forum Response")
public class ForumResponse{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Hidden
    @Column(name = "ResponseID")
    private Int ResponseID;

    @Column(name = "Content")
    private String Content;

    @Column(name = "ResponseTime")
    private Timestamp ResponseTime;
}
public ForumResponse(Int ResponseID,String Content,
    Timestamp ResponseTime){
    this.ResponseID = ResponseID;
    this.Content = Content;
    this.ResponseTime = ResponseTime;
}
public Int getResponseID(){
    return ResponseID;
}
public void setResponseID(Int ResponseID){
    this.ResponseID = ResponseID;
}
public String getContent(){
    return Content;
}
public void setContent(String Content){
    this.Content = Content;
}
public Timestamp getResponseTime(){
    return ResponseTime;
}
public void setResponseTime(Timestamp ResponseTime){
    this.ResponseTime = ResponseTime;
}