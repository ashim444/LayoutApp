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
    private List<CharacterClass> delivaryCharacter;

    public DeliveryAdapter(List<CharacterClass> delivaryCharacter) {
        this.delivaryCharacter = delivaryCharacter;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View delivaryView = LayoutInflater.from(context).inflate(R.layout.list_item_delivery, parent, false);
        return new ViewHolder(delivaryView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CharacterClass delivaryCharacterClass = delivaryCharacter.get(holder.getAdapterPosition());
        holder.iconImage.setImageResource(delivaryCharacterClass.getCharacterClassImage());
        holder.iconOk.setImageResource(delivaryCharacterClass.getCharacterImageTwo());
        holder.iconTextHeading.setText(delivaryCharacterClass.getCharacterClassDummyTextOne());
        holder.iconTextHeadingInfo.setText(delivaryCharacterClass.getCharacterClassDummyTextTwo());
    }

    @Override
    public int getItemCount() {
        return delivaryCharacter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView iconImage;
        public TextView iconTextHeading;
        public TextView iconTextHeadingInfo;
        public ImageView iconOk;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iconImage = itemView.findViewById(R.id.item_delivary_icon);
            iconTextHeading = itemView.findViewById(R.id.item_delivary_icon_text_heading);
            iconTextHeadingInfo = itemView.findViewById(R.id.item_delivary_icon_info);
            iconOk = itemView.findViewById(R.id.item_delivery_ok_icon);

        }
    }

}
