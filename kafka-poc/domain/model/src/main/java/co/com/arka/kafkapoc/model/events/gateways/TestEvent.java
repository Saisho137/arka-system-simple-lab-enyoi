package co.com.arka.kafkapoc.model.events.gateways;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TestEvent {
    private String id;
    private String message;
    private Long timestamp;
}
