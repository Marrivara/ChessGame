package Game;

public class Position {

    private String file;
    private int rank;


    public Position(String file, int rank) {
        this.file = file;
        this.rank = rank;
    }

    public String getPosition(){
        return String.valueOf(getRank()) + " " + String.valueOf(getFile());
    }
    public int getFile() {
        switch (file){
            case "a":
                return 1;
            case "b":
                return 2;
            case "c":
                return 3;
            case "d":
                return 4;
            case "e":
                return 5;
            case "f":
                return 6;
            case "g":
                return 7;
            case "h":
                return 8;
            default:
                return 0;
        }


    }

    public void setFile(int file) {
        switch (file){
            case 1:
                this.file = "a";
            case 2:
                this.file = "b";
            case 3:
                this.file = "c";
            case 4:
                this.file = "d";
            case 5:
                this.file = "e";
            case 6:
                this.file = "f";
            case 7:
                this.file = "g";
            case 8:
                this.file = "h";
        }

    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object other){
        // self check
        if (this == other)
            return true;
        // null check
        if (other == null)
            return false;
        // type check and cast
        if (getClass() != other.getClass())
            return false;
        Position position = (Position) other;
        // field comparison
        return (getFile() == position.getFile()) && (getRank() == position.getRank());
    }
}
