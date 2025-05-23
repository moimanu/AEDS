public class SelectionSort {
 
    public SelectionSort() {}

    /*
        SelectionSort:

        Basicamente, o Selection Sort fixa uma primeira chave (nesse caso, o valor do menor índice), e uma busca no restante do vetor para encontrar outra chave que seja menor. Ao final do primeiro ciclo de busca, a menor chave encontrada será trocada com a chave fixada inicialmente. Depois disso, será preciso fixar mais uma chave (desconsiderando a primeira posição), e realizar o mesmo processo com o restante do vetor. Esse metodo pode ser criado de maneira recursiva ou iterativa.
    */

    public static void selectionSort(int[]V, int iMenor, int iMaior) {

        if (iMenor >= iMaior) return; //Serve para evitar recursão infinita

        int possivelMenor = iMenor; //Inicia com uma hipótese

        for(int i = iMenor + 1; i <= iMaior; i++) { //Encontra uma chave menor que a hipótese
            if(V[i] < V[possivelMenor]){
                possivelMenor = i;
            }
        }

        if (V[iMenor] != V[possivelMenor]) { //Esse codigo é estável, mas a versão clássica não é
            int aux = V[iMenor]; //Guarda a chave inicial
            V[iMenor] = V[possivelMenor]; //Coloca a menor chave na posicao inicial
            V[possivelMenor] = aux; //Troca respetivamente
        }

        selectionSort(V, iMenor + 1, iMaior); //Comeca novamente, mas agora com o proximo indice
    }
}