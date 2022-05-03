"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ContactpointSystem = void 0;
exports.ContactpointSystem = {
    Phone: "phone",
    Fax: "fax",
    Email: "email",
    Pager: "pager",
    Url: "url",
    Sms: "sms",
    Other: "other",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ContactpointSystem.Phone:
                return visitor.phone();
            case exports.ContactpointSystem.Fax:
                return visitor.fax();
            case exports.ContactpointSystem.Email:
                return visitor.email();
            case exports.ContactpointSystem.Pager:
                return visitor.pager();
            case exports.ContactpointSystem.Url:
                return visitor.url();
            case exports.ContactpointSystem.Sms:
                return visitor.sms();
            case exports.ContactpointSystem.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ContactpointSystem.js.map