"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Documentreference_relatestoCode = void 0;
exports.Documentreference_relatestoCode = {
    Replaces: "replaces",
    Transforms: "transforms",
    Signs: "signs",
    Appends: "appends",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Documentreference_relatestoCode.Replaces:
                return visitor.replaces();
            case exports.Documentreference_relatestoCode.Transforms:
                return visitor.transforms();
            case exports.Documentreference_relatestoCode.Signs:
                return visitor.signs();
            case exports.Documentreference_relatestoCode.Appends:
                return visitor.appends();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Documentreference_relatestoCode.js.map