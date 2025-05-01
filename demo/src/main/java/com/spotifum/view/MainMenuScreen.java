package com.spotifum.view;
public class MainMenuScreen implements ViewScreen {

    private SpotifumView view;
    private SpotifumController controller;
    private Scanner scanner;

    public MainMenuScreen(SpotifumView view, SpotifumController controller, Scanner scanner) {
        this.view = view;
        this.controller = controller;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Create User");
        System.out.println("2. Create Album");
        System.out.println("3. List Users");
        System.out.println("0. Exit");

        System.out.print("Choose option: ");
        int option = Integer.parseInt(scanner.nextLine());

        switch (option) {
            case 1 -> view.setScreen(new CreateUserScreen(view, controller, scanner));
            case 2 -> view.setScreen(new CreateAlbumScreen(view, controller, scanner));
            case 3 -> view.setScreen(new ListUsersScreen(view, controller, scanner));
            case 0 -> System.exit(0);
            default -> System.out.println("Invalid option.");
        }
    }
}
