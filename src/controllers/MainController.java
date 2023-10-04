package controllers;

import models.FileRead;

public class MainController {
    public MainController(){
        new FileRead().readFile();
        
    }
}
