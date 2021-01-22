package web.components;

import web.styling.Style;
import web.tools.Database;

public class Component
{
    static Database idGenerator = new Database();

    String id;
    Style defaultStyle;
    Style hoverStyle;

    public Component()
    {
        id = idGenerator.genId();
        defaultStyle = new Style();
    }

    public String genHTML()
    {
        return "";
    }

    public String genCSS()
    {
        return "";
    }
}
