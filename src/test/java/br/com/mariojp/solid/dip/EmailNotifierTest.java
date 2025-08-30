package br.com.mariojp.solid.dip;

public class EmailNotifierTest {

    private final MailSender sender;

    public EmailNotifierTest() {
        if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
            this.sender = new NoopMailSender();
        } else {
            this.sender = new SmtpMailSender();
        }
    }

    public void welcome(User user) {
        sender.send(user.email(), "Bem-vindo", "Olá " + user.name());
    }
}
