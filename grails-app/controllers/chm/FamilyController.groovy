package chm

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class FamilyController {

    FamilyService familyService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond familyService.list(params), model:[familyCount: familyService.count()]
    }

    def show(Long id) {
        respond familyService.get(id)
    }

    def create() {
        respond new Family(params)
    }

    def save(Family family) {
        if (family == null) {
            notFound()
            return
        }

        try {
            familyService.save(family)
        } catch (ValidationException e) {
            respond family.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'family.label', default: 'Family'), family.id])
                redirect family
            }
            '*' { respond family, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond familyService.get(id)
    }

    def update(Family family) {
        if (family == null) {
            notFound()
            return
        }

        try {
            familyService.save(family)
        } catch (ValidationException e) {
            respond family.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'family.label', default: 'Family'), family.id])
                redirect family
            }
            '*'{ respond family, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        familyService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'family.label', default: 'Family'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'family.label', default: 'Family'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
