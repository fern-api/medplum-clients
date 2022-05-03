export declare type Device_udicarrierEntrytype = Device_udicarrierEntrytype.Barcode | Device_udicarrierEntrytype.Rfid | Device_udicarrierEntrytype.Manual | Device_udicarrierEntrytype.Card;
export declare const Device_udicarrierEntrytype: {
    Barcode: Device_udicarrierEntrytype.Barcode;
    Rfid: Device_udicarrierEntrytype.Rfid;
    Manual: Device_udicarrierEntrytype.Manual;
    Card: Device_udicarrierEntrytype.Card;
    _visit: <Result>(value: Device_udicarrierEntrytype, visitor: Device_udicarrierEntrytype._Visitor<Result>) => Result;
};
export declare namespace Device_udicarrierEntrytype {
    type Barcode = "barcode" & {
        __Barcode: void;
    };
    type Rfid = "rfid" & {
        __Rfid: void;
    };
    type Manual = "manual" & {
        __Manual: void;
    };
    type Card = "card" & {
        __Card: void;
    };
    interface _Visitor<Result> {
        barcode: () => Result;
        rfid: () => Result;
        manual: () => Result;
        card: () => Result;
        _unknown: () => Result;
    }
}
