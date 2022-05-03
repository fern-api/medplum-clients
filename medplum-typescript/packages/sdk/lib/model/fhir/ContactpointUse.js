"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ContactpointUse = void 0;
exports.ContactpointUse = {
    Home: "home",
    Work: "work",
    Temp: "temp",
    Old: "old",
    Mobile: "mobile",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ContactpointUse.Home:
                return visitor.home();
            case exports.ContactpointUse.Work:
                return visitor.work();
            case exports.ContactpointUse.Temp:
                return visitor.temp();
            case exports.ContactpointUse.Old:
                return visitor.old();
            case exports.ContactpointUse.Mobile:
                return visitor.mobile();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ContactpointUse.js.map