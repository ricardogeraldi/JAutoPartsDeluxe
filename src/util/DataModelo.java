package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataModelo {
    
    private String data, hora;
    private SimpleDateFormat format;
    
    public String getData(){
        String d = "dd/MM/yyyy";
        Date agora = new Date();
        format = new SimpleDateFormat(d);
        data  = format.format(agora);
        return data;
    }
    
    public String getDataFormatada(){
        String fDia = "dd";
        String fMes = "MMMMM";
        String fAno = "yyyy";
        String fDiaSemana = "EEEEE";
        
        Date agora = new Date();
        format = new SimpleDateFormat(fDia);
        String dia  = format.format(agora);
        format = new SimpleDateFormat(fMes);
        String mes  = format.format(agora);
        format = new SimpleDateFormat(fAno);
        String ano  = format.format(agora);
        format = new SimpleDateFormat(fDiaSemana);
        String diaSemana  = format.format(agora);
        
        data = dia+" de "+mes+" de "+ano+"  |  "+diaSemana;
        
        return data;
    }
    
    public String getHora(){
        
        String h = "hh:mm - a";
        Date agora = new Date();
        format = new SimpleDateFormat(h);
        hora = format.format(agora);
        
        return hora;
    }
}

