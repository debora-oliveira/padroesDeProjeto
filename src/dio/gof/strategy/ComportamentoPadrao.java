package dio.gof.strategy;

public class ComportamentoPadrao implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Robo usando movimento padrão");
    }
}
