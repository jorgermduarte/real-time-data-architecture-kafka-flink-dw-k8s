package pt.jorgeduarte.flink_consumer.persistent.entities.dimension;

import jakarta.persistence.*;

@Entity
@Table(name = "D_STUDENTS")
public class D_Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "SOCIOECONOMIC_ID")
    private D_SocioeconomicData socioeconomicData;

    @ManyToOne
    @JoinColumn(name = "DEMOGRAPHIC_ID")
    private D_StudentDemographicData demographicData;

    private String name;

    // Getters and setters
}

