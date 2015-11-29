import Foundation

class ContainerTest : NSObject {
    override init() {
        let stringGeneric = Container<String>("Test")

        print(stringGeneric.object.characters.count)
        print(stringGeneric.getObjectClass())

        var list = [Int]()

        for i in 1...10 {
            list.append(i)
        }

        let listGeneric  = Container<Array<Int>>(list)

        print(listGeneric.object.count)
        print(listGeneric.getObjectClass())
    }
}
