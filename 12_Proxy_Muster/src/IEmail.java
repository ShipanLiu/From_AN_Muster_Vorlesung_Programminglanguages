public interface IEmail {
    // Eine Email kann nur Subject wiedergeben oder den Content: decoded
    String getSubject();
    String getContent();
}
