package com.stream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Curso {

    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos{
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        cursos.forEach((curso) -> System.out.println(curso.getNome()) );

        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getAlunos())); //iterar
                //devolve uma coleção de objetos

        Optional<Curso> optionalCurso = cursos.stream().filter(c -> c.getAlunos() >= 100).findAny();//devolve qualquer um
        Curso curso = optionalCurso.orElse(null);
        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

        cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().
        ifPresent(c -> System.out.println(c.getNome()));

    }
}
