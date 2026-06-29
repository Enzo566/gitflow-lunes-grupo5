public class Saludo {
    public String generarSaludo(String nombre) {
        if (nombre == null || nombre.isEmpty() ) {
            return "Hola Mundo";
        }
        return "Hola, " + nombre ;
    }
}