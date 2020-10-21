package com.company.entity.testes;

import com.company.entity.pessoas.Pessoa;
import com.company.entity.pessoas.PessoaFisica;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.function.Consumer;

public class TesteNovo {

        public static void main(String[] args) {
            Pessoa p1 = new PessoaFisica();
            p1.setNome("Amanda");
            p1.setIdade(26);

            Pessoa p2 = new PessoaFisica();
            p2.setNome("Larissa");
            p2.setIdade(24);

            List<Pessoa> pessoas = new ArrayList<Pessoa>();
            pessoas.add(p1);
            pessoas.add(p2);


            pessoas.sort(new Comparator<Pessoa>(){
                @Override
                public int compare(Pessoa o1, Pessoa o2) {
                    return Integer.compare(o1.getIdade(), o2.getIdade());
                }
            });

            pessoas.sort((Pessoa o1, Pessoa o2)  ->{
                return Integer.compare(o1.getIdade(), o2.getIdade());
            });

            pessoas.sort( (o1, o2)  -> Integer.compare(o1.getIdade(), o2.getIdade()) );

            System.out.println(pessoas);

            Collections.sort(pessoas);


            int[] numeros = new int[]{43, 15, 64, 22, 89};
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));


            for(Pessoa pessoa: pessoas){
                System.out.println(pessoa.getNome());
            }

            pessoas.forEach(new Consumer<Pessoa>(){
                @Override
                public void accept(Pessoa pessoa) {
                    System.out.println(pessoa.getNome());
                }
            });

            pessoas.forEach((pessoa) -> System.out.println(pessoa.getNome()) );
        }
}
