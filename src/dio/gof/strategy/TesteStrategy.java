package dio.gof.strategy;

public class TesteStrategy {
    public static void main(String[] args) {
        ComportamentoPadrao padrao = new ComportamentoPadrao();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo= new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(padrao);
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
    }
}
