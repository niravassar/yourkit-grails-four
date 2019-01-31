package demo

import grails.gorm.transactions.ReadOnly
import grails.gorm.transactions.Transactional

class StudentController {

    StudentDataService studentDataService

    @Transactional
    def insert() {
        Student student = new Student(name: "nirav")
        studentDataService.save(student)
        render "done"
    }

    @Transactional
    def insertSimple() {
        Student student = new Student(name: "nirav2").save(flush: true)
        render student
    }

    @ReadOnly
    def find() {
        render Student.list()
    }

}
