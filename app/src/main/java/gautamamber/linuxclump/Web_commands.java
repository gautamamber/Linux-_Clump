package gautamamber.linuxclump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Web_commands extends AppCompatActivity {
    String[] array = new String[] {
            "$w3m: Open source text based web browser",
    "$youtube-dl: Download videos from Youtube an dfrom other sites",
    "$axel: Command line based downloader",
    "$wget <link>: Download file from web"

    };
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_commands);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
