import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Services.src.Main.Java.Data.Domain.AccesLogs;
import Services.src.Main.Java.Data.Domain.ForumManagement;
import Services.src.Main.Java.Data.Domain.JobAdvertisement;
import Services.src.Main.Java.Data.Domain.Mentoring;
import Services.src.Main.Java.Data.Domain.ProjectInitiation;
import Services.src.Main.Java.Data.Domain.RoomAssignment;
import Services.src.Main.Java.Data.Domain.Tutoring;
import Services.src.Main.Java.Data.Domain.VolunteerAsBuddy;

import Services.src.Main.Java.Data.Repository.AccessLogsRepository;
import Services.src.Main.Java.Data.Repository.ForumManagementRepository;
import Services.src.Main.Java.Data.Repository.JobAdvertisementRepository;
import Services.src.Main.Java.Data.Repository.MentoringRepository;
import Services.src.Main.Java.Data.Repository.ProjectInitiationRepository;
import Services.src.Main.Java.Data.Repository.RoomAssignmentRepository;
import Services.src.Main.Java.Data.Repository.TutoringRepository;
import Services.src.Main.Java.Data.Repository.VolunteerAsBuddyRepository;

@Service
public class CollaborationsList {

    @Autowired
    private AccessLogsRepository accessLogsRepository;

    @Autowired
    private ForumManagementRepository forumManagementRepository;

    @Autowired
    private JobAdvertisementRepository jobAdvertisementsRepository;

    @Autowired
    private MentoringRepository mentoringRepository;

    @Autowired
    private ProjectInitiationRepository projectInitiationRepository;

    @Autowired
    private RoomAssignmentRepository roomAssignmentRepository;

    @Autowired 
    private TutoringRepository tutoringRepository;

    @Autowired
    private VolunteerAsBuddyRepository volunteerAsBuddyRepository;

    public List<AccessLogs> getAllAccessLogs() {
        return accessLogsRepository.findAll();
    }

    public AccessLogs createAccessLog(AccessLogs accessLog) {
        return accessLogsRepository.save(accessLog);
    }

    public AccessLogs getAccessLogById(Long id) {
        return accessLogsRepository.findById(id).orElse(null);
    }

    public AccessLogs updateAccessLog(Long id, AccessLogs accessLogDetails) {
        AccessLogs accessLog = accessLogsRepository.findById(id).orElse(null);

        if (accessLog != null) {
            accessLog.setTitle(accessLogDetails.getTitle());
            accessLog.setTimeline(accessLogDetails.getTimeline());

            return accessLogsRepository.save(accessLog);
        }

        return null;
    }

    public void deleteAccessLog(Long id) {
        accessLogsRepository.deleteById(id);
    }
    
    public List<ForumManagement> getAllForumPosts() {
        return forumManagementRepository.findAll();
    }

    public ForumManagement createForumPost(ForumManagement forumPost) {
        return forumManagementRepository.save(forumPost);
    }

    public ForumManagement getForumPostById(Long id) {
        return forumManagementRepository.findById(id).orElse(null);
    }

    public ForumManagement updateForumPost(Long id, ForumManagement forumPostDetails) {
        ForumManagement forumPost = forumManagementRepository.findById(id).orElse(null);

        if (forumPost != null) {
            forumPost.setForumPost(forumPostDetails.getForumPost());

            return forumManagementRepository.save(forumPost);
        }

        return null;
    }

    public void deleteForumPost(Long id) {
        forumManagementRepository.deleteById(id);
    }
    
    public List<JobAdvertisements> getAllJobAdvertisements() {
        return jobAdvertisementsRepository.findAll();
    }

    public JobAdvertisements createJobAdvertisement(JobAdvertisements jobAdvertisement) {
        return jobAdvertisementsRepository.save(jobAdvertisement);
    }

    public JobAdvertisements getJobAdvertisementById(Long id) {
        return jobAdvertisementsRepository.findById(id).orElse(null);
    }

    public JobAdvertisements updateJobAdvertisement(Long id, JobAdvertisements jobAdvertisementDetails) {
        JobAdvertisements jobAdvertisement = jobAdvertisementsRepository.findById(id).orElse(null);

        if (jobAdvertisement != null) {
            jobAdvertisement.setRole(jobAdvertisementDetails.getRole());
            jobAdvertisement.setRequirements(jobAdvertisementDetails.getRequirements());
            jobAdvertisement.setApplicationProcess(jobAdvertisementDetails.getApplicationProcess());
            jobAdvertisement.setDeadline(jobAdvertisementDetails.getDeadline());

            return jobAdvertisementsRepository.save(jobAdvertisement);
        }

        return null;
    }

    public void deleteJobAdvertisement(Long id) {
        jobAdvertisementsRepository.deleteById(id);
    }
    
    public List<Mentoring> getAllMentorings() {
        return mentoringRepository.findAll();
    }

    public Mentoring createMentoring(Mentoring mentoring) {
        return mentoringRepository.save(mentoring);
    }

    public Mentoring getMentoringById(Long id) {
        return mentoringRepository.findById(id).orElse(null);
    }

    public Mentoring updateMentoring(Long id, Mentoring mentoringDetails) {
        Mentoring mentoring = mentoringRepository.findById(id).orElse(null);

        if (mentoring != null) {
            mentoring.setTitle(mentoringDetails.getTitle());
            mentoring.setFrequencyOfEvent(mentoringDetails.getFrequencyOfEvent());
            mentoring.setDescription(mentoringDetails.getDescription());
            mentoring.setTimeline(mentoringDetails.getTimeline());

            return mentoringRepository.save(mentoring);
        }

        return null;
    }

    public void deleteMentoring(Long id) {
        mentoringRepository.deleteById(id);
    }

    public List<ProjectInitiation> getAllProjectInitiations() {
        return projectInitiationRepository.findAll();
    }

    public ProjectInitiation createProjectInitiation(ProjectInitiation projectInitiation) {
        return projectInitiationRepository.save(projectInitiation);
    }

    public ProjectInitiation getProjectInitiationById(Long id) {
        return projectInitiationRepository.findById(id).orElse(null);
    }

    public ProjectInitiation updateProjectInitiation(Long id,ProjectInitiation projectInitiationDetails) {
        ProjectInitiation projectInitiation = projectInitiationRepository.findById(id).orElse(null);

        projectInitiation.setTitle(projectInitiationDetails.getTitle());
        projectInitiation.setFrequencyOfEvent(projectInitiationDetails.getFrequencyOfEvent());
        projectInitiation.setDescription(projectInitiationDetails.getDescription());
        projectInitiation.setTimeline(projectInitiationDetails.getTimeline());

        return projectInitiationRepository.save(projectInitiation);
    }

    public void deleteProjectInitiation(Long id) {
        projectInitiationRepository.deleteById(id);
    }
    
    public List<RoomAssignment> getAllRoomAssignments() {
        return roomAssignmentRepository.findAll();
    }

    public RoomAssignment createRoomAssignment(RoomAssignment roomAssignment) {
        return roomAssignmentRepository.save(roomAssignment);
    }

    public RoomAssignment getRoomAssignmentById(Long id) {
        return roomAssignmentRepository.findById(id).orElse(null);
    }

    public RoomAssignment updateRoomAssignment(Long id,RoomAssignment roomAssignmentDetails) {
        RoomAssignment roomAssignment = roomAssignmentRepository.findById(id).orElse(null);

        roomAssignment.setFrequencyOfEvent(roomAssignmentDetails.getFrequencyOfEvent());
        roomAssignment.setTimeline(roomAssignmentDetails.getTimeline());

        return roomAssignmentRepository.save(roomAssignment);
    }

    public void deleteRoomAssignment(Long id) {
        roomAssignmentRepository.deleteById(id);
    }
    
    public List<Tutoring> getAllTutorings() {
        return tutoringRepository.findAll();
    }

    public Tutoring createTutoring(Tutoring tutoring) {
        return tutoringRepository.save(tutoring);
    }

    public Tutoring getTutoringById(Long id) {
        return tutoringRepository.findById(id).orElse(null);
    }

    public Tutoring updateTutoring(Long id,Tutoring tutoringDetails) {
        Tutoring tutoring = tutoringRepository.findById(id).orElse(null);

        tutoring.setTitle(tutoringDetails.getTitle());
        tutoring.setFrequencyOfEvent(tutoringDetails.getFrequencyOfEvent());
        tutoring.setDescription(tutoringDetails.getDescription());
        tutoring.setTimeline(tutoringDetails.getTimeline());

        return tutoringRepository.save(tutoring);
    }

    public void deleteTutoring(Long id) {
        tutoringRepository.deleteById(id);
    }

    public List<VolunteerAsBuddy> getAllVolunteerAsBuddies() {
        return volunteerAsBuddyRepository.findAll();
    }

    public VolunteerAsBuddy createVolunteerAsBuddy(VolunteerAsBuddy volunteerAsBuddy) {
        return volunteerAsBuddyRepository.save(volunteerAsBuddy);
    }

    public VolunteerAsBuddy getVolunteerAsBuddyById(Long id) {
        return volunteerAsBuddyRepository.findById(id).orElse(null);
    }

    public VolunteerAsBuddy updateVolunteerAsBuddy(Long id,VolunteerAsBuddy volunteerAsBuddyDetails) {
        VolunteerAsBuddy volunteerAsBuddy = volunteerAsBuddyRepository.findById(id).orElse(null);

        volunteerAsBuddy.setLanguage(volunteerAsBuddyDetails.getLanguage());

        return volunteerAsBuddyRepository.save(volunteerAsBuddy);
    }

    public void deleteVolunteerAsBuddy(Long id) {
        volunteerAsBuddyRepository.deleteById(id);
    }
}