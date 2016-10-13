package br.com.ericksprengel.listview;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Contato {

    private static final Random RANDOM = new Random();

    String nome;
    String email;
    int idade;
    int foto;
    String celular;

    public Contato(String nome, String email, int idade, int foto, String celular) {

        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.foto = foto;
        this.celular = celular;
    }

    @Override
    public String toString() {
        return this.nome + "\n" + this.email;
    }

    public static List<Contato> getContatos() {
        List<Contato> contatos = new ArrayList<Contato>();
        contatos.add(new Contato("Erick Massa Sprengel", "erick.sprengel@gmail.com", 27, R.drawable.contato_01, "55 11 996 382 272"));
        contatos.add(new Contato("Vinicius", "vinicius@quizeventos.com.br", 39, R.drawable.contato_02, "--//--"));
        contatos.add(new Contato("Holanda Junior", "holandajnr@gmail.com", 18, R.drawable.contato_03, "--//--"));
        contatos.add(new Contato("William", "w.domiciano@hotmail.com", 27, R.drawable.contato_04, "--//--"));
        contatos.add(new Contato("Cassio", "cassiopinheiro@gmail.com", 33, R.drawable.contato_05, "--//--"));
        contatos.add(new Contato("Juliana Fernandes", "jdinizaraujo@gmail.com", 32, R.drawable.contato_06, "55 11 986 760 717"));
        contatos.add(new Contato("Carolina", "cfproenca@gmail.com.br", 24, R.drawable.contato_01, "--//--"));
        contatos.add(new Contato("Paulo Felipe", "p.felipe@msn.com", 20, R.drawable.contato_02, "--//--"));
        contatos.add(new Contato("Danilo Pimenta Aguiar", "danilopi@outlook.com.br", 22, R.drawable.contato_03, "55 11 9 7244 5075"));
        contatos.add(new Contato("Victor", "vic.zampa@hotmail.com", 18, R.drawable.contato_04, "--//--"));

        contatos.add(new Contato("Denis", "vinicius@quizeventos.com.br", 39, R.drawable.contato_05, "--//--"));
        contatos.add(new Contato("Rodrigo", "rodrigo.viana29b@gmail.com", 31, R.drawable.contato_06, "--//--"));

//        for (int i = 0; i < 200; i++) {
//            int foto = i % 2 == 0 ? R.mipmap.ic_contato : R.mipmap.ic_launcher;
//            contatos.add(new Contato("Erick Massa Sprengel " + i, "erick.sprengel@gmail.com" + i, 27, foto, "55 11 996 382 272"));
//        }

        return contatos;
    }


    public static Contato gerarContato() {
        int i = RANDOM.nextInt(100);
        int foto = i % 2 == 0 ? R.mipmap.ic_contato : R.mipmap.ic_launcher;
        return new Contato("Contato " + i, "contato" + i + "@mmail.com", i, foto, "55 11 996 382 272");
    }
}