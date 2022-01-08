package Aula12;
public class Aula12 {
	public static void main(String[] args) {
		//Animal n = new Animal(); Classe animal e abstrato e não pode instanciar
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara e = new Arara();
		
		c.locomover();
		k.locomover();
		
		c.emitirSom();
		k.emitirSom();
		//Um metodo pode ter o mesmo nome, ou seja, o mesmo metodo
		//so que eles vao ter polimorfismo,eles vao ter outras maneiras de fazer
		
		/*m.setPeso(35.6f);
		m.setcorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();*/
		
		/*a.locomover();
		p.locomover();
		r.locomover();
		Eu consigo chamar os metodos e esses metodos vão se comportando de formas diferentes
		os nomes "locomover" foi sempre o mesmo e a resposta era diferente,isso e polimorfismo*/
	}

}
