import Foundation

class Container<T> : NSObject {
    var object : T

    func getObjectClass() -> String {
        return String(self.object.dynamicType)
    }

    init(_ obj : T) {
        self.object = obj

        super.init()
    }
}
