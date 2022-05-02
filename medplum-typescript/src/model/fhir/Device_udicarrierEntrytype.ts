export type Device_udicarrierEntrytype =
    | Device_udicarrierEntrytype.Barcode
    | Device_udicarrierEntrytype.Rfid
    | Device_udicarrierEntrytype.Manual
    | Device_udicarrierEntrytype.Card;

export const Device_udicarrierEntrytype = {
    Barcode: "barcode" as Device_udicarrierEntrytype.Barcode,
    Rfid: "rfid" as Device_udicarrierEntrytype.Rfid,
    Manual: "manual" as Device_udicarrierEntrytype.Manual,
    Card: "card" as Device_udicarrierEntrytype.Card,

    _visit: <Result>(
        value: Device_udicarrierEntrytype,
        visitor: Device_udicarrierEntrytype._Visitor<Result>
    ): Result => {
        switch (value) {
            case Device_udicarrierEntrytype.Barcode:
                return visitor.barcode();
            case Device_udicarrierEntrytype.Rfid:
                return visitor.rfid();
            case Device_udicarrierEntrytype.Manual:
                return visitor.manual();
            case Device_udicarrierEntrytype.Card:
                return visitor.card();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Device_udicarrierEntrytype {
    export type Barcode = "barcode" & {
        __Barcode: void;
    };
    export type Rfid = "rfid" & {
        __Rfid: void;
    };
    export type Manual = "manual" & {
        __Manual: void;
    };
    export type Card = "card" & {
        __Card: void;
    };

    export interface _Visitor<Result> {
        barcode: () => Result;
        rfid: () => Result;
        manual: () => Result;
        card: () => Result;
        _unknown: () => Result;
    }
}
