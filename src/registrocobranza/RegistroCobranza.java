
package registrocobranza;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RegistroCobranza {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bienvenido, introduzca sus datos personales:\n");
        System.out.print("\nIntroduce el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Introduce la direccion: ");
        String direccion = scanner.nextLine();
        
        System.out.print("Introduce el DNI: ");
        String dni = scanner.nextLine();
        
        System.out.print("Introduce el telefono: ");
        String telefono = scanner.nextLine();
        
        Persona persona = new Persona(nombre, direccion, dni, telefono);
        
        System.out.println("\nInformacion de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Direccion: " + persona.getDireccion());
        System.out.println("DNI: " + persona.getDni());
        System.out.println("Telefono: " + persona.getTelefono());

        System.out.print("\nIntroduzca sus datos de gestor:\n");

        System.out.print("Introduce el ID del gestor: ");
        String idGestor = scanner.nextLine();
        
        Gestor gestor = new Gestor(nombre, direccion, dni, telefono, idGestor);
        
        System.out.println("\nInformacion del gestor:");
        System.out.println("ID del gestor: " + gestor.getIdGestor());
        
        System.out.println("\nGenerando informe...");
        String informe = gestor.generarInformes();
        System.out.println("Informe generado: " + informe);
        
        System.out.println("\nIntroduce los datos de un deudor:");
        System.out.print("ID del deudor: ");
        String idDeudor = scanner.nextLine();
        System.out.print("Nombre del deudor: ");
        String nombreDeudor = scanner.nextLine();
        

        Deudor deudor = new Deudor(nombre, direccion, dni, telefono, idDeudor, nombreDeudor);
        System.out.println("\nInformacion del deudor:");
        System.out.println("ID del deudor: " + deudor.getIdDeudor());
        System.out.println("Nombre del deudor: " + deudor.getNombreDeudor());
        
        System.out.println("\nIntroduce los datos de la deuda:");
        System.out.print("ID de la deuda: ");
        String idDeuda = scanner.nextLine();

        System.out.print("Fecha de inicio de la deuda (dd/mm/yyyy): ");
        String fechaInicioStr = scanner.nextLine();
        Date fechaInicio = null;
        try {
            fechaInicio = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInicioStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Monto de la deuda: ");
        double monto = scanner.nextDouble();
        scanner.nextLine(); 

        Deuda deuda = new Deuda(idDeuda, fechaInicio, monto);
        System.out.println("\nInformacion de la deuda:");
        System.out.println("ID de la deuda: " + deuda.getIdDeuda());
        System.out.println("Fecha de inicio de la deuda: " + deuda.getFechaInicio());
        System.out.println("Monto de la deuda: " + deuda.getMonto());

        System.out.println("\nIntroduce los datos del pago:");
        System.out.print("Codigo de pago: ");
        int codigoPago = scanner.nextInt();

        System.out.print("Monto pagado: ");
        double montoPagado = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Fecha de pago (dd/mm/yyyy): ");
        String fechaPagoStr = scanner.nextLine();
        Date fechaPago = null;
        try {
            fechaPago = new SimpleDateFormat("dd/MM/yyyy").parse(fechaPagoStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Pago pago = new Pago(codigoPago, montoPagado, fechaPago);
        System.out.println("\nInformacion del pago:");
        System.out.println("Codigo de pago: " + pago.getCodigoPago());
        System.out.println("Monto pagado: " + pago.getMontoPagado());
        System.out.println("Fecha de pago: " + pago.getFechaPago());
        boolean esPagoValido = pago.comprobarPago();
        System.out.println("¿Es valido el pago? " + esPagoValido);

        String comprobante = pago.emitirComprobante();
        System.out.println("Comprobante emitido: " + comprobante);
        
        System.out.println("\nIntroduce los datos de la llamada al deudor:");
        System.out.print("Fecha de la llamada (dd/mm/yyyy): ");
        String fechaLlamadaStr = scanner.nextLine();
        Date fechaLlamada = null;
        try {
            fechaLlamada = new SimpleDateFormat("dd/MM/yyyy").parse(fechaLlamadaStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("¿Hubo respuesta a la llamada? (true/false): ");
        boolean respuesta = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Numero total de llamadas: ");
        int numLlamadasTotal = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Motivo de la llamada: ");
        String motivo = scanner.nextLine();

        Llamada llamada = new Llamada(fechaLlamada, respuesta, numLlamadasTotal, motivo);
        System.out.println("Informacion de la llamada:");
        System.out.println("Fecha de la llamada: " + llamada.getFechaLlamada());
        System.out.println("¿Hubo respuesta? " + llamada.getRespuesta());
        System.out.println("Numero total de llamadas: " + llamada.getNumLlamadasTotal());
        System.out.println("Motivo de la llamada: " + llamada.getMotivo());

        String mensajeRegistro = llamada.registrarLlamada();
        System.out.println("Mensaje de registro: " + mensajeRegistro);

        boolean respuestaValida = llamada.validarRespuesta();
        System.out.println("¿La respuesta es valida? " + respuestaValida);
        
        System.out.println("\nIntroduce los datos del compromiso de pago del deudor:");
        
        System.out.print("¿Los plazos son distintos? (true/false): ");
        boolean distintosPlazos = scanner.nextBoolean();
        scanner.nextLine(); 

        CompromisoDePago compromiso = new CompromisoDePago(distintosPlazos);
        System.out.println("¿Plazos distintos? " + compromiso.isDistintosPlazos());

        System.out.print("¿Deseas registrar fechas de compromiso? (true/false): ");
        boolean registrarFechas = scanner.nextBoolean();
        scanner.nextLine(); 

        if (registrarFechas) {
            System.out.print("Introduce el numero de fechas de compromiso: ");
            int numFechas = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numFechas; i++) {
                System.out.print("Introduce la fecha de compromiso (dd/mm/yyyy): ");
                String fechaCompromisoStr = scanner.nextLine();
                Date fechaCompromiso = null;
                try {
                    fechaCompromiso = new SimpleDateFormat("dd/MM/yyyy").parse(fechaCompromisoStr);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                compromiso.registrarFechas(fechaCompromiso);
            }

            compromiso.imprimirFechasCompromiso();
        }

        
        ListaDeudores listaDeudores = new ListaDeudores();

        System.out.println(listaDeudores.obtenerLista());

        scanner.close();
    }
}

