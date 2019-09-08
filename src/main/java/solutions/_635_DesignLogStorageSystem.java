package solutions;

import java.util.*;

public class _635_DesignLogStorageSystem {
    
    List<Integer> ids = null;
    List<String> timeStamps = null;

    public _635_DesignLogStorageSystem() {
        ids = new ArrayList<>();
        timeStamps = new ArrayList<>();
    }

    public void put(int id, String timestamp) {
        ids.add(id);
        timeStamps.add(timestamp);
    }

    public List<Integer> retrieve(String s, String e, String gra) {
        List<Integer> returnLogs = new ArrayList<>();

        s = s.substring(0, getCollenIndex(gra));
        e = e.substring(0, getCollenIndex(gra));

        for (int i = 0; i < ids.size(); i++) {

            int index = getCollenIndex(gra);
            String compare = timeStamps.get(i).substring(0, index);
            if (s.compareTo(compare)  <= 0
                && e.compareTo(compare) >= 0) {
                returnLogs.add(ids.get(i));
            }
        }

        return new ArrayList<>(returnLogs);
    }

    public int getCollenIndex(String granularity) {
        switch (granularity) {
            case "Year" : return 4;
            case "Month" : return 7;
            case "Day" : return 10;
            case "Hour" : return 13;
            case "Minute" : return 16;
            case "Second" : return 19;
            default: return 0;
        }
    }
}
