package googledrive.domain;

import googledrive.IndexerApplication;
import googledrive.domain.FileIndexded;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Index_table")
@Data
//<<< DDD / Aggregate Root
public class Index {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileid;

    private String userid;

    private String indexResult;

    private Date indexDt;

    @PostPersist
    public void onPostPersist() {
        FileIndexded fileIndexded = new FileIndexded(this);
        fileIndexded.publishAfterCommit();
    }

    public static IndexRepository repository() {
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(
            IndexRepository.class
        );
        return indexRepository;
    }

    //<<< Clean Arch / Port Method
    public static void startIndex(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        FileIndexded fileIndexded = new FileIndexded(index);
        fileIndexded.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);

            FileIndexded fileIndexded = new FileIndexded(index);
            fileIndexded.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
