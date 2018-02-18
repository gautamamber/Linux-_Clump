package gautamamber.linuxclump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Editor_commands extends AppCompatActivity {
    String[] array = new String[] {
            "$vim <filename>: Open or Create file with Vim edior",
    "$w : Save file",
    "$q : Quite file, Don't save",
    "$wq: Save and quit",
    "$:! dict <word> : Meaning of word",
    "$undo : Undo last command",
    "$U : Undo all changes",
    "$:ha : Prints entire files"


};
ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor_commands);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
