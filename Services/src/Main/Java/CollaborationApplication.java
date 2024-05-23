@SpringBootApplication
@RestController
@Hidden // Hide this controller from the Swagger UI
public class CollaborationApplication {

	@Autowired
	private CollaborationsList collaborationsList;

	public static void main(String[] args) {
		SpringApplication.run(CollaborationApplication.class, args);
	}
	@PostConstruct
	private void initPlaceholderData() throws Exception {
	AccessLogs access = new AccessLogs();
	access.getTitle("Tutoring_Programming_Michael");
    access.getTimeline("04/03/2024 - 30/03/2024,10:00 am - 01:00 pm,Every Monday");
    collaborationsList.createAccessLog(access);

    ForumManagement forum = new ForumManagement();
    forum.setForumPost("How was the assignment 2 of the module Programming structured?");
    collaborationsList.createForumPost(forum);

    JobAdvertisements job = new JobAdvertisments();
    job.setRole("IT techniain");
    job.setRequirements("Experience of 2 years in a similar field");
    job.setApplicationProcess("Send your CV to us per mail to mike@ITsupport.ch");
    job.setDeadline("31/06/2024");
    collaborationsList.createJobAdvertisement(job);

    Mentoring mentoring = new Mentoring();
    mentoring.setTitle("Mentoring for CV preparations");
    mentoring.FrequencyOfEvent("1");
    mentoring.setDescription("Preparation of CV and representation of yourself is explained");
    mentoring.setTimeline("25/02/2024 - 30/02/2024,05:00 pm - 06:00 pm,Every Tuesday");
    collaborationsList.createMentoring(mentoring);

    ProjectInitiation project = new ProjectInitiation();
    project.setTitle("Project for Database Assignment 1");
    project.FrequencyOfEvent("0");
    project.setDescription("Class 4b looks for students to support their project");
    project.setTimeline("15/05/2024 - 15/06/2024,Meeting on Wednesdays");
    collaborationsList.createProjectInitiation(project);

    RoomAssignment room = new RoomAssignment();
    room.FrequencyOfEvent("1");
    room.setTimeline("20/08/2024 - 20/08/2024,01:00 pm - 05:00 pm,Thursday");
    collaborationsList.createRoomAssignment(room);

    Tutoring tutor = new Tutoring();
    tutor.setTitle("Tutoring for Corporate Finance and Controlling");
    tutor.FrequencyOfEvent("1");
    tutor.setDescription("Support on every topic is provided");
    tutor.setTimeline("01/10/2024 - 01/11/2024,08:00 am - 12:00 am,Meeting on Wednesdays");
    collaborationsList.createTutoring(tutor);

    VolunteerAsBuddy volunteer = new VolunteerAsBuddy();
    volunteer.setLanguage("English,German, and French");
    collaborationsList.createVolunteerAsBuddy(volunteer);