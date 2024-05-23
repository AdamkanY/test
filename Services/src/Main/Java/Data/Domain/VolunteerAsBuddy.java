@Entity
@Table(name = "VolunteerAsBuddy")
public class VolunteerAsBuddy{
    @Column(name = "Language")
    private String Language;
}
public VolunteerAsBuddy(String Language){
    this.Language = Language;
}
public String getLanguage(){
    return Language;
}
public void setLanguage(String Language)){
    this.Language = Language;
}