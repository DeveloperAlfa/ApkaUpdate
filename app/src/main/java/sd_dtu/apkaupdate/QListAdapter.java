package sd_dtu.apkaupdate;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Krishna on 21-07-2016.
 */
public class QListAdapter extends ArrayAdapter<String> {
    private int layout;
    public QListAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
        layout=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mainviewholder;
        if(convertView==null) {
            LayoutInflater inflater = (LayoutInflater.from(getContext()));
            convertView=inflater.inflate(layout,parent,false);
            ViewHolder viewHolder= new ViewHolder();
            viewHolder.Firselect=(TextView)convertView.findViewById(R.id.firselect);
            convertView.setTag(viewHolder);
        }
        else {
            mainviewholder=(ViewHolder)convertView.getTag();
            mainviewholder.Firselect.setText(getItem(position));
        }
        return convertView;
    }
}

