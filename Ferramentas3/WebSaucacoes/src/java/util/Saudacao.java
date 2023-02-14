package util;

import java.time.LocalTime;

public class Saudacao {
    
            LocalTime horario = LocalTime.now();
            int hora = horario.getHour();
            if (hora>=18)
                return("Boa noite.")
            else
                if (hora>=0 && hora<=12)
                    return("Bom dia.");
                else
                    return("Boa tarde");
            
    
}
