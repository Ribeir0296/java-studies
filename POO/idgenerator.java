class Ticket {
    // TODO: add a static counter shared by all tickets, and the fields id and title

    Ticket(String title) {
        // TODO: give this ticket the next id and store the title
    }

    int getId() {
        return 0;
    }

    String getTitle() {
        return "";
    }

    // TODO: return how many tickets were created so far
    static int count() {
        return 0;
    }
}

void main() {
    int n = Integer.parseInt(IO.readln().trim());
    List<Ticket> tickets = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        tickets.add(new Ticket(IO.readln().trim()));
    }
    for (Ticket t : tickets) {
        IO.println("#" + t.getId() + " " + t.getTitle());
    }
    IO.println("Tickets created: " + Ticket.count());
}
