package br.com.mariojp.solid.dip;

public class EmailNotifier {

    private final MailSender sender;

    public EmailNotifier(MailSender sender) {
        this.sender = sender;
    }

    public void welcome(User user) {
        sender.send(user.email(), "Bem-vindo", "Olá " + user.name());
    }
}
