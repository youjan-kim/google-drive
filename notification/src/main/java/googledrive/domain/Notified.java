package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Notified extends AbstractEvent {

    private Long id;

    public Notified(Notofication aggregate) {
        super(aggregate);
    }

    public Notified() {
        super();
    }
}
//>>> DDD / Domain Event
