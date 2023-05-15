package machines.test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import machines.test.Type1Application;
import machines.test.domain.MachinesTypeIn;

@Entity
@Table(name = "MachinesType_table")
@Data
public class MachinesType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String machineType;

    private String machineName;

    @PostPersist
    public void onPostPersist() {
        MachinesTypeIn machinesTypeIn = new MachinesTypeIn(this);
        machinesTypeIn.publishAfterCommit();
    }

    public static MachinesTypeRepository repository() {
        MachinesTypeRepository machinesTypeRepository = Type1Application.applicationContext.getBean(
            MachinesTypeRepository.class
        );
        return machinesTypeRepository;
    }
}
