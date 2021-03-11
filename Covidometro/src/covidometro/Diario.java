/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidometro;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Leo
 */
public class Diario {
    ArrayList<Dia> meuQueridoDiario = new ArrayList();
    
    
    
    // String DataHoje = getDateTime(); ***
    
    
    
    public void cadastrar(Dia p) {
        
        //this.setData(DataHoje); ***
        this.meuQueridoDiario.add(p);       // bota o produto no arrayList        
        
    }
}
