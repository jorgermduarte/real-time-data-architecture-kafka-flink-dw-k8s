package pt.jorgeduarte.flink_consumer.persistent.entities.dimension;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "D_EXAMS")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EXAM_ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "TIME_ID")
    private Time time;

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "SUBJECT_ID")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "ACADEMIC_YEAR_ID")
    private AcademicYear academicYear;

    @Column(name = "EXAM_GRADE", precision = 5, scale = 2)
    private BigDecimal examGrade;

    // Getters and setters
}
