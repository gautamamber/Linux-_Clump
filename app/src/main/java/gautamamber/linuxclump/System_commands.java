package gautamamber.linuxclump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class System_commands extends AppCompatActivity {
    String[] array = new String[] {
            "$hostid: ID of host (32 bit hexadecimal numerical identifier)",
    "$sar: System Activity Report",
    "$free: Show memory status",
    "$df: Directory space usage status",
    "$bc: Calculator",
    "$uname -a: Shows kernal information",
    "$kill: Send signal to a process",
    "$route: Show info about or make changes about kernel roting"



};
ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_commands);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
