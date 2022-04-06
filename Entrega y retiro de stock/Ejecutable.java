public class Ejecutable extends Entregable {


	public static void main(String[] args) {
		

		int  x = 0;
		int  y = 0;
		int  a = 0, aV = 0;
		int  b = 0,  bV = 0;
		int  mayorS = 0, mayorV = 0;
		String tituloS = null, tituloV= null, generoS = null, generoV = null, creadorS = null, creadorV = null;
		boolean entregadoS = false, entregadoV = false;
		int nums = 0; 
		int numv = 0;

		
		//Ejercicios 1 y 2, pag 2
		 Serie[] serie= new Serie[5];
				
		 serie[0] = new Serie("Adam Sandler 3", 3, "Terror", "Adam Sandler", false);
		 serie[1] = new Serie("Los Simpsons", 32, "Comedia", "Matt Groening", false);
		 serie[2] = new Serie("Titanic La Serie", 4,"Comedia","Martin Scorsese", false);
		 serie[3] = new Serie("Star Wars XXVI", 26, "Policial", "Quentin Tarantino", false);
		 serie[4] = new Serie("Mi Pobre Angelita", "Woody Allen");
		 
		 Videojuego[] videojuego= new Videojuego[5];
		 
		 videojuego[0] = new Videojuego("Sonic", 16, "Plataforma", "Sega", false);
		 videojuego[1] = new Videojuego("Mario Bross", 20, "Plataforma", "Nintendo", false);
		 videojuego[2] = new Videojuego("Half life 3", 26, "Accion FPS", "Valve", false);
		 videojuego[3] = new Videojuego("Fortnite", 0, "Battle Royale", "Epic Games", false);
		 videojuego[4] = new Videojuego("GTA VI", 15);
		 
		 
		 
		//Ejercicio 3, pag 2 -> Entrego algunas series y videojuegos
		 videojuego[1].entregar();
		 videojuego[3].entregar();
		 serie[0].entregar();
		 serie[2].entregar();
		 serie[3].entregar();
		 
		 //Chequeo que en este caso serie[0] este entregado.
		 System.out.println(serie[0].titulo + " esta entregado?: " +serie[0].estaEntregado()+ "\n");
		 
		 //Ejercicio 4, pag 2 -> Contar series y videojuegos e ir devolviendolos.
		 //Quise hacer un m�todo y poner serie o videojuego pero no me dejaba 
		 while(x < serie.length){
		 		if (serie[x].entregado == true) {
		 			nums++;
		 			serie[x].devolver();
		 		}
		 		x++;	
		 	}
		 while(y < videojuego.length){
		 		if (videojuego[y].entregado == true) {
		 			numv++;
		 			videojuego[y].devolver();
		 		}
		 		y++;	
		 	}
		 System.out.println("La cantidad de series entregadas fueron: " +nums);
		 System.out.println("La cantidad de videojuegos entregados fueron: " +numv+ "\n"); 
		 
		 // Chequea nuevamente si serie[0] esta entregado para mostrar que se uso la funcion devolver.
		 System.out.println(serie[0].titulo + " esta entregado?: " +serie[0].estaEntregado()+"\n");
		 
		 
		 //Comparo dos videjuegos y dos series para chequear si son iguales;		 
		 System.out.println("Comparacion de Series y Videojuegos (Las series son distintas y los videojuegos son iguales)" +"\n");
		 System.out.println(serie[3].toString());
		 System.out.println(serie[0].toString());
		 System.out.println("Comparo si " + serie[3].titulo + " y " +serie[0].titulo+ " son iguales: " +serie[3].equalsSerie(serie[0])+ "\n");
		 System.out.println(videojuego[1].toString());
		 System.out.println("Comparo si " + videojuego[1].titulo+ " y " +videojuego[1].titulo+ " son iguales: " +videojuego[1].equalsVideojuego(videojuego[1]) + "\n");
		 
		 
		 //Indica serie y videojuego con mas temporadas y horas respectivamente. Me romp� la cabeza tratando de hacer esto:
		 for(a = 0; a != serie.length; a++) {
			 if(serie[b].getTemp() > mayorS) {
				 mayorS = serie[b].getTemp();     		// Mi idea era crear un objeto Serie y Videojuego con los atributos de la serie[b] y videojuego[bV] dentro de cada IF, pero por alguna raz�n no me dejaba
				 tituloS = serie[b].getTitulo();		// Lo solucione utilizando todos los gets por separado, no es lo mejor pero hace el trabajo y de paso compruebo que anden los GETS
				 generoS = serie[b].getGenero();
				 creadorS = serie[b].getCreador();
				 entregadoS = serie[b].estaEntregado();
			 
			 }
			 b++;
		 }
		 for(aV = 0; aV != videojuego.length; aV++) {
			 if(videojuego[bV].getHoras() > mayorV) {
				 mayorV = videojuego[bV].getHoras();     		
				 tituloV = videojuego[bV].getTitulo();		
				 generoV = videojuego[bV].getGenero();
				 creadorV = videojuego[bV].getCreador();
				 entregadoV = videojuego[bV].estaEntregado(); 
			 }
			 bV++;
		 }
		 
		 System.out.println("Titulo de la serie con mas temporadas: " +tituloS+ "\n"+"Genero: " + generoS+ "\n"+ "Creador: " + creadorS+ "\n" + "Cantidad de temporadas: "+ mayorS +"\n"+"Esta entregado?: "+ entregadoS+"\n");
		 System.out.println("Titulo del videojuego con mas horas: " +tituloV+ "\n"+"Genero: " + generoV+ "\n"+ "Creador: " + creadorV+ "\n" + "Cantidad de horas: "+ mayorV +"\n"+"Esta entregado?: "+ entregadoV);
	}	
}