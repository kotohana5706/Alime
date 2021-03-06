package kr.edcan.alime.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import kr.edcan.alime.R;
import kr.edcan.alime.databinding.MainCommonListviewContentBinding;
import kr.edcan.alime.models.PageList;

/**
 * Created by JunseokOh on 2016. 8. 14..
 */
public class NoticeListAdapter extends ArrayAdapter<PageList> {
    ArrayList<PageList> arrayList;
    LayoutInflater inflater;
    public NoticeListAdapter(Context context, ArrayList<PageList> arrayList) {
        super(context, 0, arrayList);
        this.arrayList = arrayList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PageList data = arrayList.get(position);
        MainCommonListviewContentBinding listBind = DataBindingUtil.inflate(inflater, R.layout.main_common_listview_content, parent, false);
        listBind.commonDoubleText.setPrimaryText(data.getTitle());
        listBind.commonDoubleText.setSubText(data.getDate());
        return listBind.getRoot();
    }
}
