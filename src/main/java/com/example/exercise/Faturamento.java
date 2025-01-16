package com.example.exercise;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Faturamento {
    /*Primeiro passo: Ler um arquivo JSON*/
    public void jsonReaderClass() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("src/main/java/com/example/exercise/dados.json"));
        System.out.println(jsonNode);
        System.out.println(jsonNode.size());
        System.out.println(jsonNode.isArray());
        System.out.println(jsonNode.get(1));
        JsonNode a = jsonNode.get(1);
        int dia = a.get("dia").asInt();
        System.out.println(dia);
    }
}
/*
3) Dado um vetor que guarda o valor de faturamento diário
 de uma distribuidora, faça um programa que calcule e retorne:
    • O menor valor de faturamento ocorrido em um dia do mês;
    • O maior valor de faturamento ocorrido em um dia do mês;
    • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados.
Estes dias devem ser ignorados no cálculo da média;
*/
