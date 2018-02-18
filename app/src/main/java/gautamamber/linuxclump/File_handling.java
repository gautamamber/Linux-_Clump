package gautamamber.linuxclump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class File_handling extends AppCompatActivity {
    String[] array = new String[] {"$pwd: current working directory",
            "$ls: list of all files in directory",
            "$ls -a: display hidden files",
            "$ls -R: list subdirectories",
            "$ls -t: list files in chronological order",
            "$ls -l: display all the permission of the file",
            "$ls -r: dispaly file names in reverse order",
            "$cd: Changing Directory",
            "$cd. : (One Dot) Moves one directory up",
            "$cd.. : (Double Dot) Moves two or more directory",
            "$mkdir <dirname>: Create new Directory",
            "$touch <filename>: Create empty text file",
            "$rmdir <dirname>: Remove directory",
            "$mv <name1> <name2>: Rename file or directory",
            "$mv <name> <path>: Move file or directory at specific path",
            "$cp <name> <path>: Copy file or directory at specific path",
            "$cat >  <file name>: Create or write in a file, and end with Ctrl",
            "$cat <filename> : Print the content of file",
            "$cat <file1> <file2> > <file3> : Join two or more file in one file",
            "$head: Output first ten line of file",
            "$less <filename>: Quickly view file, 'q' for quite"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_handling);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
