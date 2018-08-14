package chm

class Family {
    String name
    String spouse
    String address1
    String address2
    int region1Id
    int region2Id
    String phone1
    String phone2
    String bloodType
    String sbloodType
    String mobile1
    String mobile2
    String smobile1
    String smobile2
    String job
    String sjob
    Date birthdate
    Date sbirthdate
    Date marriagedate
    String father
    String church
    String fatherPhone
    String sfather
    String schurch
    String sfatherPhone
    String donation
    String remarks

    static hasMany = [childs:Child]

    static constraints = {
        name(nullable: false)
        spouse(nullable: true)
        address1(nullable: false)
        address2(nullable: true)
        region1Id(nullable: true)
        region2Id(nullable: true)
        phone1(nullable: true)
        phone2(nullable: true)
        bloodType(nullable: true)
        sbloodType(nullable: true)
        mobile1(nullable: true)
        mobile2(nullable: true)
        smobile1(nullable: true)
        smobile2(nullable: true)
        job(nullable: true)
        sjob(nullable: true)
        birthdate(nullable: true)
        sbirthdate(nullable: true)
        marriagedate(nullable: true)
        father(nullable: true)
        church(nullable: true)
        fatherPhone(nullable: true)
        sfather(nullable: true)
        schurch(nullable: true)
        sfatherPhone(nullable: true)
        donation(nullable: true)
        remarks(nullable: true)

        childs(nullable: true)
    }
}
