/*Exemplo cap.6 pg.11*/

class BoxDemo2{
public static void main(String args[]){

Box mybox = new Box();
Box mybox2 = new Box();
double vol;

//atribuir valores às variáves de instância de mybox

mybox.width = 10;
mybox.height = 20;
mybox.depth = 15;

mybox2.width = 3;
mybox2.height = 5;
mybox2.depth = 8;

//calcular o volume da caixa
vol = mybox.width * mybox.height * mybox.depth;

System.out.println("O volume da caixa 1 é " + vol);

//calcular o volume da caixa2
vol = mybox2.width * mybox2.height * mybox2.depth;

System.out.println("O volume da caixa 2 é " + vol);

}

}
