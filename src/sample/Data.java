// LABEL | URL | CLASS
package sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data implements Serializable {
    private final ArrayList<ArrayList<String>> token = new ArrayList<>();;

    public void init(){
        for(int i =0;i<13;i++){
            ArrayList<String> tok = new ArrayList<>();
            tok.add("null");
            tok.add("null");
            tok.add("null");
            this.token.add(tok);
        }
    }


    public void add(int index,String label,String url,String div){

        if(index <= 13){
            ArrayList<String> tok = new ArrayList<>();
            tok.add(label);
            tok.add(url);
            tok.add(div);
            this.token.set(index,tok);
        }

    }

    public List<String> getoken(int index){
        if(index <= this.token.size()){
            String label = this.token.get(index).get(0);
            String url = this.token.get(index).get(1);
            String div = this.token.get(index).get(2);
            List<String> pair = Arrays.asList(label,url,div);
            return pair;
        }
        return null;
    }

    public void remove(int index){
        if(index <= this.token.size()){
            ArrayList<String> tok = new ArrayList<>();
            tok.add("null");
            tok.add("null");
            tok.add("null");
            this.token.set(index,tok);
        }
    }

    public int getsize(){
        return this.token.size();
    }

}