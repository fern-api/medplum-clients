"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Plandefinition_actionCardinalitybehavior = void 0;
exports.Plandefinition_actionCardinalitybehavior = {
    Single: "single",
    Multiple: "multiple",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Plandefinition_actionCardinalitybehavior.Single:
                return visitor.single();
            case exports.Plandefinition_actionCardinalitybehavior.Multiple:
                return visitor.multiple();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Plandefinition_actionCardinalitybehavior.js.map