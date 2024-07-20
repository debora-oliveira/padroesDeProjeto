package dio.gof.facade;

public class TesteFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Laura", "04765822");
    }
}
