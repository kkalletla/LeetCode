package solutions;

import java.util.*;

public class _635_DesignLogStorageSystem {

    public static void main(String[] args) {

        _635_DesignLogStorageSystem object = new _635_DesignLogStorageSystem();


        object.put(1, "2017:01:01:23:59:59");
        object.put(2, "2017:01:01:22:59:59");
        object.put(3, "2016:01:01:00:00:00");
        object.put(4, "2016:01:01:00:00:00");

        // System.out.println(object.logs);

        System.out.println(object.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Month"));
        System.out.println(object.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Hour"));
    }

    Map<String, Set<Integer>> logs = null;
    String[] granularities = null;
    String[] startTimeReplace = null;
    String[] endTimeReplace = null;
    int[] indexesOdCollen = null;

    public _635_DesignLogStorageSystem() {
        logs = new TreeMap<>();
        granularities = new String[] {"Year", "Month", "Day", "Hour", "Minute"};

        startTimeReplace = new String[] {":00:00:00:00:00",
                ":00:00:00:00",
                ":00:00:00",
                ":00:00",
                ":00"};

        endTimeReplace = new String[] {":12:31:23:59:59",
                ":31:23:59:59",
                ":23:59:59",
                ":59:59",
                ":59"};

        indexesOdCollen = new int[] {4, 7, 10, 13, 16};

    }

    public void put(int id, String timestamp) {
        Set<Integer> ids = logs.getOrDefault(timestamp, new HashSet<>());
        ids.add(id);
        logs.put(timestamp, ids);
    }

    public List<Integer> retrieve(String s, String e, String gra) {
        Set<Integer> returnLogs = new HashSet<>();

        for (int granularity = 0; granularity < granularities.length; granularity ++) {
            if (granularities[granularity].equals(gra)) {
                s = s.substring(0, indexesOdCollen[granularity]) +  startTimeReplace[granularity];
                // System.out.println(s);

                e = e.substring(0, indexesOdCollen[granularity]) +  endTimeReplace[granularity];
                // System.out.println(e);
            }
        }

        for (Map.Entry<String, Set<Integer>> entry: logs.entrySet()) {

            // System.out.println("*********************");
            // System.out.println(entry.getKey() + s.compareTo(entry.getKey()) + " " + e.compareTo(entry.getKey()));
            if (s.compareTo(entry.getKey())  <= 0
                && e.compareTo(entry.getKey()) >= 0) {
                returnLogs.addAll(entry.getValue());
            }
        }

        return new ArrayList<>(returnLogs);
    }
}
