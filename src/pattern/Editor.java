/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author lek
 */
public class Editor {
    private compr compressor;
    public Editor (compr c){
        this.setCompressor(c);
    
    }

    public void setCompressor(compr compressor) {
        this.compressor = compressor;
    }
    
    public void doCompression(String file){
        this.compressor.compress(file);
    }
    
}
