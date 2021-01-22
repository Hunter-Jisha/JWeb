package web.tools.units;

public class Pixels extends Unit
{
    int num;

    public Pixels(int num)
    {
        this.num = num;
    }

    @Override
    public String genCSS()
    {
        return num + "px";
    }
}
