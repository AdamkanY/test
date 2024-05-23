@Entity
@Table(name = "AccessLogs")
public class AccessLogs{
    @Column(name = "Title")
    private String Title;

    @Column(name = "Timeline")
    private String Timeline;
}
public AccessLogs(String Title,String Timeline){
    this.Title = Title;
    this.Timeline = Timeline;
}
public String getTitle(){
    return Title;
}
public String getTimeline(){
    return Timeline;
}
