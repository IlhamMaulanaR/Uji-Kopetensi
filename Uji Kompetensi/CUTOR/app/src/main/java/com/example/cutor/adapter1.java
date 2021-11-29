//package com.example.cutor;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageButton;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import org.w3c.dom.Text;
//
//import java.util.List;
//
//public class adapter1 extends RecyclerView.Adapter<adapter1.viewHolder>{
//    private Context context;
//    private List<model> modelList;
//
//    public adapter1(Context context, List<model> modelList) {
//        this.context = context;
//        this.modelList = modelList;
//    }
//
//    @NonNull
//    @Override
//    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup,false);
//        return new viewHolder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull viewHolder holder, int i) {
//         model model = modelList.get(i);
//         holder.tvNama.setText(model.getNama());
//         holder.tvAlamat.setText(model.getAlamat());
//         holder.tvImage.setImageResource(model.getGambar());
//    }
//
//    @Override
//    public int getItemCount() {
//        return modelList.size();
//    }
//
//    public class viewHolder extends RecyclerView.ViewHolder{
//
//        TextView tvNama;
//        TextView tvAlamat;
//        ImageView tvImage;
//
//
//        public viewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            tvNama = itemView.findViewById(R.id.tvnama);
//            tvAlamat = itemView.findViewById(R.id.tvalamat);
//            tvImage = itemView.findViewById(R.id.imgitem);
//        }
//    }
//}
