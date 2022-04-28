export type Questionnaire_itemType =
    | Questionnaire_itemType.Group
    | Questionnaire_itemType.Display
    | Questionnaire_itemType.Boolean
    | Questionnaire_itemType.Decimal
    | Questionnaire_itemType.Integer
    | Questionnaire_itemType.Date
    | Questionnaire_itemType.DateTime
    | Questionnaire_itemType.Time
    | Questionnaire_itemType.String
    | Questionnaire_itemType.Text
    | Questionnaire_itemType.Url
    | Questionnaire_itemType.Choice
    | Questionnaire_itemType.Attachment
    | Questionnaire_itemType.Reference
    | Questionnaire_itemType.Quantity;

export const Questionnaire_itemType = {
    Group: "group" as Questionnaire_itemType.Group,
    Display: "display" as Questionnaire_itemType.Display,
    Boolean: "boolean" as Questionnaire_itemType.Boolean,
    Decimal: "decimal" as Questionnaire_itemType.Decimal,
    Integer: "integer" as Questionnaire_itemType.Integer,
    Date: "date" as Questionnaire_itemType.Date,
    DateTime: "dateTime" as Questionnaire_itemType.DateTime,
    Time: "time" as Questionnaire_itemType.Time,
    String: "string" as Questionnaire_itemType.String,
    Text: "text" as Questionnaire_itemType.Text,
    Url: "url" as Questionnaire_itemType.Url,
    Choice: "choice" as Questionnaire_itemType.Choice,
    Attachment: "attachment" as Questionnaire_itemType.Attachment,
    Reference: "reference" as Questionnaire_itemType.Reference,
    Quantity: "quantity" as Questionnaire_itemType.Quantity,

    _visit: <Result>(value: Questionnaire_itemType, visitor: Questionnaire_itemType._Visitor<Result>): Result => {
        switch (value) {
            case Questionnaire_itemType.Group: return visitor.group();
            case Questionnaire_itemType.Display: return visitor.display();
            case Questionnaire_itemType.Boolean: return visitor.boolean();
            case Questionnaire_itemType.Decimal: return visitor.decimal();
            case Questionnaire_itemType.Integer: return visitor.integer();
            case Questionnaire_itemType.Date: return visitor.date();
            case Questionnaire_itemType.DateTime: return visitor.dateTime();
            case Questionnaire_itemType.Time: return visitor.time();
            case Questionnaire_itemType.String: return visitor.string();
            case Questionnaire_itemType.Text: return visitor.text();
            case Questionnaire_itemType.Url: return visitor.url();
            case Questionnaire_itemType.Choice: return visitor.choice();
            case Questionnaire_itemType.Attachment: return visitor.attachment();
            case Questionnaire_itemType.Reference: return visitor.reference();
            case Questionnaire_itemType.Quantity: return visitor.quantity();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Questionnaire_itemType {
    export type Group = "group" & {
        __Group: void,
    };
    export type Display = "display" & {
        __Display: void,
    };
    export type Boolean = "boolean" & {
        __Boolean: void,
    };
    export type Decimal = "decimal" & {
        __Decimal: void,
    };
    export type Integer = "integer" & {
        __Integer: void,
    };
    export type Date = "date" & {
        __Date: void,
    };
    export type DateTime = "dateTime" & {
        __DateTime: void,
    };
    export type Time = "time" & {
        __Time: void,
    };
    export type String = "string" & {
        __String: void,
    };
    export type Text = "text" & {
        __Text: void,
    };
    export type Url = "url" & {
        __Url: void,
    };
    export type Choice = "choice" & {
        __Choice: void,
    };
    export type Attachment = "attachment" & {
        __Attachment: void,
    };
    export type Reference = "reference" & {
        __Reference: void,
    };
    export type Quantity = "quantity" & {
        __Quantity: void,
    };

    export interface _Visitor<Result> {
        group: () => Result;
        display: () => Result;
        boolean: () => Result;
        decimal: () => Result;
        integer: () => Result;
        date: () => Result;
        dateTime: () => Result;
        time: () => Result;
        string: () => Result;
        text: () => Result;
        url: () => Result;
        choice: () => Result;
        attachment: () => Result;
        reference: () => Result;
        quantity: () => Result;
        _unknown: () => Result;
    }
}
