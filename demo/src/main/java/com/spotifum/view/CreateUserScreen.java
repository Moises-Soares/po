package com.spotifum.view;
public class CreateUserScreen implements ViewScreen {

    private SpotifumView view;
    private SpotifumController controller;
    private Scanner scanner;

    public CreateUserScreen(SpotifumView view, SpotifumController controller, Scanner scanner) {
        this.view = view;
        this.controller = controller;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        System.out.println("\n--- Create User ---");
        System.out.println("Enter 0 to go back.");

        System.out.print("Name: ");
        String name = scanner.nextLine();
        if (name.equals("0")) {
            view.setScreen(new MainMenuScreen(view, controller, scanner));
            return;
        }

        System.out.print("Email: ");
        String email = scanner.nextLine();
        if (email.equals("0")) {
            view.setScreen(new MainMenuScreen(view, controller, scanner));
            return;
        }

        System.out.print("Plan: ");
        String plan = scanner.nextLine();
        if (plan.equals("0")) {
            view.setScreen(new MainMenuScreen(view, controller, scanner));
            return;
        }

        controller.addUser(name, email, plan);
        System.out.println("User created!");
        view.setScreen(new MainMenuScreen(view, controller, scanner));
    }
}
