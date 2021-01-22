package web.tools.units;

public class Color extends Unit
{
    public String hex;
    public int r,g,b;

    public Color(String hex)
    {
        if(!hex.startsWith("#"))
        {
            hex = "#" + hex;
        }

        this.hex = hex;

        int[] rgb = hexToRGB(hex);
        r = rgb[0];
        g = rgb[1];
        b = rgb[2];
    }

    public Color(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;

        hex = rgbToHex(r, g, b);
    }

    public static int[] hexToRGB(String hex)
    {
        if(hex.startsWith("#"))
        {
            hex = hex.substring(1, hex.length());
        }
        if(!(hex.length() == 3 || hex.length() == 6))
        {
            return null;
        }

        int[] rgb = new int[3];
        rgb[0] = Integer.valueOf(hex.substring(0, 2),16);
        rgb[1] = Integer.valueOf(hex.substring(2, 4),16);
        rgb[2] = Integer.valueOf(hex.substring(4, 6),16);
        return rgb;
    }

    public static String rgbToHex(int r, int g, int b)
    {
        return String.format("#%02x%02x%02x", r, g, b);
    }


}
