package gautamamber.linuxclump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Device extends AppCompatActivity {
    String[] array = new String[] {
            "$mount /media/usb",
            "$unmount /media/usb",
            "$eject /media/usb/cdrom",
            "$mount /media/floppy",
            "$free: Shows memory and swap usage"
    };
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
