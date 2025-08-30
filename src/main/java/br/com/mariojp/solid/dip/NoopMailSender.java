package br.com.mariojp.solid.dip;

public class NoopMailSender implements MailSender {
    @Override
    public void send(String to, String subject, String body) {
        // Simula envio (sem fazer nada real)
        System.out.println("[DRY_RUN] Email simulado para: " + to);
    }
}
