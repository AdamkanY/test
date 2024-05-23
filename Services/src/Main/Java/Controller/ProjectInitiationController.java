import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/projectInitiations")
public class ProjectInitiationController {

    @Autowired
    private ProjectInitiationRepository projectInitiationRepository;

    @GetMapping("/projectInitiations")
    public List<ProjectInitiation> getAllProjectInitiations() {
        return projectInitiationRepository.findAll();
    }

    @PostMapping("/projectInitiations")
    public ProjectInitiation createProjectInitiation(@RequestBody ProjectInitiation projectInitiation) {
        return projectInitiationRepository.save(projectInitiation);
    }

    @GetMapping("/projectInitiations/{id}")
    public ProjectInitiation getProjectInitiationById(@PathVariable Long id) {
        return projectInitiationRepository.findById(id).orElse(null);
    }

    @PutMapping("/projectInitiations/{id}")
    public ProjectInitiation updateProjectInitiation(@PathVariable Long id, @RequestBody ProjectInitiation projectInitiationDetails) {
        ProjectInitiation projectInitiation = projectInitiationRepository.findById(id).orElse(null);

        projectInitiation.setTitle(projectInitiationDetails.getTitle());
        projectInitiation.setFrequencyOfEvent(projectInitiationDetails.getFrequencyOfEvent());
        projectInitiation.setDescription(projectInitiationDetails.getDescription());
        projectInitiation.setTimeline(projectInitiationDetails.getTimeline());

        return projectInitiationRepository.save(projectInitiation);
    }

    @DeleteMapping("/projectInitiations/{id}")
    public void deleteProjectInitiation(@PathVariable Long id) {
        projectInitiationRepository.deleteById(id);
    }
}
