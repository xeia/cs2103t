package ce2.textbuddy.cs2103;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    final String MESSAGE_COMMAND_INPUT = "command: ";
    final String MESSAGE_OUTPUT_FILENAME_MULTIPLE = "Please provide only one filename.";
    final String MESSAGE_OUTPUT_FILENAME_NONE = "There is no filename provided.";
    final String MESSAGE_TERMINATE = "Program will now terminate...";
    final String MESSAGE_WELCOME = "Welcome to TextBuddy!";

    final String MESSAGE_COMMAND_INVALID = "Invalid command specified.";
    final String MESSAGE_COMMAND_EMPTY = "Please enter a command.";
    final String MESSAGE_ADD_EMPTY = "Unable to add with empty input parameters.";
    final String MESSAGE_ADD_SUCCESS = "added to %s: \"%s\"";
    final String MESSAGE_CLEAR = "all content deleted from %s";
    final String MESSAGE_DELETE_INVALID_NUMBER = "Parameter specified as line number is invalid.";
    final String MESSAGE_DELETE_EMPTY = "Line number specified is does not exist.";
    final String MESSAGE_DELETE_SUCCESS = "deleted from %s: \"%s\"";
    final String MESSAGE_DELETE_MULTIPLE = "Please provide only one line number at a time.";
    final String MESSAGE_DISPLAY_COUNT = "Displaying %s tasks:";
    final String MESSAGE_DISPLAY_EMPTY = "%s is empty";
    final String MESSAGE_EMPTY = "There are no tasks available.";
    final String MESSAGE_EXIT = "Exiting TextBuddy... Goodbye!";

    final String MESSAGE_FILE_OUTPUT_EXISTS = "Output file already exists, loading file contents...";
    final String MESSAGE_FILE_OUTPUT_REMINDER = "Please type 'clear' to remove all contents.";
    final String MESSAGE_FILE_OUTPUT_SUCCESS = "%s is ready for use!";

    final String ERROR_FILE_CREATE = "Error! Unable to create output file.";
    final String ERROR_FILE_RENAME = "Error! Unable to rename temp file.";
    final String ERROR_FILE_DELETE = "Error! Unable to delete file.";
    final String ERROR_FILE_WRITE = "Error! Unable to write to output file.";
    final String ERROR_FILE_READ = "Error! Unable to read from output file.";
    final String ERROR_FILE_NOT_FOUND = "Error! File does not exist.";

    private Scanner _scanner;

    public UI() {
        this._scanner = new Scanner(System.in);
    }

    String getUserInput() {
        return _scanner.nextLine();
    }

    void displayMessage(String msg) {
        System.out.println(msg);
    }

    void displayFormattedMessage(String message, Object... keywords) {
        message = message.concat("%n");
        System.out.format(message, keywords);
    }

    void displayMessageInline(String message) {
        System.out.print(message);
    }

}
