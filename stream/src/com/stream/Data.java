package com.stream;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasTokio = LocalDate.of(2021, Month.JUNE, 5);
        System.out.println(olimpiadasTokio);

        int anos = olimpiadasTokio.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, olimpiadasTokio);
        System.out.println(periodo.getDays());

        LocalDate proximas = olimpiadasTokio.plusYears(4);
        System.out.println(proximas);




        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");//criando o formatador

        String valorFormatado = proximas.format(formatador);
        System.out.println(valorFormatado);

        DateTimeFormatter formatadorComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm" );
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHora));


//        YearMonth mes = YearMonth.of();//só o mês e o ano
        LocalTime intervalo = LocalTime.of(15, 30); //15:30
    }
}
