"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Operationdefinition_parameterSearchtype = void 0;
exports.Operationdefinition_parameterSearchtype = {
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
            case exports.Operationdefinition_parameterSearchtype.Number:
                return visitor.number();
            case exports.Operationdefinition_parameterSearchtype.Date:
                return visitor.date();
            case exports.Operationdefinition_parameterSearchtype.String:
                return visitor.string();
            case exports.Operationdefinition_parameterSearchtype.Token:
                return visitor.token();
            case exports.Operationdefinition_parameterSearchtype.Reference:
                return visitor.reference();
            case exports.Operationdefinition_parameterSearchtype.Composite:
                return visitor.composite();
            case exports.Operationdefinition_parameterSearchtype.Quantity:
                return visitor.quantity();
            case exports.Operationdefinition_parameterSearchtype.Uri:
                return visitor.uri();
            case exports.Operationdefinition_parameterSearchtype.Special:
                return visitor.special();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Operationdefinition_parameterSearchtype.js.map