@Entity
@Table(name = "JobAdvertisements")
public class JobAdvertisements{
    @Column(name = "Role")
    private String Role;

    @Column(name = "Requirements")
    private String Requirements;

    @Column(name = "ApplicationProcess")
    private String ApplicationProcess;

    @Column(name = "Deadline")
    private Date Deadline;
}
public JobAdvertisements(String Role,String Requirements,String ApplicationProcess,Date Deadline){
    this.Role = Role;
    this.Requirements = Requirements;
    this.ApplicationProcess = ApplicationProcess;
    this.Deadline = Deadline;
}
public String getRole(){
    return Role;
}
public void setRole(String Role){
    this.Role = Role;
}
public String getRequirements(){
    return Requirements;
}
public void setRequirements(String Requirements){
    this.Requirements = Requirements;
}
public String getApplicationProcess(){
    return ApplicationProcess;
}
public void setApplicationProcess(String ApplicationProcess){
    this.ApplicationProcess = ApplicationProcess;
}
public Date getDeadline(){
    return Deadline;
}
public void setDeadline(Date Deadline){
    this.Deadline = Deadline;
}