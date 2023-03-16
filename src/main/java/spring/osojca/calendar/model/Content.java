package spring.osojca.calendar.model;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record Content(
                Integer id,
                @NotBlank String title,
                @NotBlank String desc,
                Status status,
                Type contentType,
                @FutureOrPresent LocalDateTime dateCreated,
                @FutureOrPresent LocalDateTime dateUpdated,
                String url) {

}
