import java.util.ArrayList;

public class Earth_Surface {
    private ArrayList<Human_Being> OnEarth;

    public Earth_Surface(){
        this.OnEarth = new ArrayList<>();
    }

    public Earth_Surface(ArrayList<Human_Being>OnHearth){
        this.OnEarth = OnHearth;
    }

    public ArrayList<Human_Being> getOnEarth() {
        return OnEarth;
    }

    public void setOnEarth(ArrayList<Human_Being> onEarth) {
        OnEarth = onEarth;
    }

    /*
    public void add(Earth_Surface OnEarth){
        this.OnEarth.add()
    }

     */
}
