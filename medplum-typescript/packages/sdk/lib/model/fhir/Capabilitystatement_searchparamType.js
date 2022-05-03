"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Capabilitystatement_searchparamType = void 0;
exports.Capabilitystatement_searchparamType = {
    Number: "number",
    Date: "date",
    String: "string",
    Token: "token",
    Reference: "reference",
    Composite: "composite",
    Quantity: "quantity",
    Uri: "uri",
    Special: "special",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Capabilitystatement_searchparamType.Number:
                return visitor.number();
            case exports.Capabilitystatement_searchparamType.Date:
                return visitor.date();
            case exports.Capabilitystatement_searchparamType.String:
                return visitor.string();
            case exports.Capabilitystatement_searchparamType.Token:
                return visitor.token();
            case exports.Capabilitystatement_searchparamType.Reference:
                return visitor.reference();
            case exports.Capabilitystatement_searchparamType.Composite:
                return visitor.composite();
            case exports.Capabilitystatement_searchparamType.Quantity:
                return visitor.quantity();
            case exports.Capabilitystatement_searchparamType.Uri:
                return visitor.uri();
            case exports.Capabilitystatement_searchparamType.Special:
                return visitor.special();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Capabilitystatement_searchparamType.js.map