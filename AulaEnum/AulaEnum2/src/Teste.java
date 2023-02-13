public class Teste {
    public static void main (String args[]){
        UserStatus situacao = UserStatus.BLOQUEADO;

        if(situacao.isSituacaoImpedeEmprestimos()) {
            System.out.println("Volte para casa de mão vazias!");
        }

        System.out.println(situacao.toString());
        System.out.println(situacao.name());
        System.out.println(situacao.getValue());
        System.out.println(UserStatus.POSSIVEIS_SITUACAO_DO_USUARIO);

    }
}
