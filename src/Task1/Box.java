package Task1;

public class Box {
    //two public variable
    public String sizeName ;
    public String label;

    // two private varaible

    private int length ;
    private  int height;
    private int width;

    // two protected varaibles

    protected float volume;
    protected static long serialNumber =0 ;

    public Box(String sizeName, String label, int length, int height, int width) {

        if(length <= 0 || height <= 0 || width <= 0 ){
            throw  new IllegalArgumentException("Wrong unit of dimention");
        }else {
            this.length = length;
            this.height = height;
            this.width = width;
            this.volume = height * width * length;
        }

        this.sizeName = sizeName;
        this.label = label;
        serialNumber++;
    }

    public Box() {
        serialNumber++;
    }

    public Box(String sizeName, int length, int height, int width) {

        if(length <= 0 || height <= 0 || width <= 0 ){
            throw  new IllegalArgumentException("Wrong unit of dimention");
        }else {
            this.length = length;
            this.height = height;
            this.width = width;
            this.volume = height * width * length;
        }
        this.sizeName = sizeName;
        serialNumber++;
    }

    public Box(String sizeName, float volume) {
        this.sizeName = sizeName;
        if(volume < 1){
            throw new IllegalArgumentException("Wrong unit of Volume try Higher volume");
        }else{
            int side = (int)Math.ceil(Math.cbrt(volume));
            this.length = side;
            this.height = side;
            this.width = side;
            this.volume = side * side * side;
            serialNumber++;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public static long getSerialNumber() {
        return serialNumber;
    }

    public static void setSerialNumber(long serialNumber) {
        Box.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Box{" +
                "sizeName='" + sizeName + '\'' +
                ", label='" + label + '\'' +
                ", length=" + length +
                ", height=" + height +
                ", width=" + width +
                ", volume=" + volume +
                '}';
    }
}
