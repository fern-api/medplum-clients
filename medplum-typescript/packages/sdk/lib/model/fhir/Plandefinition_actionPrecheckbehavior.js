"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Plandefinition_actionPrecheckbehavior = void 0;
exports.Plandefinition_actionPrecheckbehavior = {
    Yes: "yes",
    No: "no",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Plandefinition_actionPrecheckbehavior.Yes:
                return visitor.yes();
            case exports.Plandefinition_actionPrecheckbehavior.No:
                return visitor.no();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Plandefinition_actionPrecheckbehavior.js.map