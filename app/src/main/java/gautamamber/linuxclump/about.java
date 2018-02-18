package gautamamber.linuxclump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class about extends AppCompatActivity {
    String[] array = new String[] {"$users: Current logged in user", "$passwd: change the password",
    "$cal: shows current month calender",
    "$who am i: Information about yourself",
    "$date: shows current date",
    "$who: other user who are currently logged in",
    "$hostname: Shows on which machine you are"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
