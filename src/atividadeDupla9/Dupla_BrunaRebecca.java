package atividadeDupla9;

import java.util.Scanner;

public class Dupla_BrunaRebecca {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cabecalho();
        escolha_menu();
    }

    static void cabecalho(){
        System.out.println("=========================== CADASTRO DE DEVS ======================================= ");
        System.out.println("=============================== BEM VINDO ========================================== ");
        System.out.println("|1| CADASTRAR DEV            |2| CADASTRAR LINGUAGEM                         |3| SAIR");
    }

    static void escolha_menu() {
        int op = ler_numero("Digite uma opção do menu:");
        switch (op){
            case 1:
                cadastrar_dev();
                break;
            case 2:
                cadastrar_linguagem();
                break;
            case 3:
                System.out.println("Aplicação finalizada!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;

        }
    }

    static int ler_numero(String mensagem){
        System.out.print(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

    static String ler_texto(String mensagem) {
        System.out.println(mensagem);
        String texto = sc.nextLine();
        return texto;
    }

    static void cadastrar_dev() {
        boolean invalido = true;
        do {
            String nome = ler_texto("Digite o nome do desenvolvedor: ");
            if (nome.length() < 3) {
                System.out.println("O nome deve ter, no minimo, três (3) caracteres. ");
            } else {
                invalido = false;
            }
        } while (invalido);

        invalido = true;
        do {
            String sobrenome = ler_texto("Digite o sobrenome do desenvolvedor ");
            if (sobrenome.length() < 3) {
                System.out.println("O sobrenome deve ter, no minimo, três (3) caracteres. ");
            } else {
                invalido = false;
            }
        } while (invalido);

        invalido = true;
        do {
            String senioridade = ler_texto("Digite a senioridade do desenvolvedor: ");
            if (senioridade.length() < 3) {
                System.out.println("A senioridade deve ter no mínimo, 3 dígitos.  ");
            } else {
                invalido = false;
            }
        } while (invalido);

        invalido = true;
        do {
            int idade = ler_numero("Digite a idade do dev: ");
            if (idade < 1) {
                System.out.println("Idade invalida. Insira a sua idade novamente. ");
            } else {
                invalido = false;
            }
        } while (invalido);

        System.out.printf("Parabens, o dev foi cadastrado com sucesso!");
    }

    static void cadastrar_linguagem() {
        int tipoAplicacao;
        String nomeLinguagem = "", descricao = "", aplicacao = "";

        System.out.println("Cadastro de Linguagem");
        do {
            nomeLinguagem = ler_texto("Nome da linguagem: ");

            if (nomeLinguagem.length() < 3) {
                System.out.println("Valor inválido. O nome deve ter no mínimo 3 caracteres.  Digite novamente");
            }
        } while (nomeLinguagem.length() < 3);

        do {
            descricao = ler_texto("Descrição da linguagem: ");

            if (descricao.length() < 3) {
                System.out.println("Valor inválido. A descrição deve ter no mínimo 3 caracteres.  Digite novamente");
            }
        } while (descricao.length() < 3);

        do {
            tipoAplicacao = ler_numero("Informe o tipo da aplicação: 1. Frontend; 2. Backend; 3. Mobile");

            switch (tipoAplicacao) {
                case 1:
                    aplicacao = "Frontend";
                    break;
                case 2:
                    aplicacao = "Backend";
                    break;
                case 3:
                    aplicacao = "Mobile";
                    break;
                default:
                    System.out.println("Tipo de aplicação inválida. Digite novamente");
            }
        } while (tipoAplicacao < 1 || tipoAplicacao > 3);

        System.out.printf("\nCadastro realizado com sucesso \nO nome  informado foi: %s " +
                "\nA descrição informada foi: %s" +
                "\nA aplicação informada foi: %s \n ", nomeLinguagem, descricao, aplicacao);
    }
}
