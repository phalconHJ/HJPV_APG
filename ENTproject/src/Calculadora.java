import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la operacion \nNumero1     Enter\n(+ - * / ^) Enter\nNumero2     Enter");
		int N1 = sc.nextInt();
		char operador = sc.next().charAt(0);
		int N2 = sc.nextInt();

		switch (operador){
			case '+':
				int sumar = Suma(N1,N2);
				System.out.println(sumar);
				break;
			case '-':
				int restar = Resta(N1,N2);
				System.out.println(restar);	
				break;
			case '*':
				int multiplicar = Multiplicacion(N1,N2);
				System.out.println(multiplicar);	
				break;
			case '/':
				if(N2==0) {
					if (N1==0) {
						System.out.println("Infinito");
					}
					else {
						System.out.println("Indefinido");
					}
				}
				else {
					int resto;
					int num;
					int dividir = Division(N1,N2);
					num=N2*dividir;
					resto=N1-num;
					System.out.println("Cociente " + dividir + " resto " + resto);
				}
				break;
			case '^':
				int Potenciar = Potencia(N1,N2);
				System.out.println(Potenciar);
				break;
			default:
				System.out.println("ERROR");
				break;
		}
		
		sc.close();
	}

	public static int Suma(int S, int s) {
		int res=0;
		int x=S;
		int y=s;
		
		res=x+y;
		
		return res;
	}
	
	public static int Resta(int R, int r) {
		int res=0;
		int x=R;
		int y=r;
		
		res=x-y;
		
		return res;
	}
	
	public static int Multiplicacion(int M, int m) {

		int res=0;
		int x=M;
		int y=m;	
		
		while(0<y) {
			res=res+x;
			y--;
		}
		
		return res;
	}
	
	public static int Division(int D, int d) {
		int res=0;
		int x=D;
		int y=d;
		
		while(x>=y) {
				res++;
				x=x-y;
		}	
		
		return res;
	}
	
	public static int Potencia(int P, int p) {
		int res=P;
		int x=P;
		int y=p;
													//exponente				2		3			4
		while(y>1) {								//numero de vueltas		1		2			3
			y--;
			res = Multiplicacion(res,x);			//res=res*x				P*P		(P*P)*P		((P*P)*P)*P
		}
		
		return res;
	}
}
