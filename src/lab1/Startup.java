/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tim78317
 */
public class Startup{
    public static void main(String[] args) {
        
      FileManager mgr = new FileManager();
      mgr.readInFile();
      
        System.out.println(mgr);
    
        
        
        
        
    }
    
}
