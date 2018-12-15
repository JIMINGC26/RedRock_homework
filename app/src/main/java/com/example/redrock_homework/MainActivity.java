package com.example.redrock_homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Team> teamList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTeam();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        TeamAdapter adapter = new TeamAdapter(teamList);
        recyclerView.setAdapter(adapter);
        StaggeredGridLayoutManager layoutManager1=new
                StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);

    }

    private void initTeam() {
        for (int i = 0; i < 2; i++) {
            Team hou = new Team(
                    getRandomLengthName("火箭"));
            teamList.add(hou);
            Team gs = new Team(
                    getRandomLengthName("勇士"));
            teamList.add(gs);
            Team Lal = new Team(
                    getRandomLengthName("湖人"));
            teamList.add(Lal);
            Team cav = new Team(
                    getRandomLengthName("骑士"));
            teamList.add(cav);
            Team th = new Team(
                    getRandomLengthName("鹈鹕"));
            teamList.add(th);
            Team hx = new Team(
                    getRandomLengthName("灰熊"));
            teamList.add(hx);
            Team js = new Team(
                    getRandomLengthName("爵士"));
            teamList.add(js);
            Team okc = new Team(
                    getRandomLengthName("雷霆"));
            teamList.add(okc);
            Team tw = new Team(
                    getRandomLengthName("森林狼"));
            teamList.add(tw);
            Team gw = new Team(
                    getRandomLengthName("国王"));
            teamList.add(gw);
            Team ss = new Team(
                    getRandomLengthName("太阳"));
            teamList.add(ss);
            Team ktz = new Team(
                    getRandomLengthName("开拓者"));
            teamList.add(ktz);
            Team dxx = new Team(
                    getRandomLengthName("独行侠"));
            teamList.add(dxx);
            Team lca = new Team(
                    getRandomLengthName("快船"));
            teamList.add(lca);
            Team sa = new Team(
                    getRandomLengthName("马刺"));
            teamList.add(sa);
            Team kr = new Team(
                    getRandomLengthName("凯尔特人"));
            teamList.add(kr);
            Team pit = new Team(
                   getRandomLengthName("活塞"));
            teamList.add(pit);
            Team ml = new Team(
                   getRandomLengthName("猛龙"));
            teamList.add(ml);
            Team ms = new Team(
                    getRandomLengthName("魔术"));
            teamList.add(ms);
            Team rh = new Team(
                    getRandomLengthName("热火"));
            teamList.add(rh);
            Team bxz = new Team(
                   getRandomLengthName("步行者"));
            teamList.add(bxz);
            Team ph = new Team(
                    getRandomLengthName("76人"));
            teamList.add(ph);
            Team gn = new Team(
                   getRandomLengthName("公牛"));
            teamList.add(gn);
            Team nks = new Team(
                    getRandomLengthName("尼克斯"));
            teamList.add(nks);
            Team lw = new Team(
                    getRandomLengthName("篮网"));
            teamList.add(lw);
            Team hf = new Team(
                    getRandomLengthName("黄蜂"));
            teamList.add(hf);
            Team xl = new Team(
                    getRandomLengthName("雄鹿"));
            teamList.add(xl);
            Team qc = new Team(
                    getRandomLengthName("奇才"));
            teamList.add(qc);
            Team ly = new Team(
                    getRandomLengthName("老鹰"));
            teamList.add(ly);
        }
    }
    private String getRandomLengthName(String name){
        Random random =new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder =new StringBuilder();
        for(int i= 0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
}
