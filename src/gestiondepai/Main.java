package gestiondepai;

/**
 * Created by brahim on 11/5/16.
 */
public class Main {
    public static void main(String[] args) {
        Employe []tabemploye = new Employe[3];
        tabemploye[0] = new Employe("Salim","pdg",500);
        tabemploye[1] = new employePT("Halima","secrètaire",20000,false,200);
        tabemploye[2] = new employertp("Salim","pdg",1500);
        for (int i = 0; i <tabemploye.length ; i++) {
            tabemploye[i].cheque();
        }
    }
}

