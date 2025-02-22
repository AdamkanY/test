@Entity
@Table(name = "System Log")
public class SystemLog{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Hidden
    @Column(name = "LogID")
    private Int LogID;

    @Column(name = "TimeStamp")
    private Timestamp TimeStamp;

    @Column(name = "Description")
    private String Description;
}
public SystemLog(Int LogID,Timestamp TimeStamp,String Description){
    this.LogID = LogID;
    this.TimeStamp = TimeStamp;
    this.Description = Description;
}
public Int getLogID(){
    return LogID;
}
public void setLogID(Int LogID){
    this.LogID = LogID;
}
public Timestamp getTimeStamp(){
    return TimeStamp;
}
public void setTimeStamp(Timestamp TimeStamp){
    this.TimeStamp = TimeStamp;
}
public String getDescription(){
    return Description;
}
public void setDescription(String Description){
    this.Description = Description;
}