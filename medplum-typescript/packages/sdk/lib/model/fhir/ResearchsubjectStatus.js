"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ResearchsubjectStatus = void 0;
exports.ResearchsubjectStatus = {
    Candidate: "candidate",
    Eligible: "eligible",
    Ineligible: "ineligible",
    Screening: "screening",
    Withdrawn: "withdrawn",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ResearchsubjectStatus.Candidate:
                return visitor.candidate();
            case exports.ResearchsubjectStatus.Eligible:
                return visitor.eligible();
            case exports.ResearchsubjectStatus.Ineligible:
                return visitor.ineligible();
            case exports.ResearchsubjectStatus.Screening:
                return visitor.screening();
            case exports.ResearchsubjectStatus.Withdrawn:
                return visitor.withdrawn();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ResearchsubjectStatus.js.map