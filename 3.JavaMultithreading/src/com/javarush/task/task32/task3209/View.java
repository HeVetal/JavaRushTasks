package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;
import com.javarush.task.task32.task3209.listeners.UndoListener;

import javax.swing.*;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();
    private UndoManager undoManager = new UndoManager();
    private UndoListener undoListener = new UndoListener(undoManager);


    public View() throws HeadlessException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void selectedTabChanged() {
        int selectedIndex = tabbedPane.getSelectedIndex();
        if (selectedIndex == 0) {
            controller.setPlainText(plainTextPane.getText());
        } else if (selectedIndex == 1) {
            plainTextPane.setText(controller.getPlainText());
        }
        resetUndo();
    }

    public void init() {
        initGui();
        FrameListener frameListener = new FrameListener(this);
        addWindowListener(frameListener);
        this.setVisible(true);
    }

    public void initMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();
        MenuHelper.initFileMenu(this, jMenuBar);
        MenuHelper.initEditMenu(this, jMenuBar);
        MenuHelper.initStyleMenu(this, jMenuBar);
        MenuHelper.initAlignMenu(this, jMenuBar);
        MenuHelper.initColorMenu(this, jMenuBar);
        MenuHelper.initFontMenu(this, jMenuBar);
        MenuHelper.initHelpMenu(this, jMenuBar);
        Container contentPane = getContentPane();
        contentPane.add(jMenuBar, BorderLayout.NORTH);
    }

    public void initEditor() {
        htmlTextPane.setContentType("text/html");
        JScrollPane jScrollPane = new JScrollPane(htmlTextPane);
        tabbedPane.add("HTML", jScrollPane);
        JScrollPane jScrollPane1 = new JScrollPane(plainTextPane);
        tabbedPane.add("Текст", jScrollPane1);
        tabbedPane.setPreferredSize(null);
        TabbedPaneChangeListener tabbedPaneChangeListener = new TabbedPaneChangeListener(this);
        tabbedPane.addChangeListener(tabbedPaneChangeListener);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);


    }

    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

    public void exit() {
        controller.exit();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case ("Новый"):
                controller.createNewDocument();
                break;
            case ("Открыть"):
                controller.openDocument();
                break;
            case ("Сохранить"):
                controller.saveDocument();
                break;
            case ("Сохранить как..."):
                controller.saveDocumentAs();
                break;
            case ("Выход"):
                controller.exit();
                break;
            case ("О программе"):
                showAbout();
                break;
        }
    }

    public boolean canUndo() {
        return undoManager.canUndo();
    }

    public boolean canRedo() {
        return undoManager.canRedo();
    }

    public void undo() {
        try {
            undoManager.undo();
        } catch (CannotUndoException e) {
            ExceptionHandler.log(e);
        }
    }

    public void redo() {
        try {
            undoManager.redo();
        } catch (CannotRedoException e) {
            ExceptionHandler.log(e);
        }
    }

    public UndoManager getUndoManager() {
        return undoManager;
    }

    public void resetUndo() {
        undoManager.discardAllEdits();
    }

    public UndoListener getUndoListener() {
        return undoListener;
    }

    public boolean isHtmlTabSelected() {

        return tabbedPane.getSelectedIndex() == 0;
    }

    public void selectHtmlTab() {
        tabbedPane.setSelectedIndex(0);
        resetUndo();

    }

    public void update() {
        htmlTextPane.setDocument(controller.getDocument());

    }

    public void showAbout() {
        JOptionPane.showMessageDialog(tabbedPane, "Программа версии 1.0", "Информация о программе", JOptionPane.INFORMATION_MESSAGE);
    }
}
