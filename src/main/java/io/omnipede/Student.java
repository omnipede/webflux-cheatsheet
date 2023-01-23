package io.omnipede;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("students")
@RequiredArgsConstructor
class Student {

    @Id
    private Long id;

    private final String name;
}
