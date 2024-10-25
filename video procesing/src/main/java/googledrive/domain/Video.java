package googledrive.domain;

import googledrive.VideoProcesingApplication;
import googledrive.domain.SteamProcessed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Video_table")
@Data
//<<< DDD / Aggregate Root
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileid;

    private String videoUrl;

    private String userid;

    private Date processDt;

    @PostPersist
    public void onPostPersist() {
        SteamProcessed steamProcessed = new SteamProcessed(this);
        steamProcessed.publishAfterCommit();
    }

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoProcesingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }

    //<<< Clean Arch / Port Method
    public static void ifVideoProcessStreaming(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        SteamProcessed steamProcessed = new SteamProcessed(video);
        steamProcessed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);

            SteamProcessed steamProcessed = new SteamProcessed(video);
            steamProcessed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
