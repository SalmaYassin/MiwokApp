package com.example.android.miwok;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerAdapter  extends RecyclerView.Adapter<TestRecyclerAdapter.SalmaHolder> {
    private ArrayList<Word> mDataset;
    private ItemClickListener onItemClickListener;

    public TestRecyclerAdapter(ItemClickListener listener, ArrayList<Word> myDataset) {
        mDataset = myDataset;
        onItemClickListener = listener;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public SalmaHolder onCreateViewHolder(ViewGroup parent,
                                          int viewType) {
        // create a new view
        View rootView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.word_item, parent, false);

        return new SalmaHolder(rootView, onItemClickListener);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(SalmaHolder holder, int position) {
        holder.setDatainView(mDataset.get(position));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }


    public static class SalmaHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView name;
        ItemClickListener itemClickListener;
        public ImageView icon;
        View rootView;

        public SalmaHolder(View v, final ItemClickListener itemClickListener) {
            super(v);
            rootView = v;
            this.itemClickListener= itemClickListener;
            name = v.findViewById(R.id.item_name);
            icon = v.findViewById(R.id.item_icon);


        }

        void setDatainView(final Word data) {

            name.setText(data.getDefaultTranslation());
            icon.setImageResource(data.getImageResourceId());
            rootView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemClickListener.onItemClick(data);
                }
            });
        }
    }

    interface ItemClickListener {
        void onItemClick(Word word);
    }
}
