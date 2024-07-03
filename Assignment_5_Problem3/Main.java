package Assignment_5_Problem3;

public class Main {
    public static void main(String[] args) {
        Figure [] figures = {new UpwardHat(), new UpwardHat(), new DownwardHat(), new FaceMaker(), new Vertical()};

        for(Figure col: figures) {
            System.out.print(col.getClass().getSimpleName() + ": ");
            col.getFigure();
        }
    }
}


