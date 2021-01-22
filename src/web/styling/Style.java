package web.styling;

import web.tools.units.Percent;
import web.tools.units.Unit;

public class Style
{
    public Unit width, height;
    public Unit fontSize;


    public Style()
    {

    }

    public String genCSS()
    {
        String code = "";

        if(width != null)
            code += "width: " + width.genCSS() + ";";

        if(height != null)
            code += "height: " + height.genCSS() + ";";

        if(fontSize != null)
            code += "font-size: " + fontSize.genCSS() + ";";


        return code;
    }
}
