package ru.pangaia.erudit;

import ru.pangaia.erudit.gui.MainFrame;
import ru.pangaia.erudit.model.Board;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();
        JFrame frame = new MainFrame();
    }

}
