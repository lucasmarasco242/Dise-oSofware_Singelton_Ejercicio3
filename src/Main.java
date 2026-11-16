//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstancia();
        Logger log2 = Logger.getInstancia();

        System.out.println("¿Es la misma instancia?: " + (log1 == log2));

        log1.registrar("INFO", "Aplicación iniciada correctamente.");
        log1.registrar("WARNING", "Uso de memoria elevado.");
        log2.registrar("ERROR", "No se pudo conectar a la base de datos.");
    }
}