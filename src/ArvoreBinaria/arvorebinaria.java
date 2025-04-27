public class arvorebinaria {

    public static void main(String[] args) {

        int vetor[] = {2,0,3,4,1,6,5,7};
        bubbleSort(vetor, 8);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }

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

    /*
        InsertionSort:

        O objetivo do código é fixar uma chave e comparar se os valores dos índices anteriores são maiores que tal chave. A partir do momento que se identifica um valor maior, ocorre uma "quase troca", onde a chave é armazenada em uma variável auxiliar, até que se encontre um valor menor e quebrar o laço.
    */

    public static void insertionSort(int[]V, int tamV) {

        int i = 0; //A variável "i" se refere ao valor exclusivamente anterior à chave a ser comparada (atual)
        int j = 1; //A variável "j" se refere ao índice da chave a ser comparada (atual)
        int aux = 0; //Será utilizada para ajudar na realização da troca

        while(j < tamV) { //Começa a partir do segundo item, até o último.

            aux = V[j]; //Já armazena o valor da chave a ser conferida, de antemão
            i = j - 1; //Já indica o índice anterior a chave

            while((i >= 0) && (V[i] > aux)) { //Para cada item anterior à chave, confere se é válido e se é maior que o valor da chave
                V[i+1] = V[i]; //Se sim, o anterior é atribuído ao atual
                i--; //Passa pro anterior
            }

            V[i+1] = aux; //Após sair do laço, o espaço que ficou vazio recebe o valor da chave (guardado em "aux")
            j++; //Vai para o próximo indice do vetor
        }
    }

    /*
        BubbleSort:

        Para cada item, confere se o item atual é maior que o próximo para realizar a troca. Ele pode realizar a troca diversas vezes até que se conclua o objetivo. Esse metodo é estável, ou seja, só troca se for maior.
    */

    public static void bubbleSort(int[]V, int n) { //Recebe um vetor e o seu respectivo tamanho

        for(int i = n - 1; i >= 0; i--) { //Percorre o vetor inteiro, item por item

            for(int j = 1; j < n - 1; j++) { //Percorre os itens restantes do vetor

                if(V[j-1] > V[j]) { //Se o valor do indice anterior a chave for maior que a chave
                    int aux = V[j-1]; //Realiza a troca
                    V[j-1] = V[j];
                    V[j] = aux;
                }
            }
        }
    }
}