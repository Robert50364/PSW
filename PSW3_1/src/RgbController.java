public class RgbController
{
    private Rgb rgb = new Rgb();
    int color[] = new int[3];

    public void setColor(int r, int g, int b)
    {
        rgb.setRValue(r);
        rgb.setGValue(g);
        rgb.setBValue(b);
    }
    public void getColor()
    {
        color[0] = rgb.getRValue();
        color[1] = rgb.getGValue();
        color[2] = rgb.getBValue();
    }
    public void showColor()
    {
        System.out.println("["+color[0]+", "+color[1]+", "+color[2]+"]");
    }

}
