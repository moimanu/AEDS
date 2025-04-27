public class Main {

    public static void main(String[] args) {

        int vetor[] = {2,0,3,4,1,6,5,7};

        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.ordenar(vetor, 8);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
    
}