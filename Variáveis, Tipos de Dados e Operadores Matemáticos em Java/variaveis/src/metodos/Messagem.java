package metodos;

public class Messagem {
	public static void obterMensagem (int hora) {
		switch (hora) {
		case 5: 
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			mensagemBomDia();
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			mensagemBoaTarde();
			break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
			mensagemBoaNoite();
			break;
		default:
			System.out.println("Hora Invalida");
			break;
			
		}
	}

	private static void mensagemBoaNoite() {
		// TODO Auto-generated method stub
		System.out.println("Boa Noite");
	}

	private static void mensagemBoaTarde() {
		// TODO Auto-generated method stub
		System.out.println("Boa Tarde");
	}

	private static void mensagemBomDia() {
		// TODO Auto-generated method stub
		System.out.println("Bom dia");
		
	}

}
