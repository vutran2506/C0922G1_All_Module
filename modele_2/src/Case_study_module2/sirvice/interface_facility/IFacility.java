package Case_study_module2.sirvice.interface_facility;

import java.io.IOException;
import java.util.Map;

public interface IFacility<F,i> {
Map<F,i> getListFacility() throws IOException;

Map<F,i> getListFacilityMaintenance();

}
