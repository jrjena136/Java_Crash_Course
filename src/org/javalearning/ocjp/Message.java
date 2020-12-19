package org.javalearning.ocjp;

public abstract class Message {
    public String recipient;
    public abstract void sendMessage();

    public static void main(String[] args) {
        Message m = new TextMessage();
        m.recipient = "1234567890";
        m.sendMessage();
    }

    static class TextMessage extends Message {

        @Override public final void sendMessage() {
            System.out.println("Text message to " + recipient);
        }
    }
}

/*
    A. Text message to null.
    B. Text message to 1234567890.
    C. A compiler error occurs on line 1.
    D. A compiler error occurs on line 3.
    E. A compiler error occurs on line 7.
    F. A compiler error occurs on another line.
 */
// O/P - ans is D because a method can not be declared both abstract and final.
// If removed abstract then ans is  B
