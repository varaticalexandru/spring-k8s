package org.alexv.norrisapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExtJokeDto {
    private List<String> categories;
    private LocalDateTime creaatedAt;
    private String icon_url;
    private String id;
    private LocalDateTime updatedAt;
    private String url;
    private String value;
}
