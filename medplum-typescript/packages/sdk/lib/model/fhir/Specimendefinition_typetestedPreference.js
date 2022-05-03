"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Specimendefinition_typetestedPreference = void 0;
exports.Specimendefinition_typetestedPreference = {
    Preferred: "preferred",
    Alternate: "alternate",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Specimendefinition_typetestedPreference.Preferred:
                return visitor.preferred();
            case exports.Specimendefinition_typetestedPreference.Alternate:
                return visitor.alternate();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Specimendefinition_typetestedPreference.js.map