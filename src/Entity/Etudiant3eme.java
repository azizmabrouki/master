package Entity;

public class Etudiant3eme extends Etudiant {
    private String branche;

    public Etudiant3eme() {

    }

    public Etudiant3eme(int id, String nom, String prenom, float moy, String branche) {
        super(id, nom, prenom, moy);
        this.branche = branche;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }


    public void ajouterUneAbsence() {




        if (getMoy() < 0) {
            setMoy(0);
        } else
            setMoy(getMoy() - 0.5f);

    }




}