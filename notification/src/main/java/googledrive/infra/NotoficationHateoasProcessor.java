package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class NotoficationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Notofication>> {

    @Override
    public EntityModel<Notofication> process(EntityModel<Notofication> model) {
        return model;
    }
}
