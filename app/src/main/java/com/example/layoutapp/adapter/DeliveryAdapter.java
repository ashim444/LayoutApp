package com.example.layoutapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.layoutapp.R;
import com.example.layoutapp.model.CharacterClass;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DeliveryAdapter extends RecyclerView.Adapter<DeliveryAdapter.ViewHolder> {
    private List<CharacterClass> deliveryCharacter;

    public DeliveryAdapter(List<CharacterClass> deliveryCharacter) {
        this.deliveryCharacter = deliveryCharacter;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View delivaryView = LayoutInflater.from(context).inflate(R.layout.list_item_delivery, parent, false);
        return new ViewHolder(delivaryView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CharacterClass deliveryCharacterClass = deliveryCharacter.get(holder.getAdapterPosition());
        holder.iconImage.setImageResource(deliveryCharacterClass.getCharacterClassImage());
        holder.iconOk.setImageResource(deliveryCharacterClass.getCharacterImageTwo());
        holder.iconTextHeading.setText(deliveryCharacterClass.getCharacterClassDummyTextOne());
        holder.iconTextHeadingInfo.setText(deliveryCharacterClass.getCharacterClassDummyTextTwo());
    }

    @Override
    public int getItemCount() {
        return deliveryCharacter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView            iconImage;
        public TextView             iconTextHeading;
        public TextView             iconTextHeadingInfo;
        public ImageView            iconOk;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iconImage                   = itemView.findViewById(R.id.item_delivery_icon);
            iconTextHeading             = itemView.findViewById(R.id.item_delivery_icon_text_heading);
            iconTextHeadingInfo         = itemView.findViewById(R.id.item_delivery_icon_info);
            iconOk = itemView.findViewById(R.id.item_delivery_ok_icon);

        }
    }
}
