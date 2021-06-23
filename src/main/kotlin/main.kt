fun main() {
    println("Bem vindo ao Bytebank")

    val lincon = Gerente(
        nome = "Lincon",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1234
    )

    println("nome ${lincon.nome}")
    println("cpf ${lincon.cpf}")
    println("salario ${lincon.salario}")
    println("bonificação ${lincon.bonificacao}")
    println(lincon.autentica(1234))
}