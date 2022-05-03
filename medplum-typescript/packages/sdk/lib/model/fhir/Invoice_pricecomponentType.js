"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Invoice_pricecomponentType = void 0;
exports.Invoice_pricecomponentType = {
    Base: "base",
    Surcharge: "surcharge",
    Deduction: "deduction",
    Discount: "discount",
    Tax: "tax",
    Informational: "informational",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Invoice_pricecomponentType.Base:
                return visitor.base();
            case exports.Invoice_pricecomponentType.Surcharge:
                return visitor.surcharge();
            case exports.Invoice_pricecomponentType.Deduction:
                return visitor.deduction();
            case exports.Invoice_pricecomponentType.Discount:
                return visitor.discount();
            case exports.Invoice_pricecomponentType.Tax:
                return visitor.tax();
            case exports.Invoice_pricecomponentType.Informational:
                return visitor.informational();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Invoice_pricecomponentType.js.map