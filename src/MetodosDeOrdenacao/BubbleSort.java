public class BubbleSort {
    
    public BubbleSort () {}

    /*
        BubbleSort:

        Para cada item, confere se o item atual é maior que o próximo para realizar a troca. Ele pode realizar a troca diversas vezes até que se conclua o objetivo. Esse metodo é estável, ou seja, só troca se for maior.
    */

    public void ordenar(int[]V, int n) { //Recebe um vetor e o seu respectivo tamanho

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