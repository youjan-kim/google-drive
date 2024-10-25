package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SteamProcessed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String videoUrl;
    private String userid;
    private Date processDt;

    public SteamProcessed(Video aggregate) {
        super(aggregate);
    }

    public SteamProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
