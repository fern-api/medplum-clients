"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.InvoiceStatus = void 0;
exports.InvoiceStatus = {
    Draft: "draft",
    Issued: "issued",
    Balanced: "balanced",
    Cancelled: "cancelled",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.InvoiceStatus.Draft:
                return visitor.draft();
            case exports.InvoiceStatus.Issued:
                return visitor.issued();
            case exports.InvoiceStatus.Balanced:
                return visitor.balanced();
            case exports.InvoiceStatus.Cancelled:
                return visitor.cancelled();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=InvoiceStatus.js.map