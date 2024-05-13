public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        Pilha pilha = new Pilha(5);

        //testando fila
        System.out.println("Adicionando: " + fila.adicionar("Abelha"));
        System.out.println("Adicionando: " + fila.adicionar("Bernardo"));
        System.out.println("Adicionando: " + fila.adicionar("Casa"));
        System.out.println("Adicionando: " + fila.adicionar("Dragrão"));
        System.out.println("Adicionando: " + fila.adicionar("Enzo"));

        System.out.println("A fila está vazia? " + fila.isEmpty());

        System.out.println("Primeiro elemento da fila: " + fila.primeiro());
        System.out.println("Tamanho da fila " + fila.tamanho());

        while (!fila.isEmpty()){
            System.out.println("Removendo da fila: " + fila.remover());
        }


        System.out.println("A fila está vazia? " + fila.isEmpty());

        //Testando Pilha
        System.out.println("Adicionando: " + pilha.empilhar("Farmarcia"));
        System.out.println("Adicionando: " + pilha.empilhar("Geraldo"));
        System.out.println("Adicionando: " + pilha.empilhar("Hélio"));
        System.out.println("Adicionando: " + pilha.empilhar("Indio"));
        System.out.println("Adicionando: " + pilha.empilhar("Jus"));

        System.out.println("A fila está vazia? " + pilha.isEmpty());

        System.out.println("Primeiro elemento da fila: " + pilha.topo());
        System.out.println("Tamanho da fila " + pilha.tamanho());

        while(!pilha.isEmpty()){
            System.out.println("Removendo da pilha " + pilha.desempilhar());
        }

        System.out.println("A pilha esta vazia? " + pilha.isEmpty());

        System.out.println("Acabou");
    }
}
