package com.sc.test;

import com.sc.helper.EnumHelper;
import com.sc.sport.championship.Championship;
import com.sc.sport.championship.ChampionshipFormat;
import com.sc.sport.person.Coach;
import com.sc.sport.person.Referee;
import com.sc.sport.team.Team;
import com.sc.sport.types.soccer.*;
import org.hamcrest.Matcher;
import org.joda.time.DateTime;
import org.junit.*;

import java.util.*;


public class TestSoccer {

    @Test
    public void runTest() {

        System.out.println("Inicio TestSoccer");
        int numberTeams = 20;
        System.out.println("numberTeams: " + numberTeams);

        ChampionshipSoccer championshipSoccer = this.createChampionshipSoccer(numberTeams);
        Assert.assertNotNull(championshipSoccer);
        System.out.println("Championship: " + championshipSoccer.getName());

        Map<String, TeamSoccer> teams = championshipSoccer.getTeams();
        Assert.assertEquals(teams.size(), numberTeams);
        System.out.println("### Times participantes ###");
        for (TeamSoccer soccer : teams.values()) {
            System.out.println(soccer.getNickName());
        }

        int rounds = championshipSoccer.getLimitRounds();
        for (int i = 1; i <= rounds; i++) {
            championshipSoccer.getRoundSoccers().add(new RoundSoccer(i, numberTeams / 2,
                    createMatches(championshipSoccer, new ArrayList<>(teams.values()))));
        }

        Assert.assertEquals(championshipSoccer.getRoundSoccers().size(), rounds);
        System.out.println("Fim TestSoccer");
    }


    protected ChampionshipSoccer createChampionshipSoccer(int numberTeams) {

        ChampionshipSoccer championship = new ChampionshipSoccer("Campeonato Brasileiro",
                new DateTime(2019, 05, 01, 16, 00).toDate(),
                new DateTime(2019, 12, 05, 21, 00).toDate(),
                createTeams(numberTeams), new ChampionshipFormat(true, 0, 0,
                0, ChampionshipFormat.Format.ALL_AGAINST_ALL), 20, 11,
                11, 3, 22);

        return championship;
    }


    protected Map<String, TeamSoccer> createTeams(int numberTeams) {
        Map<String, TeamSoccer> teams = new HashMap<>();
        for (int i = 1; i <= numberTeams; i++) {
            TeamSoccer teamSoccer = new TeamSoccer("Team " + i, "T" + i,
                    new DateTime(1914, 8, 26, 0, 0).toDate(),
                    "Rua " + i, 214, EnumHelper.Gender.M);
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


    protected TreeMap<Integer, PlayerSoccer> createNumbersUniform(Set<PlayerSoccer> players) {
        TreeMap<Integer, PlayerSoccer> numbersUniform = new TreeMap<>();
        int uniform = 1;
        for (PlayerSoccer p : players) {
            numbersUniform.put(uniform, p);
            uniform++;
        }
        return numbersUniform;
    }


    /**
     * create matches para ALL_AGAINST_ALL
     *
     * @param championshipSoccer
     * @param teams
     * @return
     */
    protected Set<MatchSoccer> createMatches(ChampionshipSoccer championshipSoccer, List<TeamSoccer> teams) {
        Set<MatchSoccer> matches = new HashSet<>();
        int numberTeams = teams.size();

        for (int i = 0; i < numberTeams; i++) {
            TeamSoccer teamHome = teams.get(0);
            TeamSoccer teamVisitor = teams.get((int) (Math.random() * numberTeams));
            if (!teamVisitor.equals(teamHome)) {
                matches.add(new MatchSoccer(new DateTime(2019, 02, 24, 16, 00),
                        "Estádio Xyz", new Referee("Juiz", "Testando", new DateTime(1980, 05, 01, 10, 00),
                        EnumHelper.Gender.M), false, teamHome, teamVisitor, championshipSoccer));
                System.out.println(teamHome.getNickName() + " X " + teamVisitor.getNickName());
                teams.remove(teamHome);
                teams.remove(teamVisitor);
                numberTeams = teams.size();
            }
            i = 0;
        }

        return matches;
    }
}
