"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.QuestionnaireresponseStatus = void 0;
exports.QuestionnaireresponseStatus = {
    Completed: "completed",
    Amended: "amended",
    Stopped: "stopped",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.QuestionnaireresponseStatus.Completed:
                return visitor.completed();
            case exports.QuestionnaireresponseStatus.Amended:
                return visitor.amended();
            case exports.QuestionnaireresponseStatus.Stopped:
                return visitor.stopped();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=QuestionnaireresponseStatus.js.map