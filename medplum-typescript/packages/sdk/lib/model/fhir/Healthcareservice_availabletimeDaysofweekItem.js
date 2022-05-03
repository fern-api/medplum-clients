"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Healthcareservice_availabletimeDaysofweekItem = void 0;
exports.Healthcareservice_availabletimeDaysofweekItem = {
    Mon: "mon",
    Tue: "tue",
    Wed: "wed",
    Thu: "thu",
    Fri: "fri",
    Sat: "sat",
    Sun: "sun",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Healthcareservice_availabletimeDaysofweekItem.Mon:
                return visitor.mon();
            case exports.Healthcareservice_availabletimeDaysofweekItem.Tue:
                return visitor.tue();
            case exports.Healthcareservice_availabletimeDaysofweekItem.Wed:
                return visitor.wed();
            case exports.Healthcareservice_availabletimeDaysofweekItem.Thu:
                return visitor.thu();
            case exports.Healthcareservice_availabletimeDaysofweekItem.Fri:
                return visitor.fri();
            case exports.Healthcareservice_availabletimeDaysofweekItem.Sat:
                return visitor.sat();
            case exports.Healthcareservice_availabletimeDaysofweekItem.Sun:
                return visitor.sun();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Healthcareservice_availabletimeDaysofweekItem.js.map