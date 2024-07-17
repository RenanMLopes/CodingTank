public enum Dia {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO;

    // listar os dias uteis da semana
    public static void diasUteis(){
        Dia[] diaDaSemana = Dia.values();
        for (int i = 0; i < diaDaSemana.length; i++) {
            Dia todosDias = diaDaSemana[i];
            if (!Dia.SABADO.equals(todosDias) && !Dia.DOMINGO.equals(todosDias)) {
                System.out.printf("%d %s \n", todosDias.ordinal() + 1, todosDias.name());
            }

        }

    }
    // listar todos os dias da semana
    public static void todosDias(){
        Dia[] diaDaSemana = Dia.values();
        for (Dia dia : diaDaSemana) {
            System.out.printf("%d %s \n", dia.ordinal() + 1, dia.name());

        }

    }

    // listar apenas os dias do final de semana
    public static void finalDeSemana() {
        Dia[] diaDaSemana = Dia.values();
        for (int i = 0; i < diaDaSemana.length; i++) {
            Dia todosDias = diaDaSemana[i];
            if (Dia.SABADO.equals(todosDias)
                    || Dia.DOMINGO.equals(todosDias)) {
                System.out.printf("%d %s \n", todosDias.ordinal() + 1, todosDias.name());
            }

        }
    }
}
