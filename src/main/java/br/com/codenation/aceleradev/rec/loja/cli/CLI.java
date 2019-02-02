package br.com.codenation.aceleradev.rec.loja.cli;

import br.com.codenation.aceleradev.rec.loja.exceptions.InvalidUserException;
import br.com.codenation.aceleradev.rec.loja.model.Product;
import br.com.codenation.aceleradev.rec.loja.model.Show;
import br.com.codenation.aceleradev.rec.loja.model.User;
import br.com.codenation.aceleradev.rec.loja.service.MovieController;
import br.com.codenation.aceleradev.rec.loja.service.ShowController;
import br.com.codenation.aceleradev.rec.loja.service.SoftwareController;
import br.com.codenation.aceleradev.rec.loja.service.UserController;

import java.util.Scanner;

public class CLI {
    private UserController userController = new UserController();
    private MovieController movieController = new MovieController();
    private ShowController showController = new ShowController();
    private SoftwareController softwareController = new SoftwareController();

    public void execute() {
        Scanner sc = new Scanner(System.in);
        String input = "";
        User user = null;

        while (true) {
            System.out.println("Digite seu CPF: ");
            input = sc.nextLine();
            try {
                user = getUser(input);
                break;
            } catch(InvalidUserException e) {
                System.out.println("Desculpe, vamos tentar novamente....");
            }
        }

        System.out.println("Bem vindo, " + user.getName());

        while (true) {
            printHome();
            input = sc.nextLine(); // option
            if (input.equals("x") || input.equals("X")) {
                break;
            }
            int op;
            try {
                op = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                op = -1;
            }
            switch (op) {
                case 0:
                    printShowList();
                    break;
                case 1:
                    printMoviesList();
                    break;
                case 2:
                    printSoftwareList();
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }

        System.out.println("Sessão encerrada");

    }


    private User getUser(String cpf) throws InvalidUserException {
        return userController.getUser(cpf);
    }

    private void printHome() {
        System.out.println("------ HOME ------");
        System.out.println("0 - Shows");
        System.out.println("1 - Filmes");
        System.out.println("2 - Softwares");
        System.out.println("Opcao: ");
    }

    private void printShowList() {
        for (Product p : showController.getAllShows()) {
            if (p instanceof Show) {
                System.out.println(((Show) p).getArtistName());
            }
        }
    }

    private void printMoviesList() {

    }

    private void printSoftwareList() {

    }

    private void cleanScreen() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("\n");
        }
    }

}
