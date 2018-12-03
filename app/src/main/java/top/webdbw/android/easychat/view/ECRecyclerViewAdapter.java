package top.webdbw.android.easychat.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import top.webdbw.android.easychat.R;
import top.webdbw.android.easychat.model.table.SingleConversation;

public class ECRecyclerViewAdapter extends RecyclerView.Adapter<ECRecyclerViewAdapter.ViewHolder> {

    private List<SingleConversation> mData;
    private Context mContext;

    public ECRecyclerViewAdapter(Context context, List<SingleConversation> data) {
        mData = data;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View container = LayoutInflater.from(mContext).inflate(R.layout.activity_main_list_item, viewGroup, false);
        return new ViewHolder(container);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(mData.get(i).getText());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.main_list_title);
        }
    }
}
