package com.example.win10.room;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by win10 on 5/8/2018.
 */

class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    List<User> users;
    public UserAdapter(List<User> users) {

        this.users=users;
    }

    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserAdapter.ViewHolder holder, int position) {


        holder.firstname.setText(users.get(position).getFirstname());
        holder.lastname.setText(users.get(position).getLastname());
        holder.email.setText(users.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView firstname;
        public TextView lastname;
        public TextView email;

        public ViewHolder(View itemView) {
            super(itemView);
            firstname=itemView.findViewById(R.id.firstname);
            lastname=itemView.findViewById(R.id.lastname);
            email=itemView.findViewById(R.id.email);


        }
    }
}
