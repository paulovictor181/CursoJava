import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum UserStatus {
    FUTEBOL(1, "Futebol"),
    GINASTICA(2, "Ginástica"),
    NATACAO(3, "Natação"),
    ATLETISMO(4, "Atletismo");

    private int valor;
    private String descricao;

    private UserStatus(int valor, String descricaoResumida){
        this.valor = valor;
        this.descricao = descricaoResumida;
    }

    public boolean isSituacaoIm(){
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

