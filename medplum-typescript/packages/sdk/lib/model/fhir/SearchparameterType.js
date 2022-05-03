"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchparameterType = void 0;
exports.SearchparameterType = {
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
            case exports.SearchparameterType.Number:
                return visitor.number();
            case exports.SearchparameterType.Date:
                return visitor.date();
            case exports.SearchparameterType.String:
                return visitor.string();
            case exports.SearchparameterType.Token:
                return visitor.token();
            case exports.SearchparameterType.Reference:
                return visitor.reference();
            case exports.SearchparameterType.Composite:
                return visitor.composite();
            case exports.SearchparameterType.Quantity:
                return visitor.quantity();
            case exports.SearchparameterType.Uri:
                return visitor.uri();
            case exports.SearchparameterType.Special:
                return visitor.special();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=SearchparameterType.js.map