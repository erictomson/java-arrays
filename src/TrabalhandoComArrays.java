public class TrabalhandoComArrays {

    public static void main(String[] args) {

        // Declarando array unidimensional com 10 posições
        int[] arrayDeInteiros = new int[10];

        // Declarando e inicializando array
        String[] operacoes = {"soma", "subtracao", "multiplicacao", "divisao"};

        // Percorrendo o array usando estrutura de repetição
        // For é a mais indicada: conhecemos o tamanho do array
//        for (int i = 0; i < 10; i++) {
//            System.out.println(arrayDeInteiros[i]);
//        }

        // Declarando array bidimensional de inteiros
        int[][] matrizDeInteiros = new int[5][5];

        // Percorrendo o array usando estrutura de repetição
        // No caso de matriz, precisamos que um For intere dentro de outro For
        // Um para as linhas, outro para as colunas

        //Inicializando posições
        for(int i=0; i<5; i++) {
            for (int j=0;j<5;j++) {
                //Inicializando o elemento atual da matriz
                //usando a posição atual (soma)
                matrizDeInteiros[i][j]=i+j;
            }
        }

        //Imprimindo elementos da matriz
        for(int i=0; i<5; i++) {
            for (int j=0;j<5;j++) {
                // Imprimirá 0 por não termos inicializado o array
                System.out.println("Elemento [" + i + "][" + j + "]: " + matrizDeInteiros[i][j]);
            }
        }
    }
}
