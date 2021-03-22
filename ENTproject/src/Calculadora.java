import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String salir = "s";
		
		while(salir.equals("s")) {
			
			System.out.println("Introduzca la operacion \nNumero1     Enter\n(+ - * / ^) Enter\nNumero2     Enter");
			int N1 = sc.nextInt();
			char operador = sc.next().charAt(0);
			int N2 = sc.nextInt();

			
			switch (operador){
				case '+':
					int sumar = Suma(N1,N2);
					System.out.println("Suma: " + N1 + " + " + N2 + " = " + sumar);
					break;
				case '-':
					int restar = Resta(N1,N2);
					System.out.println("Resta: " + N1 + " - " + N2 + " = " + restar);	
					break;
				case '*':
					int multiplicar = Multiplicacion(N1,N2);
					System.out.println("Multiplicación: " + N1 + " x " + N2 + " = " + multiplicar);	
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
						System.out.println("División: Cociente " + dividir + " resto " + resto);
					}
					break;
				case '^':
					int Potenciar = Potencia(N1,N2);
					System.out.println(Potenciar);
					break;
				default:
					System.out.println("ERROR");
					break;
					
			} // switch
			
			System.out.println("¿Desea continuar?[s/n]");
			salir = sc.next();
			if(salir.equals("n")) break;
			
		} // while
		
		System.out.println("**SALIÓ DEL PROGRAMA**");
		
		
		
		sc.close();
	} // main

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
													
		while(y>1) {								
			y--;
			res = Multiplicacion(res,x);			
		}
		
		return res;
	}
}
