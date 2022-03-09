public class EmailImpl implements IEmail{

    // EmailImpl darf nur den Entschlüsselten (decoded) Content wiedergeben.

    private String Subject;
    private String Content;

    public EmailImpl(String Subject, String Content){
        this.Subject = Subject;
        this.Content = Content;
    }

    @Override
    public String getSubject() {
        return this.Subject;
    }

    // Damit man weißt, dass es von der Klasse EmailImpl stammt
    @Override
    public String getContent() {
        return this.Content + " (Content in Email) ";
    }
}
