package javax.persistence

enum class GenerationType {
    TABLE,
    SEQUENCE,
    IDENTITY,
    AUTO
}

annotation class GeneratedValue(val strategy: GenerationType = GenerationType.AUTO, val generator: String = "")

enum class CascadeType {
    ALL,
    PERSIST,
    MERGE,
    REMOVE,
    REFRESH,
    DETACH
}

enum class FetchType {
    LAZY,
    EAGER
}

annotation class OneToOne(
    val targetEntity: KClass<*> = Unit::class,
    val cascade: Array<CascadeType> = arrayOf(),
    val fetch: FetchType = FetchType.EAGER,
    val optional: Boolean = true,
    val mappedBy: String = "",
    val orphanRemoval: Boolean = false
)

annotation class ManyToOne(
    val targetEntity: KClass<*> = Unit::class,
    val cascade: Array<CascadeType> = arrayOf(),
    val fetch: FetchType = FetchType.EAGER,
    val optional: Boolean = true
)