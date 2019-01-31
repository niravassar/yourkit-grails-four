package demo

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.*
import spock.lang.Specification

@Integration
@Rollback
class StudentDataServiceIntTestSpec extends Specification {

    StudentDataService studentDataService

    void "test something"() {
        given:
        Student student = new Student(name: "nirav", grade: 39)
        studentDataService.save(student)

        when:
        Student result = Student.findByName("nirav")

        then:
        result.name == "nirav"
    }
}
