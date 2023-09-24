package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import java.util.Collections;
@RestController
@RequestMapping("/servers")
public class ServerController {

    @Autowired
    private ServerRepository repository;

    @GetMapping
    public List<Server> getAllServers(@RequestParam(required = false) String id, @RequestParam(required = false) String name) {
        if (id != null) {
            Optional<Server> server = repository.findById(id);
            return server.map(List::of).orElseGet(List::of);
        }
        if (name != null) {
            return repository.findByNameContaining(name);
        }

        return repository.findAll();

    }

    @PutMapping
    public Server createServer(@RequestBody Server server) {
        System.out.println("Received PUT request to create a server");
        System.out.println(server);
        return repository.save(server);
    }

    @DeleteMapping("/{id}")
    public void deleteServer(@PathVariable String id) {
        repository.deleteById(id);
    }
}
