package com.tugasakhir.arpan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DaftarPahlawanAdapter extends RecyclerView.Adapter<DaftarPahlawanAdapter.ListViewHolder>{
    private ArrayList<Pahlawan> listPahlawan;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public DaftarPahlawanAdapter(ArrayList<Pahlawan> list) {
        this.listPahlawan = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_pahlawan, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Pahlawan pahlawan = listPahlawan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(pahlawan.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(pahlawan.getName());
        holder.tvDetail.setText(pahlawan.getDetail());
        holder.tvDetails.setText("");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPahlawan.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPahlawan.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvDetail;
        TextView tvDetails;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_pahlawan);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvDetail = itemview.findViewById(R.id.tv_detail);
            tvDetails = itemview.findViewById(R.id.tv_details);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Pahlawan data);
    }
}
