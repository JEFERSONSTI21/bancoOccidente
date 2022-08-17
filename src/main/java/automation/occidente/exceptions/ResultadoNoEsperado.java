package automation.occidente.exceptions;

public class ResultadoNoEsperado extends AssertionError{
    public static final String INICIO_SESION_FALLO = "Verificar las credenciales ingresadas";
    public static final String CREAR_ROL_AUTORIZACIONES = "No fue posible crear el rol para administrar autorizaciones";
    public static final String CREAR_AUTORIZACIONES = "No fue posible crear las autorizaciones requeridas";
    public static final String CREAR_ALERTA = "No fue posible crear la alerta con la información ingresada";
    public static final String ELIMINAR_ALERTAS = "La alerta no se eliminó de forma exitosa. Validar el flujo";

    public ResultadoNoEsperado(String message) {
        super(message);
    }

    public ResultadoNoEsperado(String message, Throwable cause) {
        super(message, cause);
    }

}
