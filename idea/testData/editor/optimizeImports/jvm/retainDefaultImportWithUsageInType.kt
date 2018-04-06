import javax.persistence.*
import kotlin.jvm.Transient

class Vehicle

class TrackerBrand

@Entity
data class VehicleTracker(
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @field:OneToOne(
            targetEntity = Vehicle::class,
            mappedBy = "tracker"
    )
    @field:Transient
    var vehicle: Vehicle? = null,

    var serialNumber: String? = null,

    @field:ManyToOne(
            targetEntity = TrackerBrand::class,
            fetch = FetchType.EAGER
    )
    var brand: TrackerBrand? = null
)