# Digital-Twin
// An experimental app that acts like a supportive buddy for stress and mood awareness.

import java.util.*;

class MoodEntry {
    String mood;
    String note;
    Date date;

    MoodEntry(String mood, String note) {
        this.mood = mood;
        this.note = note;
        this.date = new Date();
    }

    public String toString() {
        return "[" + date + "] Mood: " + mood + " | Note: " + note;
    }
}

public class Main {
    public static void main(String[] args) {
        List<MoodEntry> entries = new ArrayList<>();
        entries.add(new MoodEntry("Happy", "Had a good day at work"));
        entries.add(new MoodEntry("Stressed", "Too many deadlines"));

        for (MoodEntry e : entries) {
            System.out.println(e);
        }
    }
}
