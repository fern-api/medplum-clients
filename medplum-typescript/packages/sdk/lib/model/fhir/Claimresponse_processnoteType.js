"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Claimresponse_processnoteType = void 0;
exports.Claimresponse_processnoteType = {
    Display: "display",
    Print: "print",
    Printoper: "printoper",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Claimresponse_processnoteType.Display:
                return visitor.display();
            case exports.Claimresponse_processnoteType.Print:
                return visitor.print();
            case exports.Claimresponse_processnoteType.Printoper:
                return visitor.printoper();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Claimresponse_processnoteType.js.map