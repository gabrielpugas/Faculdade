package util;

import java.time.LocalTime;

public class Saudacao {

    public String getSaudacao() {
        LocalTime horario = LocalTime.now();
        int hora = horario.getHour();
        if (hora >= 18) {
            return "Boa Noite";
        } else if (hora >= 0 && hora <= 12) {
            return "Bom dia";
        } else {
            return "Boa tarde";
        }
    }

}
