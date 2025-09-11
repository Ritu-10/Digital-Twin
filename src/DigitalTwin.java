import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Class to represent a single mood entry
class MoodEntry {
    private String mood;
    private String note;
    private Date date;

    public MoodEntry(String mood, String note) {
        this.mood = mood;
        this.note = note;
        this.date = new Date(); // current timestamp
    }

    @Override
    public String toString() {
        return "[" + date + "] Mood: " + mood + " | Note: " + note;
    }
}

public class DigitalTwin {
    private List<MoodEntry> entries;
    private Scanner scanner;

    public DigitalTwin() {
        entries = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Add a new mood entry
    public void addEntry() {
        System.out.print("Enter your mood: ");
        String mood = scanner.nextLine();

        System.out.print("Any notes you'd like to add? ");
        String note = scanner.nextLine();

        MoodEntry entry = new MoodEntry(mood, note);
        entries.add(entry);

        System.out.println("✅ Mood entry added successfully!\n");
    }

    // View all mood entries
    public void viewEntries() {
        if (entries.isEmpty()) {
            System.out.println("No mood entries found.\n");
            return;
        }
        System.out.println("📒 Your Mood Journal:");
        for (MoodEntry entry : entries) {
            System.out.println(entry);
        }
        System.out.println();
    }

    // menu loop
    public void run() {
        while (true) {
            System.out.println("==== Digital-Twin ====");
            System.out.println("1. Add Mood Entry");
            System.out.println("2. View Mood Entries");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addEntry();
                    break;
                case "2":
                    viewEntries();
                    break;
                case "3":
                    System.out.println("Goodbye! Stay positive. ✨");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.\n");
            }
        }
    }

    public static void main(String[] args) {
        DigitalTwin app = new DigitalTwin();
        app.run();
    }
}
