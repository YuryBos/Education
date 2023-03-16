package Practice._2023_02_17;

public class Main {
    public static void main(String[] args) {


        DrawObjekt[] objekts = {new Cube(), new Sphere(), new Cube()};
        for (int i = 0; i < objekts.length; i++) {
            objekts[i].draw();
        }

    }
}
