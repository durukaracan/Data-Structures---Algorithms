public class Email {
    private String subject;
    private int id;
    private String message;
    private int time;
    private boolean read;

    //constructor
    public Email(String subject, int id, String message, int time) {
        this.subject = subject;
        this.id = id;
        this.message = message;
        this.time = time;
        this.read = false;
    }


    //getters
    public String getSubject() {
        return subject;
    }
    public int getId() {
        return id;
    }
    public String getMessage() {
        return message;
    }
    public int getTime() {
        return time;
    }
    public boolean isRead() {
        return read;
    }


    //setters
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public void setRead(boolean read) {
        this.read = read;
    }

    //is for changing that read status from unread to read
    public void markAsRead() {
        read = true;
    }

}