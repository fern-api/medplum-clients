export declare type ContactpointSystem = ContactpointSystem.Phone | ContactpointSystem.Fax | ContactpointSystem.Email | ContactpointSystem.Pager | ContactpointSystem.Url | ContactpointSystem.Sms | ContactpointSystem.Other;
export declare const ContactpointSystem: {
    Phone: ContactpointSystem.Phone;
    Fax: ContactpointSystem.Fax;
    Email: ContactpointSystem.Email;
    Pager: ContactpointSystem.Pager;
    Url: ContactpointSystem.Url;
    Sms: ContactpointSystem.Sms;
    Other: ContactpointSystem.Other;
    _visit: <Result>(value: ContactpointSystem, visitor: ContactpointSystem._Visitor<Result>) => Result;
};
export declare namespace ContactpointSystem {
    type Phone = "phone" & {
        __Phone: void;
    };
    type Fax = "fax" & {
        __Fax: void;
    };
    type Email = "email" & {
        __Email: void;
    };
    type Pager = "pager" & {
        __Pager: void;
    };
    type Url = "url" & {
        __Url: void;
    };
    type Sms = "sms" & {
        __Sms: void;
    };
    type Other = "other" & {
        __Other: void;
    };
    interface _Visitor<Result> {
        phone: () => Result;
        fax: () => Result;
        email: () => Result;
        pager: () => Result;
        url: () => Result;
        sms: () => Result;
        other: () => Result;
        _unknown: () => Result;
    }
}
