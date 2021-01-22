package web.tools;

import java.util.ArrayList;

public class Database
{
    ArrayList<String> ids;
    ArrayList<Object> items;

    int idLength = 5;
    String idSeed = "abcdefghijklmnopqrstuvwxyz";

    public Database()
    {
        ids = new ArrayList<>();
        items = new ArrayList<>();
    }

    public Database setIdLength(int length)
    {
        idLength = length;
        return this;
    }

    public Database setIdSeed(String seed)
    {
        idSeed = seed;
        return this;
    }

    public String genId()
    {
        String id;

        do
        {
            id = "";

            for(int i = 0; i < idLength; i++)
            {
                id += idSeed.charAt((int) (Math.random() * idSeed.length()));
            }
        }
        while(ids.contains(id));

        return id;
    }
}
