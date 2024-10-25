package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FileIndexded extends AbstractEvent {

    private Long id;
    private String fileid;
    private String userid;
    private String indexResult;
    private Date indexDt;

    public FileIndexded(Index aggregate) {
        super(aggregate);
    }

    public FileIndexded() {
        super();
    }
}
//>>> DDD / Domain Event
