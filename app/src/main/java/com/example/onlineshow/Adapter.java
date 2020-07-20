package com.example.onlineshow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter. Viewholder> {
    private List<Modelclass> modelclassList;

    public Adapter(List<Modelclass> modelclassList)
    {
        this.modelclassList = modelclassList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup,false);
       return new Viewholder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int position) {
        int resource = modelclassList.get(position).getImageIcon();
        String tittle = modelclassList.get(position).getTittle();
        String body = modelclassList.get(position).getBody();
        viewholder.setData(resource, tittle, body);
    }
    @Override
    public int getItemCount() {
        return modelclassList.size();
    }

     class Viewholder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView tittle;
        private TextView body;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tittle = itemView.findViewById(R.id.textTittle);
            body = itemView.findViewById(R.id.textBody);
        }

        private void setData(int imageResource, String titleText, String bodyText){
            imageView.setImageResource(imageResource);
            tittle.setText(titleText);
            body.setText(bodyText);
        }

    }

}
