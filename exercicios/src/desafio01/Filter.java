package desafio01;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public Animal filtrarMaiorAnimalNaoCarnivoro(List<Animal> animals){
        return animals.stream()
                .filter(a -> !a.getAlimentacao().equals("Carnívoro"))
                .max(Comparator.comparing(Animal::getTamanho))
                .orElse(null);
    }

    public List<Animal> filtrarCarnivorosPesamMaisQueX(List<Animal> animais, Integer peso){
        return animais.stream()
                .filter(a -> a.getAlimentacao().equals("Carnívoro")
                        && a.getPeso() > peso
                ).collect(Collectors.toList());
    }

    public List<Animal> filtrarNaoHerbivorosMenoresQueY(List<Animal> animals, Double tamanho){
        return animals.stream()
                .filter(a -> !a.getAlimentacao().equals("Herbívoro") && a.getTamanho() < tamanho)
                .collect(Collectors.toList());
    }

}

