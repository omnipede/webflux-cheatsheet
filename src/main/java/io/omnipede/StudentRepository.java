package io.omnipede;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface StudentRepository extends ReactiveCrudRepository<Student, Long> {

}
