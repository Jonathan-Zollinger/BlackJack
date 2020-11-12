package BlackJack;

import org.junit.Assert;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class BJCardTest {

    BJCard bAce = new BJCard(1,3);

    @org.junit.jupiter.api.Test
    void getRank() {
        assertEquals(1,bAce.getRank());
    }

    @org.junit.jupiter.api.Test
    void getSuit() {
        assertEquals(3,bAce.getSuit());
    }

    @org.junit.jupiter.api.Test
    void setRank() {
        bAce.setRank(4);
        assertEquals(4, bAce.getRank());
    }

    @org.junit.jupiter.api.Test
    void setSuit() {
        bAce.setSuit(4);
        assertEquals(4,bAce.getSuit());
    }

    @org.junit.jupiter.api.Test
    void hideCard() {
        bAce.hideCard();
        assertTrue(bAce.isHidden());
    }

    @org.junit.jupiter.api.Test
    void showCard() {
        bAce.showCard();
        assertFalse(bAce.isHidden());
    }

    @org.junit.jupiter.api.Test
    void isHidden() {
        bAce.hideCard();
        assertTrue(bAce.isHidden());
    }

    @org.junit.jupiter.api.Test
    void getText() {
        assertEquals("AD",bAce.getText());
    }

    @org.junit.jupiter.api.Test
    void getFontColor() {
        assertEquals(Color.RED,bAce.getFontColor());
    }
}