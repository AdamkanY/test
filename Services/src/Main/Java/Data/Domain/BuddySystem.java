@Entity
@Table(name = "Buddy System")
public class BuddySystem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Hidden
    @Column(name = "BuddyPairID")
    private Int BuddyPairID;

    @Column(name = "Languages")
    private String Languages;

    @Column(name = "Status")
    private BuddyStatus status;

}
public BuddySystem(Int BuddyPairID,String Languages,
    BuddyStatus Status){
    this.BuddyPairID = BuddyPairID;
    this.Languages = Languages;
    this.Status = Status;
}
public Int getBuddyPairID(){
    return BuddyPairID;
}
public void setBuddyPairID(Int BuddyPairID){
    this.BuddyPairID = BuddyPairID;
}
public String getLanguages(){
    return Languages;
}
public void setLanguages(String Languages){
    this.Languages = Languages;
}
public BuddyStatus getStatus(){
    return Status;
}
public void setStatus(BuddyStatus Status){
    this.Status = Status;
}
public enum BuddyStatus {
    ACTIVE, COMPLETED
}