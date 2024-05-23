@Entity
@Table(name = "Mentoring")
public class Mentoring{
    @Column(name = "Title")
    private String Title;

    @Column(name = "FrequencyOfEvent")
    private Boolean FrequencyOfEvent = false;
    
    @Column(name = "Description")
    private String Description;

    @Column(name = "Timeline")
    private String Timeline;
}
public Mentoring(String Title,Boolean FrequencyOfEvent,String Description,String Timeline){
    this.Title = Title;
    this.FrequencyOfEvent = FrequencyOfEvent;
    this.Description = Description;
    this.Timeline = Timeline;
}
public String getTitle(){
    return Title;
}
public void setTitle(String Title){
    this.Title = Title;
}
public Boolean FrequencyOfEvent(int input){
    if(int input = 1){
    return FrequencyOfEvent = true;
} else if(int input = 0){
    return FrequencyOfEvent = false;
}
}
public Boolean getFrequencyOfEvent(){
    return FrequencyOfEvent;
}
public String getDescription(){
    return Description;
}
public void setDescription(String Description){
    this.Description = Description;
}
public String getTimeline(){
    return Timeline;
}
public void setTimeline(String Timeline){
    this.Timeline = Timeline;
}