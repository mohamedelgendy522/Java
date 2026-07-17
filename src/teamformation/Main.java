package teamformation;

import java.util.*;
class Player {
    protected byte age;
    protected String name;
    protected String club;
}

class goalKeeper extends Player{
    goalKeeper(boolean isTall , String name , byte age , String club){
        this.isTall = isTall;
        this.name = name;
        this.age = age;
        this.club = club;
    }
    boolean isTall;
    void setTall(boolean isTall){
        this.isTall = isTall;
    }
    boolean getTall(){
        return isTall;
    }
    public static void Print(goalKeeper[] goalKeepers) {

        System.out.println("\n========== Goalkeepers ==========\n");

        for (int i = 0; i < goalKeepers.length; i++) {

            System.out.println("Player #" + (i));
            System.out.println("--------------------------------");
            System.out.println("Name      : " + goalKeepers[i].name);
            System.out.println("Club      : " + goalKeepers[i].club);
            System.out.println("Age       : " + goalKeepers[i].age);

            System.out.println("Skills");
            System.out.println("Tall      : " + (goalKeepers[i].getTall() ? "✔" : "✘"));

            System.out.println("--------------------------------\n");
        }
    }
}

class Defender extends Player {

    Defender(boolean isTall, boolean isFast, boolean isPhysical, String name, byte age, String club) {
        this.isTall = isTall;
        this.isFast = isFast;
        this.isPhysical = isPhysical;
        this.name = name;
        this.age = age;
        this.club = club;
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

        System.out.println("\n========== Defenders ==========\n");

        for (int i = 0; i < defenders.length; i++) {

            if (defenders[i].getPosition().toString().equalsIgnoreCase(pos)) {

                System.out.println("Player #" + (i));
                System.out.println("--------------------------------");
                System.out.println("Name      : " + defenders[i].name);
                System.out.println("Club      : " + defenders[i].club);
                System.out.println("Age       : " + defenders[i].age);
                System.out.println("Position  : " + defenders[i].getPosition());

                System.out.println("Skills");
                System.out.println("Tall      : " + (defenders[i].isTall() ? "✔" : "✘"));
                System.out.println("Fast      : " + (defenders[i].isFast() ? "✔" : "✘"));
                System.out.println("Physical  : " + (defenders[i].isPhysical() ? "✔" : "✘"));

                System.out.println("--------------------------------\n");
            }
        }
    }
}

class Midfielders extends Player{
    private boolean isPasser;
    private boolean isScanner;
    private boolean isDribbler;


    enum Position {CDM, CAM, CM}

    private Position position;
    Midfielders(boolean isDribbler, boolean isPasser, boolean isScanner, String name, byte age, String club) {
        this.isDribbler = isDribbler;
        this.isPasser = isPasser;
        this.isScanner = isScanner;
        this.name = name;
        this.age = age;
        this.club = club;
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

        System.out.println("\n========== Midfielders ==========\n");

        for (int i = 0; i < midfielders.length; i++) {

            if (midfielders[i].getPosition().toString().equalsIgnoreCase(pos)) {

                System.out.println("Player #" + (i));
                System.out.println("--------------------------------");
                System.out.println("Name     : " + midfielders[i].name);
                System.out.println("Club     : " + midfielders[i].club);
                System.out.println("Age      : " + midfielders[i].age);
                System.out.println("Position : " + midfielders[i].getPosition());

                System.out.println("Skills");
                System.out.println("Passer    : " + (midfielders[i].isPasser() ? "✔" : "✘"));
                System.out.println("Scanner   : " + (midfielders[i].isScanner() ? "✔" : "✘"));
                System.out.println("Dribbler  : " + (midfielders[i].isDribbler() ? "✔" : "✘"));

                System.out.println("--------------------------------\n");
            }
        }
    }
}

class Striker extends Player{


    private boolean isFinisher;
    private boolean isHeader;
    private boolean isDribbler;
    private boolean isFast;

    Striker(boolean isFinisher, boolean isFast, boolean isHeader, boolean isDribbler, String name, byte age, String club) {
        this.isFinisher = isFinisher;
        this.isFast = isFast;
        this.isHeader = isHeader;
        this.isDribbler = isDribbler;
        this.name = name;
        this.age = age;
        this.club = club;
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
        for (int i = 0; i < strikers.length; i++) {
            if (strikers[i].position.toString().equals(pos)) {
                System.out.println("Player #" + (i));
                System.out.println("---------------------------------------");
                System.out.println("Name      : " + strikers[i].name);
                System.out.println("Club      : " + strikers[i].club);
                System.out.println("Age       : " + strikers[i].age);
                System.out.println("Position  : " + strikers[i].position);
                System.out.println();
                System.out.println("Attributes");
                System.out.println("  Header    : " + (strikers[i].isHeader ? "✔" : "✘"));
                System.out.println("  Dribbler  : " + (strikers[i].isDribbler ? "✔" : "✘"));
                System.out.println("  Finisher  : " + (strikers[i].isFinisher ? "✔" : "✘"));
                System.out.println("  Fast      : " + (strikers[i].isFast ? "✔" : "✘"));
                System.out.println("---------------------------------------\n");
            }
        }
    }

}

public class Main {

    void GK_data(goalKeeper[] goalKeepers) {
        goalKeepers[0] = new goalKeeper(true, "Alisson", (byte)32, "Liverpool");
        goalKeepers[1] = new goalKeeper(true, "Ederson", (byte)31, "Manchester City");
        goalKeepers[2] = new goalKeeper(true, "Courtois", (byte)33, "Real Madrid");
        goalKeepers[3] = new goalKeeper(true, "Donnarumma", (byte)26, "PSG");
        goalKeepers[4] = new goalKeeper(true, "Ter Stegen", (byte)33, "Barcelona");
        goalKeepers[5] = new goalKeeper(true, "Maignan", (byte)30, "AC Milan");
        goalKeepers[6] = new goalKeeper(true, "Emiliano Martinez", (byte)33, "Aston Villa");
        goalKeepers[7] = new goalKeeper(true, "Neuer", (byte)40, "Bayern Munich");
        goalKeepers[8] = new goalKeeper(true, "Diogo Costa", (byte)27, "Porto");
        goalKeepers[9] = new goalKeeper(true, "Onana", (byte)30, "Manchester United");
    }
    void center_data(Defender[] defenders) {

        // CB
        defenders[0] = new Defender(true, true, true, "Van Dijk", (byte)34, "Liverpool");
        defenders[0].setPosition(Defender.Position.CB);

        defenders[1] = new Defender(true, true, true, "Rudiger", (byte)32, "Real Madrid");
        defenders[1].setPosition(Defender.Position.CB);

        defenders[2] = new Defender(true, true, true, "Saliba", (byte)24, "Arsenal");
        defenders[2].setPosition(Defender.Position.CB);

        defenders[3] = new Defender(true, true, true, "Bastoni", (byte)26, "Inter Milan");
        defenders[3].setPosition(Defender.Position.CB);

        defenders[4] = new Defender(true, true, true, "Araujo", (byte)26, "Barcelona");
        defenders[4].setPosition(Defender.Position.CB);

        // LB
        defenders[5] = new Defender(false, true, false, "Alphonso Davies", (byte)24, "Bayern Munich");
        defenders[5].setPosition(Defender.Position.LB);

        defenders[6] = new Defender(false, true, false, "Theo Hernandez", (byte)27, "AC Milan");
        defenders[6].setPosition(Defender.Position.LB);

        defenders[7] = new Defender(false, true, false, "Grimaldo", (byte)29, "Leverkusen");
        defenders[7].setPosition(Defender.Position.LB);

        defenders[8] = new Defender(false, true, false, "Nuno Mendes", (byte)23, "PSG");
        defenders[8].setPosition(Defender.Position.LB);

        // RB
        defenders[9] = new Defender(false, true, false, "Hakimi", (byte)26, "PSG");
        defenders[9].setPosition(Defender.Position.RB);

        defenders[10] = new Defender(false, true, false, "Trent", (byte)27, "Liverpool");
        defenders[10].setPosition(Defender.Position.RB);

        defenders[11] = new Defender(false, true, false, "Frimpong", (byte)25, "Liverpool");
        defenders[11].setPosition(Defender.Position.RB);

        defenders[12] = new Defender(false, true, false, "Reece James", (byte)26, "Chelsea");
        defenders[12].setPosition(Defender.Position.RB);

        defenders[13] = new Defender(false, true, false, "Kounde", (byte)27, "Barcelona");
        defenders[13].setPosition(Defender.Position.RB);

        defenders[14] = new Defender(false, true, false, "Walker", (byte)35, "Burnley");
        defenders[14].setPosition(Defender.Position.RB);
    }
    void mid(Midfielders[] midfielders) {

        // CDM
        midfielders[0] = new Midfielders(false, true, true, "Rodri", (byte)29, "Manchester City");
        midfielders[0].setPosition(Midfielders.Position.CDM);

        midfielders[1] = new Midfielders(false, true, true, "Rice", (byte)26, "Arsenal");
        midfielders[1].setPosition(Midfielders.Position.CDM);

        midfielders[2] = new Midfielders(false, true, true, "Tchouameni", (byte)25, "Real Madrid");
        midfielders[2].setPosition(Midfielders.Position.CDM);

        midfielders[3] = new Midfielders(false, true, true, "Kimmich", (byte)31, "Bayern Munich");
        midfielders[3].setPosition(Midfielders.Position.CDM);

        midfielders[4] = new Midfielders(false, true, true, "Zubimendi", (byte)27, "Real Sociedad");
        midfielders[4].setPosition(Midfielders.Position.CDM);

        // CM
        midfielders[5] = new Midfielders(true, true, true, "Pedri", (byte)23, "Barcelona");
        midfielders[5].setPosition(Midfielders.Position.CM);

        midfielders[6] = new Midfielders(true, true, true, "Valverde", (byte)27, "Real Madrid");
        midfielders[6].setPosition(Midfielders.Position.CM);

        midfielders[7] = new Midfielders(true, true, true, "Mac Allister", (byte)27, "Liverpool");
        midfielders[7].setPosition(Midfielders.Position.CM);

        midfielders[8] = new Midfielders(true, true, true, "Vitinha", (byte)26, "PSG");
        midfielders[8].setPosition(Midfielders.Position.CM);

        midfielders[9] = new Midfielders(true, true, true, "Musiala", (byte)23, "Bayern Munich");
        midfielders[9].setPosition(Midfielders.Position.CM);

        midfielders[10] = new Midfielders(true, true, true, "Enzo Fernandez", (byte)25, "Chelsea");
        midfielders[10].setPosition(Midfielders.Position.CM);

        midfielders[11] = new Midfielders(true, true, true, "Gavi", (byte)22, "Barcelona");
        midfielders[11].setPosition(Midfielders.Position.CM);

        // CAM
        midfielders[12] = new Midfielders(true, true, true, "Bellingham", (byte)22, "Real Madrid");
        midfielders[12].setPosition(Midfielders.Position.CAM);

        midfielders[13] = new Midfielders(true, true, true, "Wirtz", (byte)23, "Liverpool");
        midfielders[13].setPosition(Midfielders.Position.CAM);

        midfielders[14] = new Midfielders(true, true, true, "De Bruyne", (byte)35, "Napoli");
        midfielders[14].setPosition(Midfielders.Position.CAM);

        midfielders[15] = new Midfielders(true, true, true, "Bruno Fernandes", (byte)31, "Manchester United");
        midfielders[15].setPosition(Midfielders.Position.CAM);

        midfielders[16] = new Midfielders(true, true, true, "Odegaard", (byte)27, "Arsenal");
        midfielders[16].setPosition(Midfielders.Position.CAM);

        midfielders[17] = new Midfielders(true, true, true, "Maddison", (byte)30, "Tottenham");
        midfielders[17].setPosition(Midfielders.Position.CAM);

        midfielders[18] = new Midfielders(true, true, true, "Olmo", (byte)28, "Barcelona");
        midfielders[18].setPosition(Midfielders.Position.CAM);

        midfielders[19] = new Midfielders(true, true, true, "Palmer", (byte)24, "Chelsea");
        midfielders[19].setPosition(Midfielders.Position.CAM);
    }
    void attack(Striker[] strikers) {

        // CF
        strikers[0] = new Striker(true, true, true, false, "Haaland", (byte)25, "Manchester City");
        strikers[0].setPosition(Striker.Position.CF);

        strikers[1] = new Striker(true, false, true, false, "Harry Kane", (byte)32, "Bayern Munich");
        strikers[1].setPosition(Striker.Position.CF);

        strikers[2] = new Striker(true, true, false, true, "Lautaro Martinez", (byte)29, "Inter Milan");
        strikers[2].setPosition(Striker.Position.CF);

        strikers[3] = new Striker(true, true, false, true, "Julian Alvarez", (byte)26, "Atletico Madrid");
        strikers[3].setPosition(Striker.Position.CF);

        strikers[4] = new Striker(true, true, true, true, "Osimhen", (byte)27, "Galatasaray");
        strikers[4].setPosition(Striker.Position.CF);

        // LW
        strikers[5] = new Striker(true, true, false, true, "Vinicius Jr", (byte)25, "Real Madrid");
        strikers[5].setPosition(Striker.Position.LW);

        strikers[6] = new Striker(true, true, false, true, "Leao", (byte)26, "AC Milan");
        strikers[6].setPosition(Striker.Position.LW);

        strikers[7] = new Striker(true, true, false, true, "Kvaratskhelia", (byte)24, "PSG");
        strikers[7].setPosition(Striker.Position.LW);

        strikers[8] = new Striker(true, true, false, true, "Son", (byte)33, "Tottenham");
        strikers[8].setPosition(Striker.Position.LW);

        strikers[9] = new Striker(true, true, false, true, "Nico Williams", (byte)23, "Athletic Bilbao");
        strikers[9].setPosition(Striker.Position.LW);

        // RW
        strikers[10] = new Striker(true, true, false, true, "Salah", (byte)34, "Liverpool");
        strikers[10].setPosition(Striker.Position.RW);

        strikers[11] = new Striker(true, true, false, true, "Yamal", (byte)18, "Barcelona");
        strikers[11].setPosition(Striker.Position.RW);

        strikers[12] = new Striker(true, true, false, true, "Saka", (byte)24, "Arsenal");
        strikers[12].setPosition(Striker.Position.RW);

        strikers[13] = new Striker(true, true, false, true, "Dembele", (byte)29, "PSG");
        strikers[13].setPosition(Striker.Position.RW);

        strikers[14] = new Striker(true, true, false, true, "Rodrygo", (byte)25, "Real Madrid");
        strikers[14].setPosition(Striker.Position.RW);
    }

    public static void main(String[] args) {
        Main mn = new Main();

        byte choosePlan,chooseGk,chooseCB,chooseLb,chooseRb,chooseCm,chooseCf,chooseLw,chooseRw;
        Scanner sc = new Scanner(System.in);

        // whole team 60 player
        goalKeeper[] goalKeepers = new goalKeeper[10];
        Defender[] defenders = new Defender[15];
        Midfielders[] midfielders = new Midfielders[20];
        mn.GK_data(goalKeepers);
        mn.mid(midfielders);
        mn.center_data(defenders);
        mn.attack(strikers);
        center_data(defenders);
        attack(strikers);

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
        runTeamFormationFlow(sc);
    }
}