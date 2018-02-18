package gautamamber.linuxclump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class File_permission extends AppCompatActivity {
    String[] array = new String[] {
            "$ls -l : Listing all file with permissions",
    "$ls -l <filename> : Particular filename permission",
    "$chmod: Change the permission of file or directory",
    "$chgrp: Changing group ownership of file or directory",

    };
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_permission);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
