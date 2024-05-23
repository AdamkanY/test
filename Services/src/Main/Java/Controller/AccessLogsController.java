import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/accesslogs")
public class AccessLogsController {

    @Autowired
    private AccessLogsRepository accessLogsRepository;

    @GetMapping
    public List<AccessLogs> getAllAccessLogs() {
        return accessLogsRepository.findAll();
    }

    @PostMapping
    public AccessLogs createAccessLog(@RequestBody AccessLogs accessLog) {
        return accessLogsRepository.save(accessLog);
    }

    @GetMapping("/{id}")
    public AccessLogs getAccessLogById(@PathVariable Long id) {
        return accessLogsRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public AccessLogs updateAccessLog(@PathVariable Long id, @RequestBody AccessLogs accessLogDetails) {
        AccessLogs accessLog = accessLogsRepository.findById(id).orElse(null);

        if (accessLog != null) {
            accessLog.setTitle(accessLogDetails.getTitle());
            accessLog.setTimeline(accessLogDetails.getTimeline());

            return accessLogsRepository.save(accessLog);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteAccessLog(@PathVariable Long id) {
        accessLogsRepository.deleteById(id);
    }
}