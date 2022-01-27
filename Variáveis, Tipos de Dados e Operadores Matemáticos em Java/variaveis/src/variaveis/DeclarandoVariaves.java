package variaveis;

public class DeclarandoVariaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		// int i;
		int I; // case sensitive
		// int 1a;
		int _1a; // nao 'e uma boa pratica iniciar desse modo, porem nao da erro de compilacao
		int $aq;
		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;
		
		final int j =10;
		//j = 15; nao pode por j ser final
		int asrn246nd;
		//int asrn2345 78nd; nao pode ter espaco
		int asr_md=10; // nao e uma boa pratica
		//int asrn234%_md =10; nao pode ese tipo de sinal 
		
		asrn246nd = 100;
		asr_md= 10;
		
		int quantidadeProduto =50;
		//int QuantidadeProduto; nao comecar com letra maiscula
		final int NUMERO_TENTATIVAS =5;
		//final int numeroTenativas =5; nao e uma boa pratica para variavel final
		//int QUANTIDADE_OPCOES =25; nao e uma boa pratica pois e a declaracao para final
		int qtdProd; // nao e uma boa expressividade
		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);
		System.out.println(j);
		System.out.println(asrn246nd);
		System.out.println(asr_md);

		
		

	}

}
