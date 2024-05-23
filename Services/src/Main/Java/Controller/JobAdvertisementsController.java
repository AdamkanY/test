import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {

    @Autowired
    private JobAdvertisementsRepository jobAdvertisementsRepository;

    @GetMapping
    public List<JobAdvertisements> getAllJobAdvertisements() {
        return jobAdvertisementsRepository.findAll();
    }

    @PostMapping
    public JobAdvertisements createJobAdvertisement(@RequestBody JobAdvertisements jobAdvertisement) {
        return jobAdvertisementsRepository.save(jobAdvertisement);
    }

    @GetMapping("/{id}")
    public JobAdvertisements getJobAdvertisementById(@PathVariable Long id) {
        return jobAdvertisementsRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public JobAdvertisements updateJobAdvertisement(@PathVariable Long id, @RequestBody JobAdvertisements jobAdvertisementDetails) {
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

    @DeleteMapping("/{id}")
    public void deleteJobAdvertisement(@PathVariable Long id) {
        jobAdvertisementsRepository.deleteById(id);
    }
}
