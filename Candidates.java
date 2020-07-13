import org.decimal4j.util.DoubleRounder;

public class Candidates {

    public static void main(String[] args) {
       Candidate m = new Candidate(1);
       Candidate n = new Candidate(3);

       double percentM = (double) m.getM()/(m.getM() + n.getM()) * 100;
       double percentN = (double) n.getM()/(m.getM() + n.getM()) * 100;

       if(percentM > percentN){
           System.out.println("Winner is M with: " + DoubleRounder.round((percentM - percentN), 4) + "%");
       }else if(percentN > percentM){
           System.out.println("Winner is N with: " + DoubleRounder.round((percentN - percentM), 4) + "%");
       }else
           System.out.println("draw");
    }

}
