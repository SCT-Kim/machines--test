package machines.test.domain;

import machines.test.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "machinesTypes",
    path = "machinesTypes"
)
public interface MachinesTypeRepository
    extends PagingAndSortingRepository<MachinesType, String> {}
