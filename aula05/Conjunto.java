package aula05;

import java.util.ArrayList;

public class Conjunto {
    ArrayList<Integer> conj = new ArrayList<Integer>();

    public void setConj(ArrayList<Integer> conj) {
        this.conj = conj;
    }

    public ArrayList<Integer> getConj() {
        return conj;
    }

    public void insert(int n) {
        if(!contains(n)){
            conj.add(n);
        }
    }

    public boolean contains(int n) {
        return conj.contains(n);
    }

    public void remove(int n) {
        conj.remove(conj.indexOf(n));
    }

    public void empty(){
        conj.clear();
    }
    public String toString(){
        String string = "";
        for(int elem : conj){
            string += elem +" ";
        }
        return string;
    }
    public int size(){
        return conj.size();
    }
    public Conjunto combine(Conjunto add){
        Conjunto res = new Conjunto();
        for(int v : conj){
            res.insert(v);
        }
        for(int k : add.conj){
            res.insert(k);
        }
        return res;
    }
    public Conjunto intersect(Conjunto inter){
        Conjunto res = new Conjunto();
        for(int ele : conj){
            if(inter.conj.contains(ele)){
                res.insert(ele);
            }   
        }
        return res;
    }
    public Conjunto subtract(Conjunto dif){
        Conjunto res = new Conjunto();
        for(int ele : conj){
            if(!dif.conj.contains(ele)){
                res.insert(ele);
            }
        }
    
        return res;
    }
    
}
