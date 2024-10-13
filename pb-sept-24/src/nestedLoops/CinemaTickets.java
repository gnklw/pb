package nestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTickets = 0;
        int standardTickets = 0;
        int studentTickets = 0;
        int kidTickets = 0;

        String input;
        while (!"finish".equalsIgnoreCase(input = scanner.nextLine())) {
            String movie = input;
            int seats = Integer.parseInt(scanner.nextLine());

            int tickets = 0;
            while (tickets < seats
                    && !"End".equalsIgnoreCase(input = scanner.nextLine())) {
                ++tickets;
                switch (input) {
                    case "standard" -> ++standardTickets;
                    case "student" -> ++studentTickets;
                    case "kid" -> ++kidTickets;
                }
            }

            totalTickets += tickets;
            System.out.printf("%s - %.2f%% full.%n", movie, (double) tickets / seats * 100);
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (double) studentTickets / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", (double) standardTickets / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", (double) kidTickets / totalTickets * 100);
    }
}
