package exercicio;

import java.util.Scanner;

public class Test {

	Scanner scan = new Scanner(System.in);

	Pontos pontos = new Pontos();
	DistanciaEucli distanciaEucli = new DistanciaEucli();
	public void t() {

		System.out.println("Informe a coordenada X1");
		pontos.setX1(scan.nextDouble());

		System.out.println("Informe a coordenada y1");
		pontos.setY1(scan.nextDouble());

		System.out.println("Informe a coordenada X2");
		pontos.setX2(scan.nextDouble());

		System.out.println("Informe a coordenada y2");
		pontos.setY2(scan.nextDouble());

		double distanciaX = pontos.getDx();
		double distanciaY = pontos.getDy();
		double d = distanciaEucli.distanciaEuclidiana(distanciaX, distanciaY);
		
		System.out.println("Distância entre os pontos ("+pontos.getX1()+"  "+
				pontos.getY1()+"  "+
				"e"+"  "+
				pontos.getX2()+"  "+
				pontos.getY2()+")" +
				"  "+
				d);
	}
}
