package io.omnipede;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
class DemoController {

    private final StudentRepository studentRepository;

    @GetMapping("/")
    public Flux<Student> getAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Student> get(@PathVariable Long id) {
        return studentRepository.findById(id);
    }
}
