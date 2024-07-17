public enum Mes {
    JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO;

    public static void todosMeses() {

        // listar todos os meses do ano
        Mes[] todosMeses = Mes.values();
        for (Mes mes : todosMeses) {
            System.out.printf("Mês %d %s \n", mes.ordinal() + 1, mes.name());

        }
    }
}


