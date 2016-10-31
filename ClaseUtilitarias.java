// Lectura de Datos
// Utilizando System.in.read()

public static char leerCaracter(){
		char caracterIngresado = 0;
		System.out.println("Ingrese un caracter: ");
		try {
			caracterIngresado = (char)System.in.read();
			System.out.println("Caracteer Ingresado" + caracterIngresado);
			
		} catch (Exception e) {
			System.err.println("Error en la lectura" + e.getMessage());
			e.printStackTrace();
		}
		return caracterIngresado;
	}

// Utilizando BufferedReader

public static String leerLinea(){
		String linea = null;
		try {
			// Formacion de lector básico utilizando la consola estandar
			InputStreamReader lectorBasico = new InputStreamReader(System.in);
			
			//Formación de un lector basado en el lector básico
			BufferedReader lectorLinea = new BufferedReader(lectorBasico);
			System.out.println("Ingrese su nombre:");
			linea = lectorLinea.readLine();
			
		} catch (IOException e) {
			System.err.println("Error lectura: " + e.getMessage());
			e.printStackTrace();
		}
		return linea;
	}

// Utilizando la clase Scanner
	public static String leerLineaScanner(){
		String linea = null;
		Scanner lectorScanner = new Scanner(System.in);
		linea = lectorScanner.nextLine();
		return linea;
	}
// Descomposicion de texto con la Clase Scanner
public static List<String> parsearCadena(String cadena, String Delimitador){
		List<String> cadenas = new ArrayList<String>();
		Scanner parseador = new Scanner(cadena);
		parseador.useDelimiter(Delimitador);
		while(parseador.hasNext()){
			String cadPar = parseador.next();
			System.out.println("Token:" + cadPar);
		};
		return cadenas;
	}
