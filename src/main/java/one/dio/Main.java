package one.dio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros); //Apos adicionar a marca Peugeot vai mostrar toda a lista por ordem.

        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros); //Tenta adicionar, se não conseguir adicionar retorna false.

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros); // Vai pegar o primeiro elemento da fila,
        // e se tiver vazia retorna null.

        System.out.println(queueCarros.poll()); //Pega o primeiro elemento da fila e remove.
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty()); //Por não estar vazia retorna false.
        System.out.println(queueCarros.size()); //Mostra a quantidade de dados da fila(4).






    }


}
