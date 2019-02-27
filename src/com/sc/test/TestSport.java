package com.sc.test;

public class TestSport {

    /*static Team team = createTeam();
    static Sport sport = createSport();
    static Set<Player> players = createPlayers();
    static Coach coach = createManager();

    public static void main(String[] args) {
        team.setNumbersUniform(createNumbersUniform(team.getPlayers()));


    }

    static Sport createSport(){
        return new Sport("Futebol",
                "é um desporto de equipe jogado entre dois times de 11 jogadores cada um e um árbitro " +
                        "que se ocupa da correta aplicação das normas. É considerado o desporto mais popular do mundo, " +
                        "pois cerca de 270 milhões de pessoas participam das suas várias competições.",
                new DateTime(1863,01,01,00,00).toDate(),
                "England", Sport.Type.TEAM, Sport.Score.GOALS);
    }

    static Team createTeam(){
        return new Team("Sociedade Esportiva Palmeiras", "Palmeiras", sport, players, coach,
                new DateTime(1914, 8, 26, 0, 0).toDate(),
                "Rua Palestra Itália - Perdizes - São Paulo", 214);
    }

    static Coach createManager(){
        return new Coach("Luiz", "Felipe Scolari",
                new DateTime(1948, 11, 9, 0, 0),
                "12345678901", team, new DateTime(2019, 8, 1, 0, 0).toDate(),
                new DateTime(2021, 12, 31, 23, 59).toDate());
    }

    static Set<Player> createPlayers(){
        Set<Player> players = new HashSet<>();
        players.add(new Player("Player1", "P1",
                new DateTime(1986, 10, 8, 10, 45),
                "34118749881", true, Player.TypePlayer.TITULAR, team));
        players.add(new Player("Player2", "P2",
                new DateTime(1985, 3, 10, 9, 45),
                "34118749880", false, Player.TypePlayer.TITULAR, team));
        players.add(new Player("Player3", "P3",
                new DateTime(1987, 7, 21, 20, 45),
                "34118749872", false, Player.TypePlayer.TITULAR, team));
        players.add(new Player("Player4", "P4",
                new DateTime(1983, 9, 12, 12, 45),
                "34118749862", false, Player.TypePlayer.TITULAR, team));
        players.add(new Player("Player5", "P5",
                new DateTime(1982, 6, 18, 13, 45),
                "34118749852", false, Player.TypePlayer.TITULAR, team));
        players.add(new Player("Player6", "P6",
                new DateTime(1990, 8, 11, 18, 45),
                "34118749842", false, Player.TypePlayer.TITULAR, team));
        players.add(new Player("Player7", "P7",
                new DateTime(1991, 7, 31, 5, 45),
                "34118749832", false, Player.TypePlayer.TITULAR, team));
        players.add(new Player("Player8", "P8",
                new DateTime(1988, 6, 14, 8, 45),
                "34118749822", false, Player.TypePlayer.TITULAR, team));
        players.add(new Player("Player9", "P9",
                new DateTime(1985, 2, 22, 1, 45),
                "34118749812", false, Player.TypePlayer.TITULAR, team));
        players.add(new Player("Player10", "P10",
                new DateTime(1986, 11, 24, 19, 45),
                "34118749992", false, Player.TypePlayer.TITULAR, team));
        players.add(new Player("Player11", "P11",
                new DateTime(2000, 12, 1, 9, 45),
                "34118749782", false, Player.TypePlayer.TITULAR, team));
        players.add(new Player("Player12", "P12",
                new DateTime(1985, 4, 12, 6, 45),
                "34118749582", false, Player.TypePlayer.RESERVE, team));
        players.add(new Player("Player13", "P13",
                new DateTime(1988, 4, 15, 6, 45),
                "34118741282", false, Player.TypePlayer.RESERVE, team));
        players.add(new Player("Player14", "P14",
                new DateTime(1980, 3, 15, 3, 45),
                "34118743482", false, Player.TypePlayer.RESERVE, team));
        players.add(new Player("Player15", "P15",
                new DateTime(1989, 2, 15, 6, 45),
                "34118745682", false, Player.TypePlayer.RESERVE, team));
        players.add(new Player("Player16", "P16",
                new DateTime(1985, 11, 15, 7, 45),
                "34118747882", false, Player.TypePlayer.RESERVE, team));
        players.add(new Player("Player17", "P17",
                new DateTime(1995, 1, 15, 8, 45),
                "34118749082", false, Player.TypePlayer.RESERVE, team));
        players.add(new Player("Player18", "P18",
                new DateTime(1991, 12, 12, 12, 45),
                "34118743382", false, Player.TypePlayer.RESERVE, team));
        return players;
    }

    static TreeMap<Integer, Player> createNumbersUniform(Set<Player> players){
        TreeMap<Integer, Player> numbersUniform = new TreeMap<>();
        int uniform = 1;
        for (Player p : players) {
            numbersUniform.put(uniform, p);
            uniform++;
        }
        return numbersUniform;
    }*/

    public static void main(String[] args) {
        int rounds = 2;
        int numberClassifieds = 0;
        int playoffs = 0;
        while(numberClassifieds / rounds > 0) {
            playoffs += numberClassifieds;
            numberClassifieds = numberClassifieds / rounds;
        }
        System.out.println(playoffs);
    }


}
