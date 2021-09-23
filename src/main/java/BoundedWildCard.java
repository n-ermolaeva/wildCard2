public class BoundedWildCard {

    private static void showXY(Coords<?> c) {
        System.out.println("X Y Coordinates: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
            System.out.println();
        }
    }

    private static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z Coordinates: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
            System.out.println();
        }
    }

    private static void showAll(Coords<? extends FourD> c) {
        System.out.println("X Y Z T Coordinates: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TwoD[] td = {
                new TwoD(0, 0),
                new TwoD(-1, -4),
                new TwoD(8, 10)
        };
        Coords<TwoD> tdlocs = new Coords<>(td);
        System.out.println("Contents of tdlocs");
        showXY(tdlocs);
        //showXYZ(tdlocs);
        //showAll(tdlocs);

        ThreeD[] thd = {
                new ThreeD(5, 0, 4),
                new ThreeD(-433, -4, 4),
                new ThreeD(82, -20, 7)
        };
        Coords<ThreeD> thrlocs = new Coords<>(thd);
        System.out.println("Contents of thrlocs");
        showXY(thrlocs);
        showXYZ(thrlocs);
        //showAll(thrlocs);

        FourD[] fd = {
                new FourD(0, 0, 5, 2),
                new FourD(-11, 4, 5, -2),
                new FourD(4, 6, 4, 2)
        };
        Coords<FourD> fdlocs = new Coords<>(fd);
        System.out.println("Contents of fdlocs");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);

    }
}
