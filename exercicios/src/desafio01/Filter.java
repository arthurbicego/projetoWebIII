package desafio01;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public desafio01.Animal filtrarMaiorAnimalNaoCarnivoro(List<desafio01.Animal> animals){
        return animals.stream()
                .filter(a -> !a.getAlimentacao().equals("Carnívoro"))
                .max(Comparator.comparing(desafio01.Animal::getTamanho))
                .orElse(null);
    }

    public List<desafio01.Animal> filtrarCarnivorosPesamMaisQueX(List<desafio01.Animal> animais, Integer peso){
        return animais.stream()
                .filter(a -> a.getAlimentacao().equals("Carnívoro")
                        && a.getPeso() > peso
                ).collect(Collectors.toList());
    }

    public List<desafio01.Animal> filtrarNaoHerbivorosMenoresQueY(List<desafio01.Animal> animals, Double tamanho){
        return animals.stream()
                .filter(a -> !a.getAlimentacao().equals("Herbívoro") && a.getTamanho() < tamanho)
                .collect(Collectors.toList());
    }

}

