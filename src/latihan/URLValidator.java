package latihan;

public class URLValidator {

    public static void main(String[] args) {


        String url = "https://www.example.com/test/page";

        int protocolEnd = url.indexOf("://");

        String protocol = url.substring(0, protocolEnd);

        int domainStart = protocolEnd + 3;

        int domainEnd = url.indexOf("/", domainStart);

        String domain = url.substring(domainStart, domainEnd);

        String path = url.substring(domainEnd);

        System.out.println("URL: " + url);
        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);



    }
}
