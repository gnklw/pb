package nestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        String input;
        while (!"finish".equalsIgnoreCase(input = scanner.nextLine())) {
            int seats = Integer.parseInt(scanner.nextLine());
            String movie = input;

            int tickets = 0;
            while (tickets < seats && !"end".equalsIgnoreCase(input = scanner.nextLine())) {
                ++tickets;
                switch (input) {
                    case "student" -> ++studentTickets;
                    case "standard" -> ++standardTickets;
                    case "kids" -> ++kidTickets;
                }
            }

            totalTickets += tickets;
            System.out.printf("%s - %.2f%% full.%n", movie, (double) tickets / seats * 100);
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (double) studentTickets / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", (double) standardTickets / totalTickets * 100);
        System.out.printf("%.2f%% kid tickets.%n", (double) kidTickets / totalTickets * 100);
    }
}
