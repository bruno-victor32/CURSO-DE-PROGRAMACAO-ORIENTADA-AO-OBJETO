package UltraEmojiCombat;
public class UltraEmojiCombat {
	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];//Trabalhando como um vetor, no lugar de trabalhar "l" como um novo Lutador, nesse caso eu vou dizer que o "l" e um novo vetor de 6 posições que vai da posição 0 ate a posição 5 e cada um deles vai ser um objeto de lutador e cada um deles vai ter as informações que vão ser passadas para construtor
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);//Si eu chamar o construtor sem parametro vai dar erro,porque meu construtor tem que passar alguns parametros
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		//l[3].perderLuta();
		//l[3].status();
		
		Luta UEC01 = new Luta(); //Criando um objeto UEC01 que e da classe Luta
		UEC01.marcarLuta(l[4], l[5]);
		UEC01.lutar();
		//l[0].status();
		//l[1].status();
		
	}
}
