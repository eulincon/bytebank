class Conta {
    var titular = ""
    var numero = 0
    var saldo = .1
        private set(valor) {
            if (valor > 0) {
                field = valor
            }
        }

    fun depositar(valor: Int): Double {
        saldo += valor
        return saldo
    }
}