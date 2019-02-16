package maple.story.star.domain

import maple.story.star.domain.audit.DateAudit
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.UniqueConstraint
import javax.validation.constraints.NotBlank

@Entity
@Table(
    name = "accounts",
    uniqueConstraints = [
        UniqueConstraint(columnNames = ["username"])
    ]
)
data class Account(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1,

    @field:NotBlank
    @Column(length = 20)
    var username: String = "",

    @field:NotBlank
    @Column(length = 128)
    var password: String = ""
) : DateAudit()
