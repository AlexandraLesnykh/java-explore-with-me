package ru.practicum.comments.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@SuperBuilder
public class NewCommentDto {
    long id;

    @NotBlank
    @Size(min = 2, max = 3000)
    String content;

    LocalDateTime created;
    LocalDateTime updated;

}
