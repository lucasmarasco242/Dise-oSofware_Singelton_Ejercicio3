import java.time.LocalTime;

public class Logger {
    private static Logger instancia;

    private Logger() {
    }

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void registrar(String nivel, String mensaje) {
        LocalTime hora = LocalTime.now();
        System.out.println("[" + hora + "] [" + nivel + "] " + mensaje);
    }
}