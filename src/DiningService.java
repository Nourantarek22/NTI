public class DiningService implements  Service{

    @Override
    public double Getcost(){
        return 50;
    }

    @Override
    public String GetName() {
        return "Dining Service";
    }
}
