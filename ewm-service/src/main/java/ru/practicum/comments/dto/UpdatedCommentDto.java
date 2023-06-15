package ru.practicum.comments.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.event.dto.EventShortDto;
import ru.practicum.user.dto.UserShortDto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
public class UpdatedCommentDto {
    
    long id;

    @NotBlank @Size(min = 2, max = 3000) String content;

    LocalDateTime updated;

    UserShortDto user;

    EventShortDto event;
}
