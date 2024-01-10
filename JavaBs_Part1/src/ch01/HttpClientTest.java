package JavaBs_Part1.src.ch01;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.time.Duration;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;


// 參考 :
// https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpRequest.Builder.html#timeout(java.time.Duration)
// https://matthung0807.blogspot.com/2021/11/java-11-httpclient-send-request-example.html
// https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#sslcontext-algorithms
public class HttpClientTest {
    public static void main(String[] args) throws Exception {
        // 建立HttpClient實例
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1) // http 1.1
                .connectTimeout(Duration.ofSeconds(5)) // timeout after 5 seconds
                .sslContext(disabledSSLContext()) // disable SSL verify
                .build();

        // 臺灣證券交易所0056個股日成交資訊API
        String url = "https://www.twse.com.tw/exchangeReport/STOCK_DAY?response=json&date=20220307&stockNo=0050";

        // 建立HttpRequest請求
        HttpRequest request = HttpRequest.newBuilder()
                .timeout(Duration.ofSeconds(5))
                .uri(URI.create(url))
                .build();

        // 發送請求並接收回應
        HttpResponse<String> response = httpClient.send(
                request, HttpResponse.BodyHandlers.ofString());

        // 取得回應主體內容
        String body = response.body();

        System.out.println(body);

    }

    private static SSLContext disabledSSLContext() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext sslContext = SSLContext.getInstance("TLS"); // https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#sslcontext-algorithms
        sslContext.init(
                null,
                new TrustManager[] {
                        new X509TrustManager() {
                            public X509Certificate[] getAcceptedIssuers() {
                                return null;
                            }

                            public void checkClientTrusted(X509Certificate[] certs, String authType) {
                            }

                            public void checkServerTrusted(X509Certificate[] certs, String authType) {
                            }
                        }
                },
                new SecureRandom());
        return sslContext;
    }

}
