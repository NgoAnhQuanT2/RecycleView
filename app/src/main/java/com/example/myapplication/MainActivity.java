package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvTeams;
    List<FootballTeam> teamList = new ArrayList<>();
    MyAdapter adapter;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTeams = (RecyclerView) findViewById(R.id.rvFootballTeamInfo);

        setTeamData();

        adapter = new MyAdapter(teamList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext());
        rvTeams.setLayoutManager(manager);
        rvTeams.setAdapter(adapter);
    }

    private void setTeamData() {
        FootballTeam team = new FootballTeam("Manchester United", "English Premier League", 1878);
        teamList.add(team);

        team = new FootballTeam("Arsenal", "English Premier League", 1886);
        teamList.add(team);

        team = new FootballTeam("Liverpool", "English Premier League", 1892);
        teamList.add(team);

        team = new FootballTeam("Juventus", "Serie A", 1897);
        teamList.add(team);

        team = new FootballTeam("Real Madrid", "La Liga", 1902);
        teamList.add(team);

        team = new FootballTeam("Bayern Munich", "Bundesliga", 1900);
        teamList.add(team);

        team = new FootballTeam("PSG", "France Ligue 1", 1970);
        teamList.add(team);

        team = new FootballTeam("Ajax", "Eredivisie", 1900);
        teamList.add(team);
    }
}