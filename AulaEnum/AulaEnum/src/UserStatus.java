import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum UserStatus {
    OK(1, "Usuário Sem Pendências"),
    EMPRESTIMOS_ATIVOS(2, "Usuário Possui Empréstimos Ativos"),
    SUSPENSO(3, "Usuário está Suspenso"),
    MULTADO(4, "Usuário está  Multado"),
    EMPRESTIMOS_ATRASADOS(5, "Usuário Possui Empréstimos Atrasados"),
    BLOQUEADO(6, "Usuário está Bloqueado");
    private int valor;
    private String descricao;

    private UserStatus(int valor, String descricaoResumida){
        this.valor = valor;
        this.descricao = descricaoResumida;
    }

    public boolean isSituacaoImpedeEmprestimos(){
        if(this.equals(SUSPENSO) || this.equals(MULTADO) || this.equals(EMPRESTIMOS_ATRASADOS) || this.equals(BLOQUEADO) )
            return true;
        return false;
    }

    public int getValue() {return valor;}
    public static final Set<UserStatus> POSSIVEIS_SITUACAO_DO_USUARIO = 
        new HashSet<UserStatus>( Arrays.asList(
            UserStatus.OK,
            UserStatus.SUSPENSO,
            UserStatus.MULTADO,
            UserStatus.EMPRESTIMOS_ATIVOS,
            UserStatus.EMPRESTIMOS_ATRASADOS,
            UserStatus.BLOQUEADO )
        );
}

