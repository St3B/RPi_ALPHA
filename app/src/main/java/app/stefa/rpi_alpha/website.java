package app.stefa.rpi_alpha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    public WebView Webview ;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Webview  = new WebView(this);

        Webview.getSettings().setJavaScriptEnabled(true); // enable javascript

        final Activity activity = this;

        Webview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        Webview .loadUrl("http://www.google.com");
        setContentView(Webview );

    }

}
