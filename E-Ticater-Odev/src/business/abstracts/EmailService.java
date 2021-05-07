package business.abstracts;

public interface EmailService {
  void sendLink();
  void confirmMembership(String email);
}
