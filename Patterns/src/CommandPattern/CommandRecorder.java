package CommandPattern;

import java.util.Stack;

public class CommandRecorder {
    private Stack<Command> undoStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    void execute(Command cmd) {
        cmd.execute();
        undoStack.push(cmd);
        redoStack.clear();
    }

    void undo() {
        Command cmd = undoStack.pop();
        redoStack.push(cmd);
        cmd = undoStack.peek();
        cmd.execute();
    }

    void redo() {
        Command cmd = redoStack.pop();
        cmd.execute();
        undoStack.push(cmd);
    }

    boolean canUndo() {
        return undoStack.size() > 0;
    }

    boolean canRedo() {
        return redoStack.size() > 0;
    }
}
