/*
Desafio 01
Problema
Crie alguns animais com no máximo três diferentes tipos de características como alimentação, reprodução, locomoção, tamanho, peso, entre outros, de modo a selecioná-los por determinados cenários de uso. Então, elabore de 3 a 5 cenários de uso utilizando operadores da Stream API para selecionar animais em condições que você mesmo irá definir.

Exemplo
Selecionar todos os animais herbívoros com peso maior que X
Selecionar todos os animais ovíparos não répteis
Selecionar o maior animal voa e carnívoro

Avaliação
Capacidade de modelar pequenos domínios
Elaborar cenários e conduzir implementações sobre estes
Conseguir utilizar operadores básicos Stream API Java

Sugestão
Publicar no github o projeto
Implementação guiada por testes unitários, se possível
 */


package desafio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        Filter filter = new Filter();

        animais.add(new Animal("Tigre", "Carnívoro", 3.3, 300));
        animais.add(new Animal("Gorila", "Herbívoro", 1.75, 195));
        animais.add(new Animal("Baleia", "Carnívoro", 14.6, 36000));
        animais.add(new Animal("Zebra", "Herbívoro", 2.3, 385));
        animais.add(new Animal("Coala", "Herbívoro", 0.7, 14));
        animais.add(new Animal("Elefante", "Herbívoro", 3.2, 5500));
        animais.add(new Animal("Pinguim", "Carnívoro", 0.7, 5));
        animais.add(new Animal("Canguru", "Herbívoro", 2.1, 80));
        animais.add(new Animal("Tubarão", "Carnívoro", 3.5, 385));
        animais.add(new Animal("Chimpanzé", "Onívoro", 1.2, 50));
        animais.add(new Animal("Leão", "Carnívoro", 2.4, 190));
        animais.add(new Animal("Tartaruga", "Onívoro", 1.0, 136));
        animais.add(new Animal("Macaco", "Onívoro", 0.5, 5));
        animais.add(new Animal("Crocodilo", "Carnívoro", 4.0, 450));
        animais.add(new Animal("Gato", "Carnívoro", 0.3, 4));
        animais.add(new Animal("Vaca", "Herbívoro", 1.5, 725));
        animais.add(new Animal("Cavalo", "Herbívoro", 1.6, 540));
        animais.add(new Animal("Rinoceronte", "Herbívoro", 1.8, 2300));
        animais.add(new Animal("Urso Polar", "Carnívoro", 2.6, 450));

        Double tamanhoY = 0.5;
        Integer pesoX = 500;

        System.out.println("Maior animal não carnívoro: " + filter.filtrarMaiorAnimalNaoCarnivoro(animais));
        System.out.println("Animais carnívoros que pesam mais que " + pesoX + "kg : " + filter.filtrarCarnivorosPesamMaisQueX(animais, pesoX));
        System.out.println("Animais não herbívoros que são menores que "+ tamanhoY +"m : " + filter.filtrarNaoHerbivorosMenoresQueY(animais, tamanhoY));

    }
}
