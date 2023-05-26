package things;


import java.util.ArrayList;

public class PencilBag {

    private ArrayList<Pen> pens;

    public PencilBag() {
        pens = new ArrayList<>();
    }

    public ArrayList getPens()
    {
        return pens;
    }

    public void displayContains()
    {
        for(Pen pen : pens)
        {
            pen.displayInfo();
        }
    }
}
