package gestiondepai;

/**
 * Created by brahim on 11/5/16.
 */
public class employePT extends Employe{
    private double weekpayment,prime;
    private String nom,fonction;
    private boolean workweekend;
    public employePT(String nom, String fonction, double weekpayment, boolean workweekend,double prime) {
        super(nom, fonction);
        this.weekpayment = weekpayment;
        this.prime = prime;
        this.workweekend = workweekend;
    }
    @Override
    public double calculSalaire() {

        if(this.workweekend == true){
            setSalire(this.weekpayment * 4 + prime);
            System.out.println("votre prime est " + this.prime);
        }else {
            setSalire(this.weekpayment * 4);
            System.out.println("no work at the weekend ");
        }
        return getSalire();
    }
}
