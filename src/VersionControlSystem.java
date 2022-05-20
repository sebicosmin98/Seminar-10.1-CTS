import java.util.HashMap;
import java.util.Map;

public class VersionControlSystem {

    public static int fileSnapshotId = 1;

    private Map<Integer,FileSnapshot> versions = new HashMap<>();


    public FileSnapshot getFileSnapshot(String comment){

        if(versions.containsValue(comment)){

            return versions.get(comment);

        } else {

            return null;
        }
    }



    public void printSnapshots(){

        for (Map.Entry<Integer,FileSnapshot> entry : versions.entrySet()) {

            System.out.println("Id = "+entry.getKey() + ", " + entry.getValue());

        }

    }



    public void addSnapshot(FileSnapshot file){
        this.versions.put(fileSnapshotId++,file);
    }

}
