
/**
 * Write a description of class GameTerrainTester here.
 *
 * @author Luis Vega
 * @version 1/30/20
 */
public class GameTerrainTester
{
    public static void main(String[] args)
    {
        Terrain land = new Terrain(150,240);
        Forest forest = new Forest(400,400,100);
        Mountain mountain = new Mountain(600,200,12);
        WinterMountain winterMountain = new WinterMountain(500,500,30,12);
        Ocean ocean = new Ocean(750,300,4);
        OpenOcean openOcean = new OpenOcean(900,500,8,100);
        
        System.out.printf(land.getTerrainSize() + "\n\n");
        System.out.printf(forest.getForestSize() + "\n\n");
        System.out.printf(mountain.getMountainSize() + "\n\n");
        System.out.printf(winterMountain.getWinterMountainSize() + "\n\n");
        System.out.printf(ocean.getOceanSize() + "\n\n");
        System.out.printf(openOcean.getOpenOceanSize() + "\n\n");
    }
}
