package com.example.layoutapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder>{

    private List<SecondCharacter> secondadapter_character;

    public SecondAdapter(List<SecondCharacter> secondadapter_character) {
        this.secondadapter_character = secondadapter_character;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView viewholderImageView;
        public TextView viewholderDateInfo;
        public TextView viewholderInfoText;

        public ViewHolder(View itemView) {
            super(itemView);
            viewholderImageView = itemView.findViewById(R.id.listtemsecond_image);
            viewholderDateInfo = itemView.findViewById(R.id.listitemsecond_text);
            viewholderInfoText = itemView.findViewById(R.id.listitemsecond_text2);
        }
    }


    @Override
    public SecondAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View secondView = inflater.inflate(R.layout.list_item_second, parent, false);

        ViewHolder viewHolder = new ViewHolder(secondView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SecondCharacter secondAdapterCharacter = secondadapter_character.get(position);


        ImageView secondAdapterImage = holder.viewholderImageView;
        secondAdapterImage.setImageResource(secondAdapterCharacter.getSecondCharacterImage());

        TextView secondAdapterText = holder.viewholderDateInfo;
        secondAdapterText.setText(secondAdapterCharacter.getSecondCharacterText());

        TextView secondAdapterdatetext = holder.viewholderInfoText;
        secondAdapterdatetext.setText(secondAdapterCharacter.getSecondCharacterText2());
    }

    @Override
    public int getItemCount() {
        return secondadapter_character.size();
    }
}
