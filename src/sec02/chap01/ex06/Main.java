package sec02.chap01.ex06;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        URL url1 = new URL("https://showcases.yalco.kr/java/index.html");

        URL url2 = new URL("https://showcases.yalco.kr");
        URL url3 = new URL(url2, "/java/index.html");

        String url1Str = url1.toExternalForm();
        String url3Str = url3.toExternalForm();
        boolean sameUrl = url1.equals(url3);

        //  💡 URL의 인스턴스 메소드들
        String content = url1.toExternalForm();
        String file = url1.getFile();
        String path = url1.getPath();
        String host = url1.getHost();
        long port = url1.getPort();
        long defPort = url1.getDefaultPort();
    }
}
