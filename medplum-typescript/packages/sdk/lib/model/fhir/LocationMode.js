"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.LocationMode = void 0;
exports.LocationMode = {
    Instance: "instance",
    Kind: "kind",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.LocationMode.Instance:
                return visitor.instance();
            case exports.LocationMode.Kind:
                return visitor.kind();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=LocationMode.js.map