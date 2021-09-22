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

    static void cadastrar_dev() {
        boolean invalido = true;
        do {
            System.out.println("Digite o nome do desenvolvedor: ");
            String nome = sc.nextLine();
            if (nome.length() < 3) {
                System.out.println("O nome deve ter, no minimo, três (3) caracteres. ");
            } else {
                invalido = false;
            }
        } while (invalido);

        invalido = true;
        do {
            System.out.println("Digite o sobrenome do desenvolvedor ");
            String sobrenome = sc.nextLine();
            if (sobrenome.length() < 3) {
                System.out.println("O sobrenome deve ter, no minimo, três (3) caracteres. ");
            } else {
                invalido = false;
            }
        } while (invalido);

        invalido = true;
        while (invalido) {
            System.out.println("Digite a senioridade do desenvolvedor: ");
            String senioridade = sc.nextLine();
            if (senioridade.length() < 3) {
                System.out.println("A senioridade deve ter no mínimo, 3 dígitos.  ");
            } else {
                invalido = false;
            }
        }
        while (invalido) ;

        invalido = true;
        do {
            System.out.println("Digite a idade do dev: ");
            int idade = sc.nextInt();
            if (idade < 1) {
                System.out.println("Idade invalida. Insira a sua idade novamente. ");
            } else {
                invalido = false;
            }
        } while (invalido);

        System.out.printf("Parabens, o dev foi cadastrado com sucesso!");
    }
}
