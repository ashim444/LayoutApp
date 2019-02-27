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
import androidx.recyclerview.widget.RecyclerView;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder> {

    private List<CharacterClass> secondAdapterCharacter;

    public SecondAdapter(List<CharacterClass> secondAdapterCharacter) {
        this.secondAdapterCharacter = secondAdapterCharacter;
    }

    @Override
    public SecondAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View secondView = inflater.inflate(R.layout.list_item_second, parent, false);
        ViewHolder viewHolder = new ViewHolder(secondView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CharacterClass secondAdapterCharacter = this.secondAdapterCharacter.get(holder.getAdapterPosition());
        holder.dummyImageView.setImageResource(secondAdapterCharacter.getCharacterClassImage());
        holder.dummyDateInfo.setText(secondAdapterCharacter.getCharacterClassDummyTextOne());
        holder.dummyInfoText.setText(secondAdapterCharacter.getCharacterClassDummyTextTwo());
    }

    @Override
    public int getItemCount() {
        return secondAdapterCharacter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView dummyImageView;
        public TextView dummyDateInfo;
        public TextView dummyInfoText;

        public ViewHolder(View itemView) {
            super(itemView);
            dummyImageView = itemView.findViewById(R.id.item_second_image);
            dummyDateInfo = itemView.findViewById(R.id.item_second_text_date);
            dummyInfoText = itemView.findViewById(R.id.item_second_text);
        }
    }
}
