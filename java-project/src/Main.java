import br.com.test.controller.EmailService;
import br.com.test.controller.Pessoa;
import br.com.test.controller.PessoaService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String nome = "Willian hahah haha ";
        Integer idade = 26; // -2.147.483.648 a 2.147.483.647
        Long idadeMaior = 26L; // -9.223.372.036.854.775.  a 9.223.372.036.854.775.807
        Short idadeMenor = 2; // -32.768 a 32.767
        Byte idadeP = 2; // -128 a 127
        Double salario = 10.123; // -1.79769313486231570E+308 a +1.79769313486231570E+308
        Float salario2 = 10.123F;
        String newName = nome + "123"; // Willian hahah haha 123
        Boolean ativo = true;

        int idadeasdad = 26;
        long idadeadsad = 26;
        short idadeasdasd = 26;
        byte idadeasdasdasd = 26;
        boolean idadeasdasdasdaa = true;
        boolean idadeasdasdasdasd = false;

        Date dataFalecimento = null;
        LocalDate dataFalecimento2 = null;
        LocalDateTime dataFalecimento2fd = null;
        OffsetDateTime dataFalecimento4545 = OffsetDateTime.parse("2022-06-16T12:00:00-03:00");
        ZonedDateTime dataFalecimento3 = null;

        String[] array = new String[10];
        array[0] = "blabla";
        array[1] = "blabla2";
        array[2] = "blabla3";
        array[3] = "blabla4";

        // < um menor q outro
        // > um maior q outro
        // == um igual ao outro


        // i = 0
        // i = 1
        // i = 2
        // i = 3
        System.out.println("antes");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println("array: " + array[i]);
        }
        System.out.println("depois");

        ArrayList<String> minhaLista = new ArrayList<>();
        minhaLista.add("olar");
        minhaLista.add("olar2");
        minhaLista.add("olar3");
        minhaLista.add("olar4");

        minhaLista.remove(1);

        for (int i = 0; i <= minhaLista.size() - 1; i++) {
            System.out.println("array: " + minhaLista.get(i));
        }

        minhaLista.forEach((elemento) -> {
            System.out.println("lista foreach: " + elemento);
        });

        String pessoaNome1 = "Willian";
        Long pessoaIdade1 = 10L;

        // api
        PessoaService service = new PessoaService();
        EmailService emailService = new EmailService();

        Pessoa pessoa1 = new Pessoa("Willian", "Londrina", 26, "williancolognesi@gmail.com");
        Pessoa pessoa2 = new Pessoa("Jefferson", "Londrina", 26, "williancolognesi@gmail.com");
        Pessoa pessoa3 = new Pessoa("Leticia", "Londrina", 26, "williancolognesi@gmail.com");
        Pessoa pessoa4 = new Pessoa("Nathalia", "Londrina", 26, "williancolognesi@gmail.com");

        System.out.println("Nome " + pessoa1.nome);
        System.out.println("Idade " + pessoa1.idade);
        System.out.println("Cidade: " + pessoa1.cidade);

        service.salvar(pessoa1);
        emailService.enviaEmailConfirmacao(pessoa1);


        // 1111 1111 0000 0000 0000 0000 0000 0000 0000 0000

//        System.out.println(nome);
//        System.out.println(idade / 2);
//        System.out.println(idade * 2);
//        System.out.println(idade - 2);
//        System.out.println(idade + 2);
//        System.out.println(idade % 3);
    }
}
