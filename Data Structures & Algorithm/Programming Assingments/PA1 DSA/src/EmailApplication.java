import java.util.Scanner;

public class EmailApplication {

    public static void main(String[] args) {
        ListOfEmails inbox = new ListOfEmails();
        ListOfEmails archive = new ListOfEmails();
        ListOfEmails trash = new ListOfEmails();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome!");
        System.out.println("Commands:\nN => New Email,\nR <id> => Read Email,\nA <id> => Archive Email,\nD <id> => Delete Email,\nS <Folder> => Show Emails,\nU <Folder> => Show Unread Emails,\nC <Folder> => Clear Folder,\nE => Exit");

        while (true) {
            System.out.println("Enter your command (N, R, A, D, S, U, C) or 'E' to exit:");
            input = scanner.nextLine();

            if (input.equals("E")) {
                System.out.println("Exiting..");
                break;
            }

            char command = input.charAt(0);
            int id;
            switch (command) {
                case 'N':
                    System.out.println("Enter email subject:");
                    String subject = scanner.nextLine();
                    System.out.println("Enter email message:");
                    String message = scanner.nextLine();
                    System.out.println("Enter email ID:");
                    id = Integer.parseInt(scanner.nextLine());
                    long time = System.currentTimeMillis();
                    Email newEmail = new Email(subject, id, message, (int) time);
                    inbox.add(newEmail);
                    System.out.println("New email added to Inbox.");
                    break;
                case 'R':
                    System.out.println("Enter email ID to read:");
                    id = Integer.parseInt(scanner.nextLine());
                    Email readEmail = inbox.read(id);
                    if (readEmail != null) {
                        System.out.println("Email id: " + readEmail.getId());
                        System.out.println("Subject: " + readEmail.getSubject());
                        System.out.println("Body: " + readEmail.getMessage());
                        System.out.println("Time received: " + readEmail.getTime());
                        System.out.println("Status: " + (readEmail.isRead() ? "Read" : "Unread"));
                    } else {
                        System.out.println("No such email.");
                    }
                    break;
                case 'A':
                    System.out.println("Enter email ID to archive:");
                    id = Integer.parseInt(scanner.nextLine());
                    Email archivedEmail = inbox.delete(id);
                    if (archivedEmail != null) {
                        archive.add(archivedEmail);
                        System.out.println("Email <" + archivedEmail.getId() + "> archived.");
                    } else {
                        System.out.println("No such email in Inbox.");
                    }
                    break;
                case 'D':
                    System.out.println("Enter email ID to delete:");
                    id = Integer.parseInt(scanner.nextLine());
                    Email deletedEmail = inbox.delete(id);
                    if (deletedEmail != null) {
                        trash.add(deletedEmail);
                        System.out.println("Email " + deletedEmail.getId() + " deleted.");
                    } else {
                        System.out.println("No such email in Inbox.");
                    }
                    break;
                case 'S':
                    System.out.println("Enter folder to show (Inbox, Archive, or Trash):");
                    String folderToShow = scanner.nextLine();
                    if (folderToShow.equals("Inbox")) {
                        if (inbox.size() > 0) {
                            inbox.showAll(true);
                        } else {
                            System.out.println("Inbox is empty.");
                        }
                    } else if (folderToShow.equals("Archive")) {
                        if (archive.size() > 0) {
                            archive.showAll(true);
                        } else {
                            System.out.println("Archive is empty.");
                        }
                    } else if (folderToShow.equals("Trash")) {
                        if (trash.size() > 0) {
                            trash.showAll(true);
                        } else {
                            System.out.println("Trash is empty.");
                        }
                    } else {
                        System.out.println("Invalid folder name.");
                    }
                    break;
                case 'U':
                    System.out.println("Enter folder to show unread emails (Inbox, Archive, or Trash):");
                    String folderUnread = scanner.nextLine();
                    if (folderUnread.equals("Inbox")) {
                        inbox.showUnread(true);
                    } else if (folderUnread.equals("Archive")) {
                        archive.showUnread(true);
                    } else if (folderUnread.equals("Trash")) {
                        trash.showUnread(true);
                    } else {
                        System.out.println("Invalid folder name.");
                    }
                    break;
                case 'C':
                    System.out.println("Enter folder to clear (Inbox, Archive, or Trash):");
                    String folderClear = scanner.nextLine();
                    if (folderClear.equals("Inbox")) {
                        inbox.clearFolder();
                        System.out.println("Inbox cleared.");
                    } else if (folderClear.equals("Archive")) {
                        archive.clearFolder();
                        System.out.println("Archive cleared.");
                    } else if (folderClear.equals("Trash")) {
                        trash.clearFolder();
                        System.out.println("Trash cleared.");
                    } else {
                        System.out.println("Invalid folder name.");
                    }
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
        }
    }
}