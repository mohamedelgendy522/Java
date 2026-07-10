package teamformation;

import java.util.*;
class Player {
    byte age;
    String name;

    String club;
}

class goalKeeper extends Player{
    goalKeeper(boolean isTall){
        this.isTall = isTall;
        name = "hossam";
        age = 0;
        club = "AL AHLY";
    }
    boolean isTall;
    void setTall(boolean isTall){
        this.isTall = isTall;
    }
    boolean getTall(){
        return isTall;
    }
    public static void Print(goalKeeper[] goalKeepers) {
        for (int i = 0; i < goalKeepers.length; i++) {
            System.out.println( i + ". "+"teamformation.Player Name : " + goalKeepers[i].name + " teamformation.Player club : " + goalKeepers[i].club + " teamformation.Player age : " + goalKeepers[i].age);
        }
    }

    public void print_player_details(goalKeeper goalKeeper) {
        System.out.println("isTall : " + goalKeeper.isTall);
    }
}

class Defender extends Player {

    Defender(boolean isTall,boolean isFast,boolean isPhysical){
        this.isTall = isTall;
        this.isFast = isFast;
        this.isPhysical = isPhysical;
        name = "hossam";
        age = 0;
        club = "AL AHLY";
    }
    private boolean isTall;
    private boolean isFast;
    private boolean isPhysical;

    enum Position{CB, LB, RB}

    private Position position;

    public boolean isTall() {
        return isTall;
    }

    public void setTall(boolean tall) {
        isTall = tall;
    }

    public boolean isFast() {
        return isFast;
    }

    public void setFast(boolean fast) {
        isFast = fast;
    }

    public boolean isPhysical() {
        return isPhysical;
    }

    public void setPhysical(boolean physical) {
        isPhysical = physical;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public static void Print(Defender[] defenders, String pos) {
        for (int i = 0; i < defenders.length; i++) {
            if (defenders[i].position.toString().equals(pos)) {
                System.out.println( i + ". "+"teamformation.Player Name : " + defenders[i].name + " teamformation.Player club : " + defenders[i].club + " teamformation.Player age : " + defenders[i].age);
            }
        }
    }

    public void print_player_details(Defender defender) {
        System.out.println("isTall : " + defender.isTall + " isFast : " + defender.isFast + " isPhysical : " + defender.isPhysical);
    }

}

class Midfielders extends Player{
    private boolean isPasser;
    private boolean isScanner;
    private boolean isDribbler;


    enum Position {CDM, CAM, CM}

    private Position position;
    Midfielders(boolean isDribbler,boolean isPasser,boolean isScanner){
        this.isPasser = isPasser;
        this.isDribbler = isDribbler;
        this.isScanner = isScanner;
        name = "hossam";
        age = 0;
        club = "AL AHLY";
    }

    public boolean isPasser() {
        return isPasser;
    }

    public void setPasser(boolean passer) {
        isPasser = passer;
    }

    public boolean isScanner() {
        return isScanner;
    }

    public void setScanner(boolean scanner) {
        isScanner = scanner;
    }

    public boolean isDribbler() {
        return isDribbler;
    }

    public void setDribbler(boolean dribbler) {
        isDribbler = dribbler;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public static void Print(Midfielders[] midfielders, String pos) {
        for (int i = 0; i < midfielders.length; i++) {
            if (midfielders[i].position.toString().equals(pos)) {
                System.out.println( i + ". "+"teamformation.Player Name : " + midfielders[i].name + " teamformation.Player club : " + midfielders[i].club + " teamformation.Player age : " + midfielders[i].age);
            }
        }
    }

    public void print_player_details(Midfielders midfielder) {
        System.out.println("isPasser : " + midfielder.isPasser + " isScanner : " + midfielder.isScanner + " isDribbler : " + midfielder.isDribbler);
    }
}

class Striker extends Player{

    private static byte countPlayers;

    private boolean isFinisher;
    private boolean isHeader;
    private boolean isDribbler;
    private boolean isFast;

    Striker(boolean isFinisher,boolean isFast,boolean isHeader,boolean isDribbler){
        this.isFinisher = isFinisher;
        this.isFast = isFast;
        this.isHeader = isHeader;
        this.isDribbler = isDribbler;
        name = "hossam";
        age = 0;
        club = "AL AHLY";
    }

    enum Position {LW, RW, CF}

    private Position position;

    public boolean isFinisher() {
        return isFinisher;
    }

    public void setFinisher(boolean finisher) {
        isFinisher = finisher;
    }

    public boolean isHeader() {
        return isHeader;
    }

    public void setHeader(boolean header) {
        isHeader = header;
    }

    public boolean isDribbler() {
        return isDribbler;
    }

    public void setDribbler(boolean dribbler) {
        isDribbler = dribbler;
    }

    public boolean isFast() {
        return isFast;
    }

    public void setFast(boolean fast) {
        isFast = fast;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public static void Print(Striker[] strikers , String pos){
        for (int i = 0 ; i < strikers.length ; i++){
            if(strikers[i].position.toString().equals(pos))
            System.out.println( i + ". " + " teamformation.Player Name : " + strikers[i].name + " teamformation.Player club : " + strikers[i].club + " teamformation.Player age : " + strikers[i].age);
        }
    }

    public void print_player_details(Striker striker){
        System.out.println("isHeader : " + striker.isHeader + " isDribbler : " + striker.isDribbler + " isFinisher : " + striker.isFinisher + " isFast : " + striker.isFast);
    }

}

public class Main {

    void GK_data(goalKeeper[] goalKeepers){
        goalKeepers[0] = new goalKeeper(true);
        goalKeepers[0].name = "Alisson";
        goalKeepers[0].age = 32;
        goalKeepers[0].club = "Liverpool";

        goalKeepers[1] = new goalKeeper(true);
        goalKeepers[1].name = "Ederson";
        goalKeepers[1].age = 31;
        goalKeepers[1].club = "Manchester City";

        goalKeepers[2] = new goalKeeper(true);
        goalKeepers[2].name = "Courtois";
        goalKeepers[2].age = 33;
        goalKeepers[2].club = "Real Madrid";

        goalKeepers[3] = new goalKeeper(true);
        goalKeepers[3].name = "Donnarumma";
        goalKeepers[3].age = 26;
        goalKeepers[3].club = "PSG";

        goalKeepers[4] = new goalKeeper(true);
        goalKeepers[4].name = "Ter Stegen";
        goalKeepers[4].age = 33;
        goalKeepers[4].club = "Barcelona";

        goalKeepers[5] = new goalKeeper(true);
        goalKeepers[5].name = "Maignan";
        goalKeepers[5].age = 30;
        goalKeepers[5].club = "AC Milan";

        goalKeepers[6] = new goalKeeper(true);
        goalKeepers[6].name = "Emiliano Martinez";
        goalKeepers[6].age = 33;
        goalKeepers[6].club = "Aston Villa";

        goalKeepers[7] = new goalKeeper(true);
        goalKeepers[7].name = "Neuer";
        goalKeepers[7].age = 40;
        goalKeepers[7].club = "Bayern Munich";

        goalKeepers[8] = new goalKeeper(true);
        goalKeepers[8].name = "Diogo Costa";
        goalKeepers[8].age = 27;
        goalKeepers[8].club = "Porto";

        goalKeepers[9] = new goalKeeper(true);
        goalKeepers[9].name = "Onana";
        goalKeepers[9].age = 30;
        goalKeepers[9].club = "Manchester United";
    }
    void center_data(Defender[] defenders){
        defenders[0] = new Defender(true,true,true);
        defenders[0].setPosition(Defender.Position.CB);
        defenders[0].name = "Van Dijk";
        defenders[0].age = 34;
        defenders[0].club = "Liverpool";

        defenders[1] = new Defender(true,true,true);
        defenders[1].setPosition(Defender.Position.CB);
        defenders[1].name = "Rudiger";
        defenders[1].age = 32;
        defenders[1].club = "Real Madrid";

        defenders[2] = new Defender(true,true,true);
        defenders[2].setPosition(Defender.Position.CB);
        defenders[2].name = "Saliba";
        defenders[2].age = 24;
        defenders[2].club = "Arsenal";

        defenders[3] = new Defender(true,true,true);
        defenders[3].setPosition(Defender.Position.CB);
        defenders[3].name = "Bastoni";
        defenders[3].age = 26;
        defenders[3].club = "Inter Milan";

        defenders[4] = new Defender(true,true,true);
        defenders[4].setPosition(Defender.Position.CB);
        defenders[4].name = "Araujo";
        defenders[4].age = 26;
        defenders[4].club = "Barcelona";

// LB
        defenders[5] = new Defender(false,true,false);
        defenders[5].setPosition(Defender.Position.LB);
        defenders[5].name = "Alphonso Davies";
        defenders[5].age = 24;
        defenders[5].club = "Bayern Munich";

        defenders[6] = new Defender(false,true,false);
        defenders[6].setPosition(Defender.Position.LB);
        defenders[6].name = "Theo Hernandez";
        defenders[6].age = 27;
        defenders[6].club = "AC Milan";

        defenders[7] = new Defender(false,true,false);
        defenders[7].setPosition(Defender.Position.LB);
        defenders[7].name = "Grimaldo";
        defenders[7].age = 29;
        defenders[7].club = "Leverkusen";

        defenders[8] = new Defender(false,true,false);
        defenders[8].setPosition(Defender.Position.LB);
        defenders[8].name = "Nuno Mendes";
        defenders[8].age = 23;
        defenders[8].club = "PSG";

        // RB
        defenders[9] = new Defender(false,true,false);
        defenders[9].setPosition(Defender.Position.RB);
        defenders[9].name = "Hakimi";
        defenders[9].age = 26;
        defenders[9].club = "PSG";

        defenders[10] = new Defender(false,true,false);
        defenders[10].setPosition(Defender.Position.RB);
        defenders[10].name = "Trent";
        defenders[10].age = 27;
        defenders[10].club = "Liverpool";

        defenders[11] = new Defender(false,true,false);
        defenders[11].setPosition(Defender.Position.RB);
        defenders[11].name = "Frimpong";
        defenders[11].age = 25;
        defenders[11].club = "Liverpool";

        defenders[12] = new Defender(false,true,false);
        defenders[12].setPosition(Defender.Position.RB);
        defenders[12].name = "Reece James";
        defenders[12].age = 26;
        defenders[12].club = "Chelsea";

        defenders[13] = new Defender(false,true,false);
        defenders[13].setPosition(Defender.Position.RB);
        defenders[13].name = "Kounde";
        defenders[13].age = 27;
        defenders[13].club = "Barcelona";

        defenders[14] = new Defender(false,true,false);
        defenders[14].setPosition(Defender.Position.RB);
        defenders[14].name = "Walker";
        defenders[14].age = 35;
        defenders[14].club = "Burnley";
    }
    void mid(Midfielders[] midfielders){
// CDM
        midfielders[0] = new Midfielders(false,true,true);
        midfielders[0].setPosition(Midfielders.Position.CDM);
        midfielders[0].name = "Rodri";
        midfielders[0].age = 29;
        midfielders[0].club = "Manchester City";

        midfielders[1] = new Midfielders(false,true,true);
        midfielders[1].setPosition(Midfielders.Position.CDM);
        midfielders[1].name = "Rice";
        midfielders[1].age = 26;
        midfielders[1].club = "Arsenal";

        midfielders[2] = new Midfielders(false,true,true);
        midfielders[2].setPosition(Midfielders.Position.CDM);
        midfielders[2].name = "Tchouameni";
        midfielders[2].age = 25;
        midfielders[2].club = "Real Madrid";

        midfielders[3] = new Midfielders(false,true,true);
        midfielders[3].setPosition(Midfielders.Position.CDM);
        midfielders[3].name = "Kimmich";
        midfielders[3].age = 31;
        midfielders[3].club = "Bayern Munich";

        midfielders[4] = new Midfielders(false,true,true);
        midfielders[4].setPosition(Midfielders.Position.CDM);
        midfielders[4].name = "Zubimendi";
        midfielders[4].age = 27;
        midfielders[4].club = "Real Sociedad";

// CM
        midfielders[5] = new Midfielders(true,true,true);
        midfielders[5].setPosition(Midfielders.Position.CM);
        midfielders[5].name = "Pedri";
        midfielders[5].age = 23;
        midfielders[5].club = "Barcelona";

        midfielders[6] = new Midfielders(true,true,true);
        midfielders[6].setPosition(Midfielders.Position.CM);
        midfielders[6].name = "Valverde";
        midfielders[6].age = 27;
        midfielders[6].club = "Real Madrid";

        midfielders[7] = new Midfielders(true,true,true);
        midfielders[7].setPosition(Midfielders.Position.CM);
        midfielders[7].name = "Mac Allister";
        midfielders[7].age = 27;
        midfielders[7].club = "Liverpool";

        midfielders[8] = new Midfielders(true,true,true);
        midfielders[8].setPosition(Midfielders.Position.CM);
        midfielders[8].name = "Vitinha";
        midfielders[8].age = 26;
        midfielders[8].club = "PSG";

        midfielders[9] = new Midfielders(true,true,true);
        midfielders[9].setPosition(Midfielders.Position.CM);
        midfielders[9].name = "Musiala";
        midfielders[9].age = 23;
        midfielders[9].club = "Bayern Munich";

        midfielders[10] = new Midfielders(true,true,true);
        midfielders[10].setPosition(Midfielders.Position.CM);
        midfielders[10].name = "Enzo Fernandez";
        midfielders[10].age = 25;
        midfielders[10].club = "Chelsea";

        midfielders[11] = new Midfielders(true,true,true);
        midfielders[11].setPosition(Midfielders.Position.CM);
        midfielders[11].name = "Gavi";
        midfielders[11].age = 22;
        midfielders[11].club = "Barcelona";

// CAM
        midfielders[12] = new Midfielders(true,true,true);
        midfielders[12].setPosition(Midfielders.Position.CAM);
        midfielders[12].name = "Bellingham";
        midfielders[12].age = 22;
        midfielders[12].club = "Real Madrid";

        midfielders[13] = new Midfielders(true,true,true);
        midfielders[13].setPosition(Midfielders.Position.CAM);
        midfielders[13].name = "Wirtz";
        midfielders[13].age = 23;
        midfielders[13].club = "Liverpool";

        midfielders[14] = new Midfielders(true,true,true);
        midfielders[14].setPosition(Midfielders.Position.CAM);
        midfielders[14].name = "De Bruyne";
        midfielders[14].age = 35;
        midfielders[14].club = "Napoli";

        midfielders[15] = new Midfielders(true,true,true);
        midfielders[15].setPosition(Midfielders.Position.CAM);
        midfielders[15].name = "Bruno Fernandes";
        midfielders[15].age = 31;
        midfielders[15].club = "Manchester United";

        midfielders[16] = new Midfielders(true,true,true);
        midfielders[16].setPosition(Midfielders.Position.CAM);
        midfielders[16].name = "Odegaard";
        midfielders[16].age = 27;
        midfielders[16].club = "Arsenal";

        midfielders[17] = new Midfielders(true,true,true);
        midfielders[17].setPosition(Midfielders.Position.CAM);
        midfielders[17].name = "Maddison";
        midfielders[17].age = 30;
        midfielders[17].club = "Tottenham";

        midfielders[18] = new Midfielders(true,true,true);
        midfielders[18].setPosition(Midfielders.Position.CAM);
        midfielders[18].name = "Olmo";
        midfielders[18].age = 28;
        midfielders[18].club = "Barcelona";

        midfielders[19] = new Midfielders(true,true,true);
        midfielders[19].setPosition(Midfielders.Position.CAM);
        midfielders[19].name = "Palmer";
        midfielders[19].age = 24;
        midfielders[19].club = "Chelsea";
    }
    void attack(Striker[] strikers){
        strikers[0] = new Striker(true,true,true,false);
        strikers[0].setPosition(Striker.Position.CF);
        strikers[0].name = "Haaland";
        strikers[0].age = 25;
        strikers[0].club = "Manchester City";

        strikers[1] = new Striker(true,false,true,false);
        strikers[1].setPosition(Striker.Position.CF);
        strikers[1].name = "Harry Kane";
        strikers[1].age = 32;
        strikers[1].club = "Bayern Munich";

        strikers[2] = new Striker(true,true,false,true);
        strikers[2].setPosition(Striker.Position.CF);
        strikers[2].name = "Lautaro Martinez";
        strikers[2].age = 29;
        strikers[2].club = "Inter Milan";

        strikers[3] = new Striker(true,true,false,true);
        strikers[3].setPosition(Striker.Position.CF);
        strikers[3].name = "Julian Alvarez";
        strikers[3].age = 26;
        strikers[3].club = "Atletico Madrid";

        strikers[4] = new Striker(true,true,true,true);
        strikers[4].setPosition(Striker.Position.CF);
        strikers[4].name = "Osimhen";
        strikers[4].age = 27;
        strikers[4].club = "Galatasaray";

// LW
        strikers[5] = new Striker(true,true,false,true);
        strikers[5].setPosition(Striker.Position.LW);
        strikers[5].name = "Vinicius Jr";
        strikers[5].age = 25;
        strikers[5].club = "Real Madrid";

        strikers[6] = new Striker(true,true,false,true);
        strikers[6].setPosition(Striker.Position.LW);
        strikers[6].name = "Leao";
        strikers[6].age = 26;
        strikers[6].club = "AC Milan";

        strikers[7] = new Striker(true,true,false,true);
        strikers[7].setPosition(Striker.Position.LW);
        strikers[7].name = "Kvaratskhelia";
        strikers[7].age = 24;
        strikers[7].club = "PSG";

        strikers[8] = new Striker(true,true,false,true);
        strikers[8].setPosition(Striker.Position.LW);
        strikers[8].name = "Son";
        strikers[8].age = 33;
        strikers[8].club = "Tottenham";

        strikers[9] = new Striker(true,true,false,true);
        strikers[9].setPosition(Striker.Position.LW);
        strikers[9].name = "Nico Williams";
        strikers[9].age = 23;
        strikers[9].club = "Athletic Bilbao";

// RW
        strikers[10] = new Striker(true,true,false,true);
        strikers[10].setPosition(Striker.Position.RW);
        strikers[10].name = "Salah";
        strikers[10].age = 34;
        strikers[10].club = "Liverpool";

        strikers[11] = new Striker(true,true,false,true);
        strikers[11].setPosition(Striker.Position.RW);
        strikers[11].name = "Yamal";
        strikers[11].age = 18;
        strikers[11].club = "Barcelona";

        strikers[12] = new Striker(true,true,false,true);
        strikers[12].setPosition(Striker.Position.RW);
        strikers[12].name = "Saka";
        strikers[12].age = 24;
        strikers[12].club = "Arsenal";

        strikers[13] = new Striker(true,true,false,true);
        strikers[13].setPosition(Striker.Position.RW);
        strikers[13].name = "Dembele";
        strikers[13].age = 29;
        strikers[13].club = "PSG";

        strikers[14] = new Striker(true,true,false,true);
        strikers[14].setPosition(Striker.Position.RW);
        strikers[14].name = "Rodrygo";
        strikers[14].age = 25;
        strikers[14].club = "Real Madrid";
    }

    public static void main(String[] args) {
        Main mn = new Main();

        byte choosePlan,chooseGk,chooseCB,chooseLb,chooseRb,chooseCm,chooseCf,chooseLw,chooseRw;
        Scanner sc = new Scanner(System.in);

        // whole team 60 player
        goalKeeper[] goalKeepers = new goalKeeper[10];
        Defender[] defenders = new Defender[15];
        Midfielders[] midfielders = new Midfielders[20];
        Striker[] strikers = new Striker[15];

        // load data
        mn.GK_data(goalKeepers);
        mn.mid(midfielders);
        mn.center_data(defenders);
        mn.attack(strikers);

        // 11 - teamformation.Main Players
        ArrayList<goalKeeper> gK = new ArrayList<>();
        ArrayList<Defender> CB = new ArrayList<>();
        ArrayList<Midfielders> CM = new ArrayList<>();
        ArrayList<Striker> CF = new ArrayList<>();

        // your strategy
        System.out.println("Select your strategy : ");
        System.out.println("1. 4-3-3" + "\n" + "2. 4-4-2");
        choosePlan = sc.nextByte();

        // your teamformation.goalKeeper
        System.out.println("choose your teamformation.goalKeeper" + "\n" + "GoalKeepers");
        goalKeeper.Print(goalKeepers);
        chooseGk = sc.nextByte();
        gK.add(goalKeepers[chooseGk]);


        // your LB
        System.out.println("Choose your Backs" + "\n" + "left Backs");
        Defender.Print(defenders,"LB");
        chooseLb = sc.nextByte();
        CB.add(defenders[chooseLb]);


        // your centerBacks
        System.out.println("Choose your Center Backs" + "\n" + "CenterBacks");
        Defender.Print(defenders,"CB");
        for (int i = 0 ; i < 2 ; i++){
            chooseCB = sc.nextByte();
            CB.add(defenders[chooseCB]);
        }


        //  Your RB
        System.out.println("Choose your Backs" + "\n" + "Right Backs");
        Defender.Print(defenders,"RB");
        chooseRb = sc.nextByte();
        CB.add(defenders[chooseRb]);

        if(choosePlan == 1){ // 433
            // CM
            System.out.println("Choose your center midfielders" + "\n" + "Center midfielders");
            Midfielders.Print(midfielders,"CM");
            for (int i = 0 ; i < 3 ;i++){
                chooseCm = sc.nextByte();
                CM.add(midfielders[chooseCm]);
            }

            // Lw
            System.out.println("Choose your left winger" + "\n" + "Left wingers");
            Striker.Print(strikers,"LW");
            chooseLw = sc.nextByte();
            CF.add(strikers[chooseLw]);

            // Cf
            System.out.println("Choose your Center Forward" + "\n" + "Center Forwards");
            Striker.Print(strikers,"CF");
            chooseCf = sc.nextByte();
            CF.add(strikers[chooseCf]);

            // Rw
            System.out.println("Choose your Right Winger" + "\n" + "Right Wingers");
            Striker.Print(strikers,"RW");
            chooseRw = sc.nextByte();
            CF.add(strikers[chooseRw]);


            // print GK
            System.out.println("               " + gK.get(0).name + "                 ");

            // print defenders
            for (int i = 0; i < 4; i++) {
                System.out.print(CB.get(i).name + "         ");
            }
            System.out.print("\n");
            // print center midfielders
            for(int i = 0 ; i < 3 ; i++){
                System.out.print(CM.get(i).name + "         ");
            }
            System.out.print("\n");
            // print center midfielders
            for(int i = 0 ; i < 3 ; i++){
                System.out.print(CF.get(i).name + "         ");
            }

        }
        else if (choosePlan == 2){ // 4213
            // CM
            System.out.println("Choose your center midfielders" + "\n" + "Center midfielders");
            Midfielders.Print(midfielders,"CM");
            for (int i = 0 ; i < 2 ;i++){
                chooseCm = sc.nextByte();
                CM.add(midfielders[chooseCm]);
            }

            // CAM
            System.out.println("Choose your center Attack midfielders" + "\n" + "center Attack midfielders");
            Midfielders.Print(midfielders,"CAM");
            chooseCm = sc.nextByte();
            CM.add(midfielders[chooseCm]);

            // Lw
            System.out.println("Choose your left winger" + "\n" + "Left wingers");
            Striker.Print(strikers,"LW");
            chooseLw = sc.nextByte();
            CF.add(strikers[chooseLw]);

            // Cf
            System.out.println("Choose your Center Forward" + "\n" + "Center Forwards");
            Striker.Print(strikers,"CF");
            chooseCf = sc.nextByte();
            CF.add(strikers[chooseCf]);

            // Rw
            System.out.println("Choose your Right Winger" + "\n" + "Right Wingers");
            Striker.Print(strikers,"RW");
            chooseRw = sc.nextByte();
            CF.add(strikers[chooseRw]);

            // print GK
            System.out.println("               " + gK.get(0).name + "                 ");

            // print defenders
            for (int i = 0; i < 4; i++) {
                System.out.print(CB.get(i).name + "         ");
            }
            System.out.print("\n");
            // print center midfielders
            for(int i = 0 ; i < 2 ; i++){
                System.out.print(CM.get(i).name + "         ");
            }
            System.out.print("\n");

            System.out.println("               " + CM.get(2).name + "                 ");

            System.out.print("\n");

            // print center midfielders
            for(int i = 0 ; i < 3 ; i++){
                System.out.print(CF.get(i).name + "         ");
            }
        }

    }
}