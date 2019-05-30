package practica6;

public class Coche {
	private static final String COCHE_MATRICULA = "El coche con matricula ";
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	public String metodo1()
	{
		String resultado = "";
		
		switch (combustible)
		{
		case "Gasolina":
			resultado += cocheMatricula() + metodoA(modelo, fabricante);
			break;
			
		case "Diesel":
			resultado += cocheMatricula() + metodoB(modelo, fabricante);
			break;
			
		case "Híbrido":
			resultado += cocheMatricula() + metodoC(modelo, fabricante);
			break;
			
		default:
			resultado += cocheMatricula() + " no dispone de información";
			break;
		}
		return resultado;
	}
	
	private String cocheMatricula() {
		return COCHE_MATRICULA + matricula + " ";
	}

}
