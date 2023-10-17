package org.example.ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 매표소
 *
 * 티켓을 판매하거나 교환해줄 티켓의
 * 목록과 금액을 포함
 */
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTicketTo(Audience audience) {
        Ticket ticket = getTicket();
        Long buyAmount = audience.buy(ticket);

        plusAmount(buyAmount);
    }

    /**
     * 첫번째 티켓
     *
     * @return
     */
    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }
}
