package googledrive.domain;

import googledrive.NotificationApplication;
import googledrive.domain.Notified;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notofication_table")
@Data
//<<< DDD / Aggregate Root
public class Notofication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userid;

    private String sendMsg;

    private Date sendDt;

    @PostPersist
    public void onPostPersist() {
        Notified notified = new Notified(this);
        notified.publishAfterCommit();
    }

    public static NotoficationRepository repository() {
        NotoficationRepository notoficationRepository = NotificationApplication.applicationContext.getBean(
            NotoficationRepository.class
        );
        return notoficationRepository;
    }

    //<<< Clean Arch / Port Method
    public static void notifyToUse(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Notofication notofication = new Notofication();
        repository().save(notofication);

        Notified notified = new Notified(notofication);
        notified.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(notofication->{
            
            notofication // do something
            repository().save(notofication);

            Notified notified = new Notified(notofication);
            notified.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
