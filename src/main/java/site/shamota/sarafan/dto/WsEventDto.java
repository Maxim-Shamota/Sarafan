package site.shamota.sarafan.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import site.shamota.sarafan.domain.Views;

@Data
@AllArgsConstructor
@JsonView(Views.Id.class)
@JsonAutoDetect
public class WsEventDto {
    private ObjectType objectType;
    private EventType eventType;
    @JsonRawValue
    private String body;
}
