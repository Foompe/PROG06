package com.prog06_Ejerc1_util;

public class DNIespanol {
    //Definimos los atributos
    private int numDNI;

    //Letras del DNI conocido como modulo 23
    private static final String LETRAS_DNI= "TRWAGMYFPDXBNJZSQVHLCKE";


    //metodo para calcular la letra del DNI
    private static char calcularLetraNIF (int dni) {

        char letra;

        //calculo de la letra NIF
        letra= LETRAS_DNI.charAt(dni % 23);

        return letra;
    }

    //metodo para extrar la letra del NIF
    private static char extraerLetraNIF (String nif) {
        char letra = nif.charAt(nif.length()-1);
        return letra;
    }

    //metodo para extraer los numeros del NIF
    private static int extraerNumeroNIF (String nif) {
        int numero= Integer.parseInt(nif.substring(0, nif.length()-1));
        return numero;
    }

    //metodo para comprobar la valided del NIF
    private static boolean validarNIF (String nif) {
        boolean valido = true; //suponemos que es valido mientras no se encuentre algun fallo
        char letra_calculada;
        char letra_leida;
        int dni_leido;

        //comprobamos que el parametro contiene información
        if (nif == null) { //El parametro debe ser un objeto no vacio
            valido = false;
        } else if (nif.length()<8 || nif.length()>9) {  //la cadeba debe estar entre 8 y 9 caracteres
            valido = false;
        } else {
            letra_leida = DNIespanol.extraerLetraNIF(nif); //Extraemos la letra del NIF
            dni_leido = DNIespanol.extraerNumeroNIF(nif);  //Extraemos el numero de DNI
            letra_calculada = DNIespanol.calcularLetraNIF(dni_leido); //calculamos la letra de NIF a partir del nuemro extraido
            if (letra_leida == letra_calculada) { //Comparamos la letra extraida con la calculada
                valido = true; //Si todas las comprobaciones son validas el dni sera valido
            } else {
                valido = false;
            }
        }
        return valido;
    }


    //Definimos los metodos
    //metodo que nos devuelve el numero del DNI
    public int obtenerDNI() {
        return numDNI;
    }

    //metodo que nos devuelve el NIF completo: numero + letra
    public String obtenerNIF() {
        //variables locales
        String cadenaNIF; //NIF con letra para devolver
        char letraNIF;    //Letra del numero del NIF calculado

        //calculo de la letra del NIF
        letraNIF = DNIespanol.calcularLetraNIF(numDNI);

        //Construccion de la cadena del DNI: numero + letra
        cadenaNIF= Integer.toString(numDNI) + String.valueOf(letraNIF);

        //devolucion del resultado
        return cadenaNIF;
    }

    //metodos para manejar excepciones  y lanzar mensaje de error
    public void establecer (String nif) throws Exception {
        if (validarNIF(nif)) {  //Si el valor es valido lo almacenamos
            this.numDNI = DNIespanol.extraerNumeroNIF(nif);
        } else {                //Si el valor no es valido lanzamos una excepción
            throw new Exception("NIF inválido: " + nif);
        }
    }

    //metodo para comprobar el rango de numeros del dni
    public void establecer (int dni) throws Exception {
        //comprobamos rangos
        if (dni>999999 && dni<99999999) {
            this.numDNI = dni; //almacenamos ya que es un valor correcto
        } else {
            throw new Exception("DNI inválido: " + String.valueOf(dni));
        }
    }
}
