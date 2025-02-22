@Entity
@Table(name = "Independent Project")
public class IndependentProject{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Hidden
    @Column(name = "ProjectID")
    private Int ProjectId;

    @Column(name = "ProjectName")
    private String ProjectName;
    
    @Column(name = "Description")
    private String Description;

    @Column(name = "Reccuring")
    private Boolean Recurring;

    @Column(name = "StartTime")
    private Timestamp StartTime;

    @Column(name = "EndTime")
    private Timestamp EndTime;

}
public IndependentProject(Int ProjectID,String ProjectName,
    String Description,Boolean Reccuring,Timestamp StartTime,Timestamp EndTime){
    this.ProjectID = ProjectID;
    this.ProjectName = ProjectName;
    this.Description = Description;
    this.Reccuring = Reccuring;
    this.StartTime = StartTime;
    this.EndTime = EndTime;  
}
public Int getProjectID(){
    return ProjectID;
}
public void setProjectID(Int ProjectID){
    this.ProjectID = ProjectID;
}
public String getProjectName(){
    return ProjectName;
}
public void setProjectName(String ProjectName){
    this.ProjectName = ProjectName;
}
public String getDescription(){
    return Description;
}
public void setDescription(String Description){
    this.Description = Description;
}
public Boolean getReccuring(){
    return Reccuring;
}
public void setReccuring(Boolean Reccuring){
    this.Reccuring = Reccuring;
}
public Timestamp getStartTime(){
    return StartTime;
}
public void setStartTime(Timestamp StartTime){
    this.StartTime = StartTime;
}
public Timestamp getEndTime(){
    return EndTime;
}
public void setEndTime(Timestamp EndTime){
    this.EndTime = EndTime;
}
