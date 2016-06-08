package state;

/**
 * Created by Junior on 08/06/2016.
 */
public class StatePattern {
    public static void main(String[] args){
        Context c = new Context();

        TVStart start = new TVStart();
        start.acao(c);

        System.out.println(c.getState().toString());
        System.out.println("\n");

        TVStop stop = new TVStop();
        stop.acao(c);

        System.out.println(c.getState().toString());
    }
}
