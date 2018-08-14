package chm

class FamilyTestController {

    def index() { }

    def createFamilyTest(){
        def child1 = new Child(name:"Kevin",birthdate: "18/4/2005",mobile: "0123456789")
        def child2 = new Child(name:"Kenzy",birthdate: "16/1/2007",mobile: "0123456789")
        def family= new Family(
                name:"Akram",
                spouse:"Rawda",
                address1: "10 Abdallah Abou El Seoud "
        )
    }
}
