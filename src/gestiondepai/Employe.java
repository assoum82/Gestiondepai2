package gestiondepai;

/**
 * Created by brahim on 11/5/16.
 */
public class Employe {
    private double salaire;
    private String nom,fonction;
    public Employe(String nom, String fonction, double salaire){
        this.nom = nom;
        this.fonction = fonction;
        this.salaire = salaire;
    }
    public Employe(String nom, String fonction){
        this.nom = nom;
        this.fonction = fonction;
    }

    public double getSalire() {
        return salaire;
    }

    public void setSalire(double salire) {
        this.salaire = salire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public double calculSalaire() {
        return salaire;
    }

    public void cheque() {
        System.out.println(this.nom + "||" + this.fonction +"||"+calculSalaire()+ " DA");
    }
}
