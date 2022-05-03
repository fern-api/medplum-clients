"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Explanationofbenefit_processnoteType = void 0;
exports.Explanationofbenefit_processnoteType = {
    Display: "display",
    Print: "print",
    Printoper: "printoper",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Explanationofbenefit_processnoteType.Display:
                return visitor.display();
            case exports.Explanationofbenefit_processnoteType.Print:
                return visitor.print();
            case exports.Explanationofbenefit_processnoteType.Printoper:
                return visitor.printoper();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Explanationofbenefit_processnoteType.js.map