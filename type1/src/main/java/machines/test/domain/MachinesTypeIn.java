package machines.test.domain;

import java.util.*;
import lombok.*;
import machines.test.domain.*;
import machines.test.infra.AbstractEvent;

@Data
@ToString
public class MachinesTypeIn extends AbstractEvent {

    private String machineType;
    private String machineName;

    public MachinesTypeIn(MachinesType aggregate) {
        super(aggregate);
    }

    public MachinesTypeIn() {
        super();
    }
}
