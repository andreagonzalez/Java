/*Exemplo cap.6 pg 110*/

class Box{
//declaração variáveis (atributos)
	double width;
	double height;
	double depth;

/*Usado no exemplo BoxDemo3

//Exibir o volume de uma caixa
void volume(){
	System.out.print("O volume é: " );
	System.out.println(width * height * depth);
}

*/


//calcular e retornar o volume
double volume(){
	return width * height * depth;
}	
}
