package com.company;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static final LocalDateTime LDT = LocalDateTime.now();
    public static void main(String[] args) {
	List<String> zones = new ArrayList<>(ZoneId.getAvailableZoneIds());
	Map<String,String> map = zones.stream()
            .collect(Collectors.toMap(zone-> zone, Main::getOffSet));
	TreeMap<String,String> sortedMap = new TreeMap<>(map);
	sortedMap.forEach((zone,OffSet)-> System.out.printf("%s (UTC%s) \n", zone, OffSet));
    }
    private static String getOffSet(String zone){
        ZonedDateTime zdt = LDT.atZone(ZoneId.of(zone));
        return zdt.getOffset().getId().replace("Z",  "+00:00");
    }
}
