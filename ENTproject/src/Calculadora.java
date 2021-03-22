import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca dos numeros");
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();

		System.out.println("Que quieres Hacer? 1)Sumarlos 2)Restarlos 3)Multiplicarlos 4)Dividirlos ");
		int selector = sc.nextInt();
		sc.close();
		switch (selector) {
			case 1:
				int sumar = Suma(N1,N2);
				System.out.println(sumar);
				break;
			case 2:
				int restar = Resta(N1,N2);
				System.out.println(restar);	
				break;
			case 3:
				int multiplicar = Multiplicacion(N1,N2);
				System.out.println(multiplicar);	
				break;
			case 4:
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
		}
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
		int cont= 0;
		int x=M;
		int y=m;	
		
		while(cont<y) {
			res=res+x;
			cont++;
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
	
}
