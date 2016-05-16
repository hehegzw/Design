package gzw.cn.design.main.model;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import gzw.cn.design.R;

/**
 * Created by gzw on 2016/5/16.
 */
public class MainAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<String> strings;
    private OnitemClick onitemClick;

    public MainAdapter(Context context, List<String> strings) {
        this.context = context;
        this.strings = strings;
    }

    public void setOnitemClick(OnitemClick onitemClick) {
        this.onitemClick = onitemClick;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sub_fragment1,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
    private class Holder extends RecyclerView.ViewHolder{
        private TextView textView;
        public Holder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onitemClick.onClick(v);
                }
            });
        }
    }
    public interface OnitemClick{
        void onClick(View view);
    }
}
