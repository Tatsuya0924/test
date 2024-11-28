package fr.centrale.tp3_medev;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author woota
 */
public class TP3_MEDEV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        TP3_MEDEV app = new TP3_MEDEV();

        LectureEcriture baboon = new LectureEcriture();
        LectureEcriture brain = new LectureEcriture();
        LectureEcriture coins = new LectureEcriture();

        baboon.readPGM(app.getClass().getResourceAsStream("/baboon.pgm"));
        brain.readPGM(app.getClass().getResourceAsStream("/brain.pgm"));
        coins.readPGM(app.getClass().getResourceAsStream("/coins.pgm"));

    }

}
