package com.sc.test;

import com.sc.helper.EnumHelper;
import com.sc.sport.championship.Championship;
import com.sc.sport.championship.ChampionshipFormat;
import com.sc.sport.person.Coach;
import com.sc.sport.types.soccer.PlayerSoccer;
import com.sc.sport.types.soccer.TeamSoccer;
import org.joda.time.DateTime;
import org.junit.*;

import java.util.*;


public class TestSoccer {

    @Test
    public void runTest(){
        System.out.println("Inicio TestSoccer");
        int numberTeams = 20;
        System.out.println("numberTeams: " + numberTeams);

        Championship<TeamSoccer> championship = this.createChampionship(numberTeams);
        System.out.println(championship.getName());
        Assert.assertNotNull(championship);

        Map<String, TeamSoccer> teams = championship.getTeams();
        System.out.println("### Times participantes ###");
        for (TeamSoccer soccer : teams.values()){
            System.out.println(soccer.getNickName());
        }
        Assert.assertEquals(teams.size(), numberTeams);

        System.out.println("Fim TestSoccer");
    }


    protected Championship<TeamSoccer> createChampionship(int numberTeams){

        Championship<TeamSoccer> championship = new Championship<TeamSoccer>("Campeonato Brasileiro",
                new DateTime(2019, 03, 01, 16, 00).toDate(),
                new DateTime(2019, 05, 01, 18, 00).toDate(),
                createTeams(numberTeams), new ChampionshipFormat(true,0,0,
                0, ChampionshipFormat.Format.ALL_AGAINST_ALL));

        return championship;
    }


    protected Map<String, TeamSoccer> createTeams(int numberTeams){
        Map<String, TeamSoccer> teams = new HashMap<>();
        for (int i=0; i < numberTeams; i++){
            TeamSoccer teamSoccer = new TeamSoccer("Team " +i, "T" +i,
                    new DateTime(1914, 8, 26, 0, 0).toDate(),
                    "Rua T1", 214, EnumHelper.Gender.M);
            teamSoccer.setPlayers(createPlayers());
            teamSoccer.setNumbersUniform(createNumbersUniform(teamSoccer.getPlayers()));
            teamSoccer.setCoach(createCoach("Coach " + i, teamSoccer.getFullName()));
            teams.put(teamSoccer.getNickName(), teamSoccer);
        }
        return teams;
    }

    protected Coach createCoach(String firstName, String lastName) {

        return new Coach(firstName, lastName,
                new DateTime(1965, 02, 02, 0, 0),
                EnumHelper.Gender.M);
    }


    protected Set<PlayerSoccer> createPlayers() {
        Set<PlayerSoccer> players = new HashSet<>();
        players.add(new PlayerSoccer("Player1", "P1",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.TITULAR, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.GK, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player2", "P2",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.TITULAR, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.CB, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player3", "P3",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.TITULAR, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.CB, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player4", "P4",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.TITULAR, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.RB, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player5", "P5",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.TITULAR, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.LB, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player6", "P6",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.TITULAR, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.CDM, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player7", "P7",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.TITULAR, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.CM, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player8", "P8",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.TITULAR, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.CM, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player9", "P9",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.TITULAR, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.RM, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player10", "P10",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.TITULAR, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.LM, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player11", "P11",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.TITULAR, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.CF, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player12", "P12",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.RESERVE, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.GK, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player13", "P13",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.RESERVE, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.CB, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player14", "P14",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.RESERVE, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.CB, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player15", "P15",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.RESERVE, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.RB, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player16", "P16",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.RESERVE, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.LB, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player17", "P17",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.RESERVE, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.CM, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player18", "P18",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.RESERVE, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.CM, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player19", "P19",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.RESERVE, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.CM, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player20", "P20",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.RESERVE, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.RW, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player21", "P21",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.RESERVE, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.LW, PlayerSoccer.Foot.RIGHT));
        players.add(new PlayerSoccer("Player22", "P22",
                new DateTime(1986, 10, 8, 10, 45),
                EnumHelper.TypePlayer.RESERVE, EnumHelper.Gender.M, 70, 1.80, PlayerSoccer.Position.ST, PlayerSoccer.Foot.RIGHT));
        return players;

    }


    protected TreeMap<Integer, PlayerSoccer> createNumbersUniform(Set<PlayerSoccer> players){
        TreeMap<Integer, PlayerSoccer> numbersUniform = new TreeMap<>();
        int uniform = 1;
        for (PlayerSoccer p : players) {
            numbersUniform.put(uniform, p);
            uniform++;
        }
        return numbersUniform;
    }

}
