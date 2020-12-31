/*Exemplo cap.6 pg.11*/

class Box {
double width;
double height;
double depth;
}

class BoxDemo{
public static void main(String args[]){

Box mybox = new Box();
double vol;

//atribuir valores às variáves de instância de mybox

mybox.width = 10;
mybox.height = 20;
mybox.depth = 15;

//calcular o volume da caixa

vol = mybox.width * mybox.height * mybox.depth;

System.out.println("O volume é " + vol);

}

}
