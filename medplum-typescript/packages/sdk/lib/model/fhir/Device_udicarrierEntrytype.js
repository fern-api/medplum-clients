"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Device_udicarrierEntrytype = void 0;
exports.Device_udicarrierEntrytype = {
    Barcode: "barcode",
    Rfid: "rfid",
    Manual: "manual",
    Card: "card",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Device_udicarrierEntrytype.Barcode:
                return visitor.barcode();
            case exports.Device_udicarrierEntrytype.Rfid:
                return visitor.rfid();
            case exports.Device_udicarrierEntrytype.Manual:
                return visitor.manual();
            case exports.Device_udicarrierEntrytype.Card:
                return visitor.card();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Device_udicarrierEntrytype.js.map