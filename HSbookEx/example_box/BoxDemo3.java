class BoxDemo3 {
	public static void main(String args[]){
		Box mybox1 = new Box(); //cria um novo objeto da classe Box com nome mybox1
		Box mybox2 = new Box(); //cria um novo objeto da classe Box com nome mybox2
//Atribuir valores às variáveis de instância de mybox1
	mybox1.width = 10;
	mybox1.height = 20;
	mybox1.depth = 15;

/*Atribuir valores diferentes às variáveis
 de instância de mybox2 */
	mybox2.width = 3;
	mybox2.height = 6;
	mybox2.depth = 9;

//Exibir o volume da primeira caixa
	mybox1.volume(); //chama o método volume() em Box.

//Exibir o volume da segunda caixa
	mybox2.volume();	
	
	}

}
