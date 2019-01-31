
package demo

import grails.test.hibernate.HibernateSpec
import spock.lang.Shared

class StudentDataServiceSpec extends HibernateSpec {

    @Shared
    StudentDataService studentDataService

    def setup() {
        studentDataService = hibernateDatastore.getService(StudentDataService)
    }

    void "test find person by name"() {
        given:
        Student student = new Student(name: "nirav", grade: 39)
        studentDataService.save(student)

        when:
        Student result = Student.findByName("nirav")

        then:
        result.name == "nirav"
    }
}
