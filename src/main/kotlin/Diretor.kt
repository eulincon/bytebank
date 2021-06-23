class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int = 1234,
    val plr: Double
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario + plr
        }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}