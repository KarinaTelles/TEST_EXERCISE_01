package com.example.exercise;

import java.util.HashMap;
import java.util.Map;

public class FaturamentoPorEstado {
    public void faturamento(){
        // Faturamento mensal por estado
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        // Calcular o total de faturamento
        double totalFaturamento = 0.0;
        for (Double valor : faturamentoPorEstado.values()) {
            totalFaturamento += valor;
        }
        // Exibir o faturamento por estado e a porcentagem em relação ao total
        System.out.println("Faturamento mensal por estado:");
        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            double valor = entry.getValue();
            double porcentagem = (valor / totalFaturamento) * 100;

            System.out.printf("Estado: %s, Faturamento: R$%.2f, Porcentagem do total: %.2f%%\n", estado, valor, porcentagem);
        }
        // Exibir o total de faturamento
        System.out.printf("Total de faturamento: R$%.2f\n", totalFaturamento);
    }

}
/*4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
        • SP – R$67.836,43
        • RJ – R$36.678,66
        • MG – R$29.229,88
        • ES – R$27.165,48
        • Outros – R$19.849,53
Escreva um programa na linguagem que desejar onde calcule
 o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
 */