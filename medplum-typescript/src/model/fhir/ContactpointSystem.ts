export type ContactpointSystem =
    | ContactpointSystem.Phone
    | ContactpointSystem.Fax
    | ContactpointSystem.Email
    | ContactpointSystem.Pager
    | ContactpointSystem.Url
    | ContactpointSystem.Sms
    | ContactpointSystem.Other;

export const ContactpointSystem = {
    Phone: "phone" as ContactpointSystem.Phone,
    Fax: "fax" as ContactpointSystem.Fax,
    Email: "email" as ContactpointSystem.Email,
    Pager: "pager" as ContactpointSystem.Pager,
    Url: "url" as ContactpointSystem.Url,
    Sms: "sms" as ContactpointSystem.Sms,
    Other: "other" as ContactpointSystem.Other,

    _visit: <Result>(
        value: ContactpointSystem,
        visitor: ContactpointSystem._Visitor<Result>
    ): Result => {
        switch (value) {
            case ContactpointSystem.Phone:
                return visitor.phone();
            case ContactpointSystem.Fax:
                return visitor.fax();
            case ContactpointSystem.Email:
                return visitor.email();
            case ContactpointSystem.Pager:
                return visitor.pager();
            case ContactpointSystem.Url:
                return visitor.url();
            case ContactpointSystem.Sms:
                return visitor.sms();
            case ContactpointSystem.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace ContactpointSystem {
    export type Phone = "phone" & {
        __Phone: void;
    };
    export type Fax = "fax" & {
        __Fax: void;
    };
    export type Email = "email" & {
        __Email: void;
    };
    export type Pager = "pager" & {
        __Pager: void;
    };
    export type Url = "url" & {
        __Url: void;
    };
    export type Sms = "sms" & {
        __Sms: void;
    };
    export type Other = "other" & {
        __Other: void;
    };

    export interface _Visitor<Result> {
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
