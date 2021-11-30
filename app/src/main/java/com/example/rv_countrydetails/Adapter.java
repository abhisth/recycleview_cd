package com.example.rv_countrydetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private List<details> countrylist;

    public Adapter(List<details>countrylist){this.countrylist = countrylist;}

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int resource = countrylist.get(position).getIvFlag();
        String number = countrylist.get(position).getNumber();
        String country = countrylist.get(position).getCountry();

        holder.setData(resource,number,country);
    }

    @Override
    public int getItemCount() {
        return countrylist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView Flag;
        private TextView telenum;
        private TextView Cname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Flag = itemView.findViewById(R.id.ivFlag);
            telenum = itemView.findViewById(R.id.number);
            Cname = itemView.findViewById(R.id.Country);



        }

        public void setData(int resource, String number, String country) {

            Flag.setImageResource(resource);
            telenum.setText(number);
            Cname.setText(country);
        }
    }
}
