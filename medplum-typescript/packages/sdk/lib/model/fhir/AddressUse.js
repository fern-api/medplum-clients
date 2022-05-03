"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AddressUse = void 0;
exports.AddressUse = {
    Home: "home",
    Work: "work",
    Temp: "temp",
    Old: "old",
    Billing: "billing",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.AddressUse.Home:
                return visitor.home();
            case exports.AddressUse.Work:
                return visitor.work();
            case exports.AddressUse.Temp:
                return visitor.temp();
            case exports.AddressUse.Old:
                return visitor.old();
            case exports.AddressUse.Billing:
                return visitor.billing();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=AddressUse.js.map