"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Plandefinition_actionRequiredbehavior = void 0;
exports.Plandefinition_actionRequiredbehavior = {
    Must: "must",
    Could: "could",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Plandefinition_actionRequiredbehavior.Must:
                return visitor.must();
            case exports.Plandefinition_actionRequiredbehavior.Could:
                return visitor.could();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Plandefinition_actionRequiredbehavior.js.map