package mx.com.caressing.facebook;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class ContactoAdapter extends Adapter<ContactoAdapter.ViewHolder> {
    private List<Contatco> contatcos;
    private Context context;
    private onitemClickListener listener;

    public ContactoAdapter(List<Contatco> contatcos, onitemClickListener listener) {
        this.contatcos = contatcos;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContactoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.amigo,parent,false);
    context=parent.getContext();
    return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoAdapter.ViewHolder holder, int position) {
        Contatco contatco=contatcos.get(position);
        holder.txtIm.setText(contatco.getTxtImag());
        holder.txtdesc.setText(contatco.getTxtdesc());
        RequestOptions options = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .fitCenter();

        Glide.with(context)
                .load(contatco.getUrlFoto())
                .apply(options)
                .into(holder.imgFoto);
        RequestOptions options1 = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .fitCenter();

        RequestOptions options3 = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .fitCenter();
        Glide.with(context)
                .load(contatco.getImagenfondo())
                .apply(options3)
                .into(holder.imagenfondo);


    }

    @Override
    public int getItemCount() {
        return contatcos.size();

    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgFoto;
        private TextView txtIm;
        private  TextView txtdesc;

        private  ImageView imagenfondo;
        private View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            imagenfondo = itemView.findViewById(R.id.imgFoto2);
            txtIm=itemView.findViewById(R.id.txtNombre);
            txtdesc=itemView.findViewById(R.id.txtdesc);
           
            view= itemView;
        }

}
}

