"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Paymentreconciliation_processnoteType = void 0;
exports.Paymentreconciliation_processnoteType = {
    Display: "display",
    Print: "print",
    Printoper: "printoper",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Paymentreconciliation_processnoteType.Display:
                return visitor.display();
            case exports.Paymentreconciliation_processnoteType.Print:
                return visitor.print();
            case exports.Paymentreconciliation_processnoteType.Printoper:
                return visitor.printoper();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Paymentreconciliation_processnoteType.js.map