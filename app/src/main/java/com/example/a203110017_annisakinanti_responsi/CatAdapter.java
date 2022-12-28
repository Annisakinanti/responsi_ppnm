package com.example.a203110017_annisakinanti_responsi;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;

// TODO 3: Class Adapter
public class CatAdapter extends RecyclerView.Adapter<CatAdapter.CatViewHolder>{

    private Context context;
    private List<Model> cats;

    // menginisialisasi list adapter
    public CatAdapter(Context context, List<Model> cats) {
        this.context = context;
        this.cats = cats;
    }

    // membuat fungsi adapter
    @NonNull
    @Override
    public CatAdapter.CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.itempic,parent,false));
    }

    // meload image
    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        Model cat=cats.get(position);
        Picasso.get().load(cat.getUrl()).into(holder.image);
    }

    // mengembalikan jumlah list item
    @Override
    public int getItemCount() {
        return cats.size();
    }

    // mengembalikan list item data
    public void getAllDatas(List<Model> cats)
    {
        this.cats=cats;
    }

    // membhat view holder ke recyclerView
    public static class CatViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView image;

        public CatViewHolder(@NonNull View itemView) {
            super(itemView);

            // membaca image view dan mengembalikan list item image
            image=itemView.findViewById(R.id.imageView);
        }
    }
}