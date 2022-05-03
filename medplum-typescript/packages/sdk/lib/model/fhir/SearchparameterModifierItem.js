"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SearchparameterModifierItem = void 0;
exports.SearchparameterModifierItem = {
    Missing: "missing",
    Exact: "exact",
    Contains: "contains",
    Not: "not",
    Text: "text",
    In: "in",
    Below: "below",
    Above: "above",
    Type: "type",
    Identifier: "identifier",
    OfType: "ofType",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.SearchparameterModifierItem.Missing:
                return visitor.missing();
            case exports.SearchparameterModifierItem.Exact:
                return visitor.exact();
            case exports.SearchparameterModifierItem.Contains:
                return visitor.contains();
            case exports.SearchparameterModifierItem.Not:
                return visitor.not();
            case exports.SearchparameterModifierItem.Text:
                return visitor.text();
            case exports.SearchparameterModifierItem.In:
                return visitor.in();
            case exports.SearchparameterModifierItem.Below:
                return visitor.below();
            case exports.SearchparameterModifierItem.Above:
                return visitor.above();
            case exports.SearchparameterModifierItem.Type:
                return visitor.type();
            case exports.SearchparameterModifierItem.Identifier:
                return visitor.identifier();
            case exports.SearchparameterModifierItem.OfType:
                return visitor.ofType();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=SearchparameterModifierItem.js.map