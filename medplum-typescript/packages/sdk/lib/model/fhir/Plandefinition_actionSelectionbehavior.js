"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Plandefinition_actionSelectionbehavior = void 0;
exports.Plandefinition_actionSelectionbehavior = {
    Any: "any",
    All: "all",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Plandefinition_actionSelectionbehavior.Any:
                return visitor.any();
            case exports.Plandefinition_actionSelectionbehavior.All:
                return visitor.all();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Plandefinition_actionSelectionbehavior.js.map