"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Codesystem_propertyType = void 0;
exports.Codesystem_propertyType = {
    Code: "code",
    Coding: "Coding",
    String: "string",
    Integer: "integer",
    Boolean: "boolean",
    DateTime: "dateTime",
    Decimal: "decimal",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Codesystem_propertyType.Code:
                return visitor.code();
            case exports.Codesystem_propertyType.Coding:
                return visitor.coding();
            case exports.Codesystem_propertyType.String:
                return visitor.string();
            case exports.Codesystem_propertyType.Integer:
                return visitor.integer();
            case exports.Codesystem_propertyType.Boolean:
                return visitor.boolean();
            case exports.Codesystem_propertyType.DateTime:
                return visitor.dateTime();
            case exports.Codesystem_propertyType.Decimal:
                return visitor.decimal();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Codesystem_propertyType.js.map