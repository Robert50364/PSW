public class RgbController
{
    public void setColor(Rgb rgb, int r, int g, int b)
    {
        rgb.setRValue(r);
        rgb.setGValue(g);
        rgb.setBValue(b);
    }
    public void showColor(Rgb rgb) {
        System.out.println("["+rgb.getRValue()+", "+rgb.getGValue()+", "+rgb.getBValue()+"]");
    }

    public Rgb mieszajKolor(Rgb c1, Rgb c2)
    {
        Rgb c = new Rgb();
        c.setRValue((c1.getRValue()+c2.getRValue())/2);
        c.setGValue((c1.getGValue()+c2.getBValue())/2);
        c.setBValue((c1.getBValue()+c2.getBValue())/2);
        return c;
    }
}
