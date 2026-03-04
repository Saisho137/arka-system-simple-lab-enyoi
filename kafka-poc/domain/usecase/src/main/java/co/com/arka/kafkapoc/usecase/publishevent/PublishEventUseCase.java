package co.com.arka.kafkapoc.usecase.publishevent;

import co.com.arka.kafkapoc.model.events.gateways.EventsGateway;
import co.com.arka.kafkapoc.model.events.gateways.TestEvent;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RequiredArgsConstructor
public class PublishEventUseCase {
    private final EventsGateway eventsGateway;

    public Mono<TestEvent> publish(String message) {
        TestEvent event = TestEvent.builder()
                .id(UUID.randomUUID().toString())
                .message(message)
                .timestamp(System.currentTimeMillis())
                .build();
        return eventsGateway.emit(event)
                .thenReturn(event);
    }
}
