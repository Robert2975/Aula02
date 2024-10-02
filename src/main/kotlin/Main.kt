fun main() {
    println("largura: ")
    val largura = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    println("altura: ")
    val altura = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    println("comprimento: ")
    val comprimento = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val resultado = calcularMetrosQuadrados(largura, altura, comprimento)
    println("Resultado: $resultado metros cúbico")

    val estoque = listOf(
        Estoque(
            nome = "Volante",
            end = "RUA01-A-N01-01",
            quantidade = 20,
            mCubico = 0.048,
            mCubTotal = 0.96
        ),
        Estoque(
            nome = "Tampa do Radiador",
            end = "RUA02-A-N02-02",
            quantidade = 10,
            mCubico = 0.08,
            mCubTotal = 0.8
        ),
        Estoque(
            nome = "Tampa do Radiador",
            end = "RUA03-B-N03-02",
            quantidade = 1,
            mCubico = 0.08,
            mCubTotal = 0.08
        )
    )

    val endereco = estoque.filter { (it.mCubTotal + resultado) < 1.0 }
        endereco.forEach {e -> println(e.end) }
    }

fun calcularMetrosQuadrados(largura: Double, altura: Double, comprimento: Double): Double {
    return largura * altura * comprimento
}
data class Estoque(
    val nome: String,
    val end: String,
    val quantidade: Int,
    val mCubico: Double,
    val mCubTotal: Double
)


