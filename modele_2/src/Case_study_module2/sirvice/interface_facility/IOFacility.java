package Case_study_module2.sirvice.interface_facility;


import java.io.IOException;
import java.util.Map;

public interface IOFacility<O,i> {
  Map<O,i> readFiles(String path) throws IOException;
  void writeFiles(String path, Map<O,i> mapList) throws IOException;

}
