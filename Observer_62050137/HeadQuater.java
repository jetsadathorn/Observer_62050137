import java.util.ArrayList;

public class HeadQuater implements Source{
    private final ArrayList<MyObserver> list;
    private int Thai, UAE;

    public HeadQuater() {
        this.list = new ArrayList<MyObserver>();
    }
    public void setSomeData(int Thai, int UAE) {
    this.Thai = Thai;
    this.UAE = UAE;
	notifyObservers();
    }

    public int getScoreThai() {
	return Thai;
    }
    public int getScoreUAE(){
    return UAE;
    }

    @Override
    public void register (MyObserver observer) {
        list.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	}
    }
}
