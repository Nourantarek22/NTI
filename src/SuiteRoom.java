import java.util.List;

public class SuiteRoom extends Room {


    public SuiteRoom(String roomnumber, double baserate) {
        super(roomnumber, baserate);
    }
    @Override
    public String getDescription() {
        return "Suite Room";
    }

}
