package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class SteamProcessed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String videoUrl;
    private String userid;
    private Date processDt;
}
