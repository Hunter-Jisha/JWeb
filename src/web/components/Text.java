package web.components;

import web.tools.units.Unit;

public class Text extends Component
{
    String text;

    public Text(String text)
    {
        this.text = text;
    }

    public Text setFontSize(Unit size)
    {
        defaultStyle.fontSize = size;
        return this;
    }

    @Override
    public String genHTML()
    {
        return "<p id=\"" + id + "\">" + text + "</p>";
    }

    @Override
    public String genCSS()
    {
        String code = "#" + id + "{";
        code += defaultStyle.genCSS();
        code += "}";
        return code;
    }
}
