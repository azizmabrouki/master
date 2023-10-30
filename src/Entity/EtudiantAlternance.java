package Entity;

public class EtudiantAlternance extends Etudiant {
    private int salaire;

    public EtudiantAlternance() {

    }

    public EtudiantAlternance(int id, String nom, String prenom, float moy, int salaire) {
        super(id, nom, prenom, moy);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }


    @Override
    public void ajouterUneAbsence() {

        int nouveauSalaire = getSalaire() - 50;


        if (nouveauSalaire < 0) {
            setSalaire(0);
        } else {
            setSalaire(nouveauSalaire);
        }
    }


}