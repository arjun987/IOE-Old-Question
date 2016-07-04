package arjun.pandey.com.ioeoldquestion;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Arjun on 7/1/2016.
 */
public class ChooseFaculty extends ArrayAdapter <Faculty> {

    public ChooseFaculty(Context context, List<Faculty> facultyList) {
        super(context, R.layout.choose_faculty, facultyList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater nameinflater = LayoutInflater.from(getContext());
            convertView = nameinflater.inflate(R.layout.choose_faculty, parent, false);
        }
        Faculty faculty = getItem(position);

        TextView textView = (TextView) convertView.findViewById(R.id.textview);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        textView.setText(faculty.name);
        image.setImageResource(faculty.image);

        return convertView;

    }
}