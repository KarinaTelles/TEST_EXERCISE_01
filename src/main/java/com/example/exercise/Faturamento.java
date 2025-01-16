package com.example.exercise;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Faturamento {
    /*Primeiro passo: Ler um arquivo JSON*/
    public void jsonReader() throws IOException {
        ObjectMapper objectMapperSize = new ObjectMapper();
        JsonNode jsonNodeSize = objectMapperSize.readTree(new File("src/main/java/com/example/exercise/dados.json"));
        System.out.println("IMPRIME O JSON INTEIRO: " + jsonNodeSize);
        System.out.println("IMPRIME O TAMANHO DO JSON: " + jsonNodeSize.size());
        System.out.println("VERIFICA SE É UM ARRAY: " + jsonNodeSize.isArray());
        Map<Integer, Double> listaJsonToHashMap = jsonToHashMap(jsonNodeSize);
        System.out.println(listaJsonToHashMap);
        ordenaHashMap(listaJsonToHashMap);
    }
    public Map<Integer, Double> jsonToHashMap(JsonNode jsonNodeSize)throws IOException{
        Map<Integer, Double> mapa = new HashMap<>();
        for(int i = 0; i<jsonNodeSize.size()-1;i++){
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File("src/main/java/com/example/exercise/dados.json"));
            JsonNode pegaJsonNode = jsonNode.get(i);
            int dia = pegaJsonNode.get("dia").asInt();
            double valor = pegaJsonNode.get("valor").asDouble();
            mapa.put(dia, valor);
        }
        return mapa;
    }
    public void ordenaHashMap(Map<Integer, Double> mapReceived){
        Map.Entry<Integer, Double> maxPrice = null;
        for(Map.Entry<Integer, Double> mapSort : mapReceived.entrySet()){
//            if
        }
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
