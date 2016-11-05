package gestiondepai;


/**
 * Created by brahim on 11/5/16.
 */
public class employertp extends Employe {
    private static double workhours = 35;
    private static double salaireheur;
    private String nom,fonction;
    public employertp(String nom, String fonction , double salaireheur){
        super(nom,fonction);
        this.salaireheur =salaireheur ;
    }
    @Override
    public double calculSalaire() {
        setSalire(this.workhours * this.salaireheur);
        return getSalire();
    }
}
