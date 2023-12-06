package gestionzoo.entities;

public class Terrestrial {
    private int nbrLegs;

    public Terrestrial()
    {

    }

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{" +
                "nbrLegs=" + nbrLegs +
                '}';
    }
}