package markshan.notebook;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityListFragment extends ListFragment {

    private ArrayList<Note> notes;
    private NoteAdapter noteAdapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        notes = new ArrayList<Note>();
        notes.add(new Note("Title", "this is the body", Note.Category.PERSONAL));
        notes.add(new Note("Second Note", "this is the second note", Note.Category.FINANCE));
        notes.add(new Note("Third Note", "this is the third note", Note.Category.TECHNICAL));
        notes.add(new Note("Title", "this is the body", Note.Category.PERSONAL));
        notes.add(new Note("Second Note", "this is the second note", Note.Category.FINANCE));
        notes.add(new Note("Third Note", "this is the third note", Note.Category.TECHNICAL));
        notes.add(new Note("Title", "this is the body", Note.Category.PERSONAL));
        notes.add(new Note("Second Note", "this is the second note", Note.Category.FINANCE));
        notes.add(new Note("Third Note", "this is the third note", Note.Category.TECHNICAL));
        notes.add(new Note("Title", "this is the body", Note.Category.PERSONAL));
        notes.add(new Note("Second Note", "this is the second note", Note.Category.FINANCE));
        notes.add(new Note("Third Note", "this is the third note", Note.Category.TECHNICAL));

        noteAdapter = new NoteAdapter(getActivity(), notes);

        setListAdapter(noteAdapter);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }
}
