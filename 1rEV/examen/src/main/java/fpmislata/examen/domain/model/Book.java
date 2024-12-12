package fpmislata.examen.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    private Long id;
    private String isbn;
    private String title;
}
