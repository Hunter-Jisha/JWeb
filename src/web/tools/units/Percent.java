package web.tools.units;

public class Percent extends Unit
{
    int num;

    public Percent(int num)
    {
        this.num = num;
    }

    @Override
    public String genCSS()
    {
        return num + "%";
    }
}
