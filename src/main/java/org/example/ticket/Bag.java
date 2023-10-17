package org.example.ticket;

/**
 * 관람객이 소지한 소지품
 *
 * 티켓과 현금, 초대장을 가질 수 있다.
 */
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    /**
     * 소지품에 현금만 있는 경우
     *
     * @param amount
     */
    public Bag(long amount) {
        this(null, amount);
    }

    /**
     * 소지품에 초대장과 현금이 있는 경우
     *
     * @param invitation
     * @param amount
     */
    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket) {
        setTicket(ticket);

        if (hasInvitation()) {
            return 0L;
        } else {
            minusAmount(ticket.getFee());

            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private boolean hasTicket() {
        return ticket != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }
}
