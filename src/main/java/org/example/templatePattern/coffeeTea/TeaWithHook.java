package org.example.templatePattern.coffeeTea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Tea is brewing...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk and sugar...");
    }
    public boolean customerWantsCondiments(){
        String answer = null;
        answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else return false;
    }
    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk and sugar with your tea (y/n)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch(IOException io){
            System.out.println("IO error trying to read your answer");
        }
        if(answer == null){
            return "no";
        }
        return answer;
    }
}
