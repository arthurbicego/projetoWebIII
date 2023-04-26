package tech.ada.user.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comprovante {

    private String name;
    public String id;
    private String pagador;
    private String recebedor;
    private Double valor;
    private LocalDateTime data;
    private Boolean ack_usuario;

    public Comprovante(String abc) {
        this.name = abc;
    }

}
