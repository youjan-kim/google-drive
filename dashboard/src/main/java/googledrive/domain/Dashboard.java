package googledrive.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "Dashboard_table")
@Data
public class Dashboard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String fileId;
    private String fileSize;
    private String fileName;
    private String indexYn;
    private String uploadYn;
    private String videoUrl;
    private Date updateDt;
    private String uploadUser;
    private String fileId;
    private String fileSize;
    private String fileName;
    private String indexYn;
    private String uploadYn;
    private String videoUrl;
    private Date updateDt;
    private String uploadId;
}
