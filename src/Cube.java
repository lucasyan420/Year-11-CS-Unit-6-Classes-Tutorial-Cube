public class Cube {
    private int side;

    public Cube() {
        this.side = 1;
    }

    public Cube(int side) throws IllegalArgumentException{
        if (side < 1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side = side;
    }

    public int getSide(){
        return side;
    }

    public void setSide(int side) throws IllegalArgumentException{
        if (side < 1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!" );
        }
        this.side = side;
    }

    public int getSurfaceArea(){
        double surfaceArea = 6*Math.pow(side, 2);
        return (int) Math.round(surfaceArea);
    }

    public int getVolume(){
        double volume = Math.pow(side, 3);
        return (int) Math.round(volume);
    }

    @Override
    public String toString() {
        return "Cube:" +
                "Side = " + side;
    }
}

