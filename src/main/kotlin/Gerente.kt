class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int = 1234
) : Funcionario(nome, cpf, salario) {

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario
        }
}