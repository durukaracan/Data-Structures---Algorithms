import java.util.LinkedList;
import java.util.List;
public class ListOfEmails {
    private List<Email> emails;
    public ListOfEmails() {
        emails = new LinkedList<>();
    }

    public void add(Email email) {
        emails.add(email);
    }

    public Email read(int id) {
        for (Email email : emails) {
            if (email.getId() == id) {
                email.markAsRead();
                return email;
            }
        }
        return null;
    }

    public Email delete(int id) {
        Email deletedEmail = null;
        for (Email email : emails) {
            if (email.getId() == id) {
                deletedEmail = email;
                emails.remove(email);
                break;
            }
        }
        return deletedEmail;
    }

    public void showAll(boolean showRead) {
        for (Email email : emails) {
            if (showRead || !email.isRead()) {
                System.out.println("Email id: " + email.getId());
                System.out.println("Subject: " + email.getSubject());
                System.out.println("Body: " + email.getMessage());
                System.out.println("Time received: " + email.getTime());
                System.out.println("Status: " + (email.isRead() ? "Read" : "Unread"));
                System.out.println("-----------------------------------------------");
            }
        }
    }


    public void showUnread(boolean showUnread) {
        for (Email email : emails) {
            if (!email.isRead() && showUnread) {
                System.out.println("Email id: " + email.getId());
                System.out.println("Subject: " + email.getSubject());
                System.out.println("Body: " + email.getMessage());
                System.out.println("Time received: " + email.getTime());
            }
        }
    }

    public void clearFolder() {
        emails.clear();
    }

    public int size() {
        return emails.size();

    }
}
