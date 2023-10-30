package Entity;

public class Etudiant {
    private int id;
    private String nom, prenom;
    private float moy;

    public Etudiant() {

    }

    public Etudiant(int id, String nom, String prenom, float moy) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.moy = moy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float getMoy() {
        return moy;
    }

    public void setMoy(float moy) {
        this.moy = moy;
    }

}