package com.lucas.controllers.requests;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Length;

import java.util.List;
import java.util.Map;

public record IngredienteRequest(
        @NotNull
        String nome,
        @NotNull
        @Length(max = 200)
        @NotBlank
        String descricao,
        @NotNull
        String categoria,
        @NotNull
        String origem,
        Map<String, String> propriedades,
        List<String> restricoes,
        @Min(0)
        @Positive
        Integer estoque,
        @NotNull
        String unidade,
        Map<String, String> fornecedor
) {
}
