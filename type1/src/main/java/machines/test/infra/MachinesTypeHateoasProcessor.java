package machines.test.infra;

import machines.test.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MachinesTypeHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MachinesType>> {

    @Override
    public EntityModel<MachinesType> process(EntityModel<MachinesType> model) {
        return model;
    }
}
