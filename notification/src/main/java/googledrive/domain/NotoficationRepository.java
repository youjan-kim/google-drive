package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "notofications",
    path = "notofications"
)
public interface NotoficationRepository
    extends PagingAndSortingRepository<Notofication, Long> {}
