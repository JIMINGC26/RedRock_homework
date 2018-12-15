package com.example.redrock_homework;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {
    private List<Team> mTeamList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView teamName;

        public ViewHolder(@NonNull View view) {
            super(view);
            teamName = (TextView) view.findViewById(R.id.team_name);
        }
    }


    public TeamAdapter(List<Team> teamList) {
        mTeamList = teamList;
    }

   @NonNull
   @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.team_name, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Team team = mTeamList.get(position);
        holder.teamName.setText(team.getName());
    }

    @Override
    public int getItemCount() {
        return mTeamList.size();
    }
}

