package br.com.mariojp.solid.dip;

public class SmtpMailSender implements MailSender {
    private final SmtpClient client = new SmtpClient();

    @Override
    public void send(String to, String subject, String body) {
        client.send(to, subject, body);
    }
}
